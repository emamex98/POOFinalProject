/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JLabel;
import javax.swing.JPanel;
//Clase de los paneles del horario, estos contienen cada materia
public class MicroPanelAgenda extends JPanel implements MouseListener{
	private JLabel lblMateria;
	private VentanaAltaMateria vam;
	private int numero;
	private Materia materia;
	private PanelAgenda panelAgenda;
	MicroPanelAgenda(int numero, PanelAgenda panelAgenda){
		super();
		this.materia=new Materia("",numero,Color.WHITE);
		this.numero=this.materia.getNumeroMateria();
		this.vam=new VentanaAltaMateria(this, panelAgenda);
		this.setPreferredSize(new Dimension(170,63));
		this.lblMateria = new JLabel();
		this.add(this.lblMateria);
		this.setPanelMateria();
		super.addMouseListener(this);
	}
	
	public void setPanelMateria(){
		lblMateria.setText(this.materia.getNombreMateria());
        this.setBackground(this.materia.getColorMateria());

	}
	
	public void setMateria(String materia,Color color){
		this.materia.setNombreMateria(materia);
		this.materia.setColorMateria(color);
		this.setPanelMateria();	
	
	}
	
	public String getMateria(){
		return this.lblMateria.getText();
	}
	
	
	public int getNum(){
		return this.numero;
	}
	
	public int getColor(){
		if(this.getBackground()==Color.RED){
			return 0;
		} else if (this.getBackground()==Color.GREEN){
			return 1;
		} else if (this.getBackground()==Color.ORANGE){
			return 2;
		} else if (this.getBackground()==Color.PINK){
			return 3;
		} else if (this.getBackground()==Color.YELLOW){
			return 4;
		} else if (this.getBackground()==Color.BLUE){
			return 5;
		} else {
			return 6;
		}
	}
	public void guardarSesion(){
		
	
	}
	
	public Materia getMaterias(){
		return this.materia;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(!(this.getBackground()==Color.WHITE)){
			if (e.getClickCount() == 2 && !e.isConsumed()) {
			     e.consume();
				this.vam.ventanaEditar(); 
			     this.vam.setVisible(true);
			    // this.panelAgenda.modificarLista(this.materia);
			    System.out.println("double clicked");
			  }
			  else if (e.getClickCount() == 1 && !e.isConsumed()){
				  System.out.println("Panel Presionado");
			}
		} else {
			this.vam.ventanaCrear();
			this.vam.setVisible(true);
			
		}
		
		
	}
	
	public void eliminarMateria(){
		this.panelAgenda.eliminarMateria(this.getNum());
	}
	
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {

		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
