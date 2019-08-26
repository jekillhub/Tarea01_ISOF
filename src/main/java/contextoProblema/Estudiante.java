package contextoProblema;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante {

	private Estado estado;
	private String nombre;
	private String rut;
	private ArrayList<Date> registroAsistencia;

	public Estudiante(String nombre, String rut) {
		this.estado = new NoRegistrado();
		this.nombre = nombre;
		this.rut = rut;
		this.registroAsistencia = new ArrayList<Date>();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public ArrayList<Date> getRegistroAsistencia() {
		return registroAsistencia;
	}

	public void setRegistroAsistencia(ArrayList<Date> registroAsistencia) {
		this.registroAsistencia = registroAsistencia;
	}

	public String mostrarRegistroAsistencia(){
		String retorno = "";
		if(this.registroAsistencia.size() >=1){
			for(int i=0; i< this.registroAsistencia.size();i++){
				retorno += this.registroAsistencia.get(i) + "\n";
			}
		}
		else{
			retorno = "No hay asistencias registradas";
		}
		return retorno;
	}
}