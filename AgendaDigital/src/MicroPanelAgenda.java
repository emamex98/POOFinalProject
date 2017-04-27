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
	MicroPanelAgenda(){
		super();
		this.vam=new VentanaAltaMateria(this);
		this.setPreferredSize(new Dimension(170,63));
		this.lblMateria = new JLabel("");
		this.setBackground(Color.WHITE);
		this.add(this.lblMateria);
		super.addMouseListener(this);
	}
	
	public void setMateria(String materia,Color color){
		lblMateria.setText(materia);
        this.setBackground(color);
        
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2 && !e.isConsumed()) {
			     e.consume();
			     this.vam.setVisible(true);
			    System.out.println("double clicked");
			  }
			  else if (e.getClickCount() == 1 && !e.isConsumed()){
				  System.out.println("Panel Presionado");
			}
		
		
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
