/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

public class Tarea {
	
	private String nombreTarea,
				   fechaLimite,
				   nombreMateria;
	
	private boolean terminada;
	
	public Tarea(){
		this.setAllNull();
	}
	
	// Setters
	public void setNombreTarea(String nombreTarea){
		this.nombreTarea = nombreTarea;
	}
	
	public void setFechaLimite(String fechaLimite){
		this.fechaLimite = fechaLimite;	
	}
	
	public void setCompletar(boolean terminada){
		this.terminada = terminada;
	}
	
	public void setNombreMateria(String nombreMateria){
		this.nombreMateria = nombreMateria;
	}
	
	public void setAllNull(){
		this.nombreTarea = null;
		this.fechaLimite = null;
		this.nombreMateria = null;
		this.terminada = false;
	}

	// Getters
	public String getNombreTarea(){
		return this.nombreTarea;
	}
	
	public String getFechaLimite(){
		return this.fechaLimite;	
	}
	
	public boolean getCompletar(){
		return this.terminada;
	}
	
	public String getNombreMateria(){
		return this.nombreMateria;
	}
	
}
