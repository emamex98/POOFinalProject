import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Asignaturas extends JPanel implements ActionListener{
	
	private JPanel panelAgregar,
				   panelLista;
	
	private JCheckBox[] cbTareas;
	
	private JLabel[] nombresTareas;
	
	private Tarea[] listaTareas;
	
	private JTextField tfNombreTarea,
					   tfFechaLimite,
					   tfMateria;
	
	private JButton btAgregar,
					btActualizar;
	
	private int asignaturasActivas;
	
	
	public Asignaturas(){
		
		// Inicializa panel
		super(new BorderLayout());
		this.setPreferredSize(new Dimension(1050,600));
		this.setBackground(new Color(255,255,255));
		
		this.panelAgregar = new JPanel();
		this.panelAgregar.setPreferredSize(new Dimension(400,600));
		this.panelAgregar.setBackground(new Color(216,216,216));
		
		this.panelLista = new JPanel();
		this.panelLista.setPreferredSize(new Dimension(650,600));
		
		/* Inicializa los arreglos de checkboxes y tareas
		 * Cada indice del arreglo checkbox corresponde al mismo indice del arreglo tarea */
		this.cbTareas = new JCheckBox[20];
		this.listaTareas = new Tarea[20];
		this.nombresTareas = new JLabel[20];
		
		for(int i=0; i<this.listaTareas.length; i++){
			this.cbTareas[i] = new JCheckBox();
			this.listaTareas[i] = new Tarea();
			this.nombresTareas[i] = new JLabel("");
		}
		
		this.asignaturasActivas = 0;
		
		// Inicializa los componentes de panelAgregar
		this.tfNombreTarea = new JTextField("Nombre",20);
		this.tfFechaLimite = new JTextField("Fecha",20);
		this.tfMateria = new JTextField("Materia",20);
		
		// Boton agregar
		this.btAgregar = new JButton("Agregar");
		this.btAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i=0; i<Asignaturas.this.listaTareas.length; i++){
					if(Asignaturas.this.listaTareas[i].getNombreTarea() == null){
						Asignaturas.this.listaTareas[i].setNombreTarea(Asignaturas.this.tfNombreTarea.getText());
						Asignaturas.this.nombresTareas[i].setText(Asignaturas.this.listaTareas[i].getNombreTarea());
						Asignaturas.this.listaTareas[i].setCompletar(false);
						Asignaturas.this.asignaturasActivas++;
						break;
					}
				}
				
				Asignaturas.this.imprimeTareas();
				checkLimite();
			}
		});
		
		// Buton descartar
		this.btActualizar = new JButton("Descartar Tareas Terminadas");
		this.btActualizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i=0; i<Asignaturas.this.listaTareas.length; i++){
					if(Asignaturas.this.cbTareas[i].isSelected() == true){
						Asignaturas.this.listaTareas[i].setAllNull();
						Asignaturas.this.nombresTareas[i].setText("");
						Asignaturas.this.asignaturasActivas--;
					}
					
					if(i<19 && Asignaturas.this.listaTareas[i].getNombreTarea() == null && Asignaturas.this.listaTareas[i+1].getNombreTarea() != null){
						Asignaturas.this.listaTareas[i].setNombreTarea(Asignaturas.this.listaTareas[i+1].getNombreTarea());
						Asignaturas.this.nombresTareas[i].setText(Asignaturas.this.listaTareas[i].getNombreTarea());
						Asignaturas.this.listaTareas[i+1].setAllNull();
						Asignaturas.this.nombresTareas[i+1].setText("");
					}
				}
				
				Asignaturas.this.imprimeTareas();
				checkLimite();
			}
		});
		
		// Agrega componentes a panelAgregar
		this.panelAgregar.add(this.tfNombreTarea);
		this.panelAgregar.add(this.tfFechaLimite);
		this.panelAgregar.add(this.tfMateria);
		this.panelAgregar.add(this.btAgregar);
		this.panelAgregar.add(this.btActualizar);
				
		// Agrega componentes a panelLista
		this.panelLista.add(new JLabel("Tareas Pendientes:"));
		
		for(int i=0; i<this.listaTareas.length; i++){
			this.panelLista.add(this.cbTareas[i]);
			this.cbTareas[i].setVisible(false);
			this.panelLista.add(this.nombresTareas[i]);
			this.nombresTareas[i].setVisible(false);
		}
		
		// Agregar componentes a paneles
		this.add(this.panelAgregar, BorderLayout.WEST);
		this.add(this.panelLista, BorderLayout.EAST);
		
	}
	
	public void imprimeTareas(){
		for(int i=0; i<this.listaTareas.length; i++){
			if(this.listaTareas[i].getNombreTarea() != null){
				this.cbTareas[i].setSelected(this.listaTareas[i].getCompletar());
				this.cbTareas[i].setVisible(true);
				this.nombresTareas[i].setVisible(true);
			}
			else{
				this.cbTareas[i].setVisible(false);
				this.nombresTareas[i].setVisible(false);
			}
		}
		this.validate();
	}
	
	public void checkLimite(){
		if(this.asignaturasActivas > 19) {
			this.tfNombreTarea.setEnabled(false);
			this.tfFechaLimite.setEnabled(false);;
			this.tfMateria.setEnabled(false);
			this.btAgregar.setEnabled(false);
		}
		else {
			this.tfNombreTarea.setEnabled(true);
			this.tfFechaLimite.setEnabled(true);;
			this.tfMateria.setEnabled(true);
			this.btAgregar.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
