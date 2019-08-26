package contextoProblema;

import interfazUsuario.VentanaQR;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public abstract class Estado {

	public abstract void registrar(Estudiante estudiante);

	public abstract String mostrarEstado();

	public static boolean validarQR(String ruta){
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			System.out.println("Código QR no válido");
			return false;
		}
		else{
			VentanaQR.mostrarVentana(ruta);
			return true;
		}
	}
}