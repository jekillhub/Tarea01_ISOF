package interfazUsuario;

import javax.swing.*;
import java.awt.event.*;


public class VentanaQR extends JFrame {
    ImageIcon imagen;
    JLabel etiqueta;

    public VentanaQR(String ruta){
        super("Codigo QR");
        this.imagen = new ImageIcon(ruta);
        this.etiqueta = new JLabel(imagen);
        getContentPane().add(etiqueta);
        this.setSize(500, 500);
    }

    public static void mostrarVentana(String ruta){
        VentanaQR p = new VentanaQR(ruta);
        p.setVisible(true);
        p.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
    }
}
