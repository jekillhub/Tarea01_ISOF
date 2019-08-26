package contextoProblema;

public class Registrado extends Estado {

	@Override
	public void registrar(Estudiante estudiante) {
		System.out.println("El alumno ya se encuentra registrado");
	}

	@Override
	public String mostrarEstado() {
		return "Estudiante registrado";
	}

}