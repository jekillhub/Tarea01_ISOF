package interfazUsuario;

import contextoProblema.Estado;
import contextoProblema.Estudiante;

import java.util.Scanner;

import static qr.GeneradorQR.generadorImagen;

public class InterfazUsuario {

	Estudiante estudiante;
	String ruta;

	public InterfazUsuario() {
		this.estudiante = new Estudiante("Juan Soto","20089210-K");
		this.ruta = "codigo.png";
	}

	public void guardarCodigo() {
		generadorImagen("This is my first QR Code", 500, 500, this.ruta);
	}

	public boolean tomarFoto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la ruta del código QR");
		boolean condicion;
		do {
			String ruta = scanner.nextLine();
			condicion = Estado.validarQR(ruta);
		}
		while(!condicion);
		return true;
	}

	public void ingresarRegistro(){
		if(tomarFoto()){
			this.estudiante.getEstado().registrar(this.estudiante);
		}
	}

	public void menuPrincipal(){
		guardarCodigo();
		System.out.println("Bienvenido " + this.estudiante.getNombre());
		System.out.println("Seleccione una de las siguientes opciones.");
		System.out.println("1. Mostrar código QR");
		System.out.println("2. Ingresar asistencia");
		System.out.println("3. Ver estado actual del estudiante");
		System.out.println("4. Ver registro histórico");
		System.out.println("5. Salir");
		int indice = 0;

		Scanner scanner = new Scanner(System.in);
		indice = scanner.nextInt();
		while(indice<1 || indice>5) {
			switch (indice) {
				case 1:
					VentanaQR.mostrarVentana(this.ruta);
					break;
				case 2:
					ingresarRegistro();
					break;
				case 3:
					System.out.println(this.estudiante.getEstado().mostrarEstado());
					break;
				case 4:
					System.out.println(this.estudiante.mostrarRegistroAsistencia());
					break;
				case 5:
					break;
				default:
					break;
			}
		}
	}

}