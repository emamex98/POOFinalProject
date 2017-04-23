import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
//Clase de los paneles del horario, estos contienen cada materia
public class MicroPanelAgenda extends JPanel implements MouseListener{
	private JLabel lblMateria;
	MicroPanelAgenda(){
		super();
		this.setPreferredSize(new Dimension(170,63));
		this.lblMateria = new JLabel("");
		this.setBackground(Color.WHITE);
		this.add(this.lblMateria);
		super.addMouseListener(this);
	}
	
	public void setMateria(String materia){
		lblMateria.setText(materia);
        this.setBackground(Color.BLACK);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
			  if (arg0.getClickCount() == 2) {
			    System.out.println("double clicked");
			  }
			  else{
				  //System.out.println("Panel Presionado");
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
