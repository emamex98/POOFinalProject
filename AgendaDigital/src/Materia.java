/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

public class Materia {
	
	private String nombreMateria;
	
	public Materia(){
		this.nombreMateria = "";
	}
	
	public void setNombreMateria(String nombreMateria){
		this.nombreMateria = nombreMateria;
	}
	
	public String getNombreMateria(){
		return this.nombreMateria;
	}

}
