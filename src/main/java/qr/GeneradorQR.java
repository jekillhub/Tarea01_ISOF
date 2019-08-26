package qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class GeneradorQR {

	/**
	 * 
	 * @param texto
	 * @param alto
	 * @param ancho
	 * @param textoRuta
	 */
	public static void generadorImagen(String texto, int alto, int ancho, String textoRuta) {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = null;

		try {
			bitMatrix = qrCodeWriter.encode(texto, BarcodeFormat.QR_CODE, ancho, alto);
		} catch (WriterException e) {
			e.printStackTrace();
		}

		Path ruta = FileSystems.getDefault().getPath(textoRuta);
		try {
			MatrixToImageWriter.writeToPath(bitMatrix, "PNG", ruta);
			System.out.println("Imagen guardada en: " + textoRuta);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}