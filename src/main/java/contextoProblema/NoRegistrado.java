package contextoProblema;

import java.util.Date;

public class NoRegistrado extends Estado {

	@Override
	public void registrar(Estudiante estudiante) {
			Date fecha = new Date();
			estudiante.getRegistroAsistencia().add(fecha);
			estudiante.setEstado(new Registrado());
	}

	@Override
	public String mostrarEstado() {
		return "Estudiante no registrado";
	}

}