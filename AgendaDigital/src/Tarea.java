
public class Tarea {
	
	private String nombreTarea,
				   fechaLimite;
	
	private Materia nombreMateria;
	
	private boolean terminada;
	
	public Tarea(){
		this.setAllNull();
	}

	public Tarea(String nombreTarea, String fechaLimite){ // Materia nombreMateria{
		this.nombreTarea = nombreTarea;
		this.fechaLimite = fechaLimite;
		//this.nombreMateria = nombreMateria;
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
	
	public void setAllNull(){
		this.nombreTarea = null;
		this.fechaLimite = null;
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
	
}
