import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements MouseListener {
	
	private Agenda panelAgenda;
	private Asignaturas panelAsignaturas;
	
	private JPanel menuPrincipal;
	
	private Agenda agenda;
	private Asignaturas asignaturas;
	private CalculadoraMeta calificaciones;
	
	private JButton btAgenda,
					btTareas,
					btCalificaciones;
	
	public Ventana(){
		super("Agenda Estudiante");
		
		// Inicializa ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);	
		
		// Inicializa panel de menuPrincipal
		this.menuPrincipal = new JPanel();
		this.menuPrincipal.setPreferredSize(new Dimension(1000,65));
		this.menuPrincipal.setBackground(new Color(216,216,216));
		
		// Inicializa y configura componentes del menu principal
		this.btAgenda = new JButton("Agenda Semanal");
		this.btAgenda.setPreferredSize(new Dimension(160,50));
		this.btAgenda.addMouseListener(this);
		
		this.btTareas = new JButton("Tareas");
		this.btTareas.setPreferredSize(new Dimension(160,50));
		this.btTareas.addMouseListener(this);
		
		this.btCalificaciones = new JButton("Calificaciones");
		this.btCalificaciones.setPreferredSize(new Dimension(160,50));
		this.btCalificaciones.addMouseListener(this);
		
		// Agrega componentes al menu principal
		this.menuPrincipal.add(this.btAgenda);
		this.menuPrincipal.add(this.btTareas);
		this.menuPrincipal.add(this.btCalificaciones);
		
		// Inicializa las tres secciones del programa
		this.agenda = new Agenda();
		this.asignaturas = new Asignaturas();
		this.calificaciones = new CalculadoraMeta();
		
		// Agrega componentes a la ventana
		this.add(this.menuPrincipal, BorderLayout.NORTH);
		this.add(this.agenda, BorderLayout.CENTER);
		this.add(this.asignaturas, BorderLayout.SOUTH);
		this.add(this.calificaciones, BorderLayout.WEST);
		
		// Esconde las secciones de asignaturas y calificaciones, que se activan con los mouse events
		this.asignaturas.setVisible(false);
		this.calificaciones.setVisible(false);
		
		this.pack();
		
	}
	
	public static void main(String[] Args){
		new Ventana();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.btAgenda){
			this.agenda.setVisible(true);
			this.asignaturas.setVisible(false);
			this.calificaciones.setVisible(false);
		}
		else if (e.getSource() == this.btTareas){
			this.agenda.setVisible(false);
			this.asignaturas.setVisible(true);
			this.calificaciones.setVisible(false);
		}
		else if (e.getSource() == this.btCalificaciones){
			this.agenda.setVisible(false);
			this.asignaturas.setVisible(false);
			this.calificaciones.setVisible(true);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
