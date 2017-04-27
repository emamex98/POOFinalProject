/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Asignaturas extends JPanel implements ActionListener{
	
	private JPanel panelAgregar,
				   panelLista,
				   columnaCB,
				   columnaNombre,
				   columnaFecha,
				   columnaMateria;
	
	private JCheckBox[] cbTareas;
	
	private JLabel[] nombresTareas,
					 fechasTareas,
					 nombreMaterias;
	
	private Tarea[] listaTareas;
	
	private JTextField tfNombreTarea,
					   tfFechaLimite,
					   tfMateria;
	
	private JButton btAgregar,
					btActualizar;
	
	private int asignaturasActivas;
	
	private JLabel mensaje;
	
	public Asignaturas(){
		
		// Inicializa panel
		super(new BorderLayout());
		this.setPreferredSize(new Dimension(1050,600));
		
		this.panelAgregar = new JPanel();
		this.panelAgregar.setPreferredSize(new Dimension(300,600));
		this.panelAgregar.setBackground(new Color(238,238,238));
		this.panelAgregar.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.panelAgregar.setBorder(BorderFactory.createEmptyBorder(10,20,10,10));
		
		this.panelLista = new JPanel();
		this.panelLista.setPreferredSize(new Dimension(750,600));
		this.panelLista.setBackground(new Color(255,255,255));
		this.panelLista.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.columnaCB = new JPanel();
		this.columnaCB.setPreferredSize(new Dimension(40,580));
		this.columnaCB.setBackground(new Color(255,255,255));
		this.columnaCB.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.columnaCB.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		
		this.columnaNombre = new JPanel();
		this.columnaNombre.setPreferredSize(new Dimension(225,580));
		this.columnaNombre.setBackground(new Color(255,255,255));
		this.columnaNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.columnaNombre.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		this.columnaFecha = new JPanel();
		this.columnaFecha.setPreferredSize(new Dimension(225,580));
		this.columnaFecha.setBackground(new Color(255,255,255));
		this.columnaFecha.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.columnaFecha.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		this.columnaMateria = new JPanel();
		this.columnaMateria.setPreferredSize(new Dimension(225,580));
		this.columnaMateria.setBackground(new Color(255,255,255));
		this.columnaMateria.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.columnaMateria.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		/* Inicializa los arreglos de checkboxes y tareas
		 * Cada indice del arreglo checkbox corresponde al mismo indice del arreglo tarea */
		this.cbTareas = new JCheckBox[15];
		this.listaTareas = new Tarea[15];
		this.nombresTareas = new JLabel[15];
		this.fechasTareas = new JLabel[15];
		this.nombreMaterias = new JLabel[15];
		
		for(int i=0; i<this.listaTareas.length; i++){
			this.cbTareas[i] = new JCheckBox();
			this.listaTareas[i] = new Tarea();
			this.nombresTareas[i] = new JLabel("");
			this.fechasTareas[i] = new JLabel("");
			this.nombreMaterias[i] = new JLabel("");
		}
		
		this.asignaturasActivas = 0;
		
		// Inicializa los componentes de panelAgregar
		this.tfNombreTarea = new JTextField(20);
		this.tfFechaLimite = new JTextField(20);
		this.tfMateria = new JTextField(20);
		this.mensaje = new JLabel("");
		
		// Boton agregar
		this.btAgregar = new JButton("Agregar");
		this.btAgregar.setPreferredSize(new Dimension(255,40));
		this.btAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String emptySpace = "                           ";
				for(int i=0; i<Asignaturas.this.listaTareas.length; i++){
					if(Asignaturas.this.listaTareas[i].getNombreTarea() == null){
						Asignaturas.this.listaTareas[i].setNombreTarea(Asignaturas.this.tfNombreTarea.getText());
						Asignaturas.this.nombresTareas[i].setText(Asignaturas.this.listaTareas[i].getNombreTarea() + emptySpace);						
						Asignaturas.this.listaTareas[i].setFechaLimite(Asignaturas.this.tfFechaLimite.getText());
						Asignaturas.this.fechasTareas[i].setText(Asignaturas.this.listaTareas[i].getFechaLimite() + emptySpace);						
						Asignaturas.this.listaTareas[i].setNombreMateria(Asignaturas.this.tfMateria.getText());
						Asignaturas.this.nombreMaterias[i].setText(Asignaturas.this.listaTareas[i].getNombreMateria() + emptySpace);
						Asignaturas.this.listaTareas[i].setCompletar(false);
						Asignaturas.this.asignaturasActivas++;
						break;
					}
				}
				
				Asignaturas.this.imprimeTareas();
				Asignaturas.this.checkLimite();
				Asignaturas.this.guardarSesion(Asignaturas.this.listaTareas);
			}
		});
		
		// Buton descartar
		this.btActualizar = new JButton("Descartar Tareas Terminadas");
		this.btActualizar.setPreferredSize(new Dimension(255,45));
		this.btActualizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i=0; i<Asignaturas.this.listaTareas.length; i++){
					if(Asignaturas.this.cbTareas[i].isSelected() == true){
						Asignaturas.this.listaTareas[i].setAllNull();
						Asignaturas.this.nombresTareas[i].setText("");
						Asignaturas.this.fechasTareas[i].setText("");
						Asignaturas.this.nombreMaterias[i].setText("");
						Asignaturas.this.asignaturasActivas--;
					}
					
				}
				Asignaturas.this.reacomodar();
				Asignaturas.this.imprimeTareas();
				Asignaturas.this.checkLimite();
				Asignaturas.this.guardarSesion(Asignaturas.this.listaTareas);
			}
		});
		
		
		// Agrega componentes a panelAgregar
		this.panelAgregar.add(new JLabel("<html><b> AGREGAR NUEVA TAREA:</b></html>"));
		this.panelAgregar.add(new JLabel("                                                     "));
		
		this.panelAgregar.add(new JLabel(" Tarea:           "));
		this.panelAgregar.add(this.tfNombreTarea);
		this.panelAgregar.add(new JLabel(" Fecha de Entrega:"));
		this.panelAgregar.add(this.tfFechaLimite);
		this.panelAgregar.add(new JLabel(" Materia:"));
		this.panelAgregar.add(this.tfMateria);
		this.panelAgregar.add(new JLabel("       "));
		this.panelAgregar.add(this.btAgregar);
		
		this.panelAgregar.add(new JLabel("                                        "));
		this.panelAgregar.add(new JLabel("                                        "));
		
		this.panelAgregar.add(new JLabel("<html><b> ADMINISTRAR TAREAS:</b></html>"));
		this.panelAgregar.add(new JLabel("                                        "));
		this.panelAgregar.add(this.btActualizar);
		this.panelAgregar.add(new JLabel("                                        "));
		this.panelAgregar.add(mensaje);
				
		// Agrega componentes a panelLista
		this.panelLista.add(this.columnaCB);
		this.panelLista.add(this.columnaNombre);
		this.panelLista.add(this.columnaFecha);
		this.panelLista.add(this.columnaMateria);
		
		this.columnaCB.add(new JLabel("    "));
		this.columnaNombre.add(new JLabel("NOMBRE DE TAREA                          "));
		this.columnaFecha.add(new JLabel("FECHA DE ENTREGA                          "));
		this.columnaMateria.add(new JLabel("MATERIA                                 "));
		
		for(int i=0; i<this.listaTareas.length; i++){
			this.columnaCB.add(this.cbTareas[i]);
			this.cbTareas[i].setVisible(false);
			this.columnaNombre.add(this.nombresTareas[i]);
			this.nombresTareas[i].setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
			this.nombresTareas[i].setVisible(false);
			this.columnaFecha.add(this.fechasTareas[i]);
			this.fechasTareas[i].setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
			this.fechasTareas[i].setVisible(false);
			this.columnaMateria.add(this.nombreMaterias[i]);
			this.nombreMaterias[i].setBorder(BorderFactory.createEmptyBorder(0,0,7,0));
			this.nombreMaterias[i].setVisible(false);
		}
		
		// Agregar componentes a paneles
		this.add(this.panelAgregar, BorderLayout.WEST);
		this.add(this.panelLista, BorderLayout.EAST);
		
		this.cargaSesion();
		
	}
	
	// Metodo para imprimir tareas
	public void imprimeTareas(){
		for(int i=0; i<this.listaTareas.length; i++){
			if(this.listaTareas[i].getNombreTarea() != null){
				this.cbTareas[i].setSelected(this.listaTareas[i].getCompletar());
				this.cbTareas[i].setVisible(true);
				this.nombresTareas[i].setVisible(true);
				this.fechasTareas[i].setVisible(true);
				this.nombreMaterias[i].setVisible(true);
			}
			else{
				this.cbTareas[i].setVisible(false);
				this.nombresTareas[i].setVisible(false);
				this.fechasTareas[i].setVisible(false);
				this.nombreMaterias[i].setVisible(false);
			}
		}
		this.validate();
	}
	
	// Metodo para checar limite
	public void checkLimite(){
		if(this.asignaturasActivas > (this.listaTareas.length-1)) {
			this.tfNombreTarea.setEnabled(false);
			this.tfFechaLimite.setEnabled(false);;
			this.tfMateria.setEnabled(false);
			this.btAgregar.setEnabled(false);
			this.mensaje.setText("Woah! Demasiadas tareas a la vez.");
		}
		else {
			this.tfNombreTarea.setEnabled(true);
			this.tfFechaLimite.setEnabled(true);;
			this.tfMateria.setEnabled(true);
			this.btAgregar.setEnabled(true);
			this.mensaje.setText("");
		}
	}
	
	// Metodo para ordenar elementos (utiliza mecanismo bubble)
	public void reacomodar(){
		String emptySpace = "                           ";
		for(int i=0; i<this.listaTareas.length; i++){
			if(i<(this.listaTareas.length-1) && Asignaturas.this.listaTareas[i].getNombreTarea() == null && Asignaturas.this.listaTareas[i+1].getNombreTarea() != null){
				Asignaturas.this.listaTareas[i].setNombreTarea(Asignaturas.this.listaTareas[i+1].getNombreTarea());
				Asignaturas.this.nombresTareas[i].setText(Asignaturas.this.listaTareas[i].getNombreTarea() + emptySpace);
				
				Asignaturas.this.listaTareas[i].setFechaLimite(Asignaturas.this.listaTareas[i+1].getFechaLimite());
				Asignaturas.this.fechasTareas[i].setText(Asignaturas.this.listaTareas[i].getFechaLimite() + emptySpace);
				
				Asignaturas.this.listaTareas[i].setNombreMateria(Asignaturas.this.listaTareas[i+1].getNombreMateria());
				Asignaturas.this.nombreMaterias[i].setText(Asignaturas.this.listaTareas[i].getNombreMateria() + emptySpace);
				
				Asignaturas.this.listaTareas[i+1].setAllNull();
				
				Asignaturas.this.nombresTareas[i+1].setText("");
				Asignaturas.this.fechasTareas[i+1].setText("");
				Asignaturas.this.nombreMaterias[i+1].setText("");
				
				
			}
		}
	}
	
	// Metodo para guardar las tareas de la sesion actual
	public void guardarSesion(Tarea[] listaTareas){		
			try {
				PrintWriter copiaTareas = new PrintWriter(new FileWriter("logTareas.txt"));
				
				for(int i=0; i<listaTareas.length; i++){
					if(listaTareas[i].getNombreTarea() != null){
						copiaTareas.println(listaTareas[i].getNombreTarea() + "," + listaTareas[i].getFechaLimite() + "," + listaTareas[i].getNombreMateria() + ",");
					}
				}
				copiaTareas.println("*END*,");
				copiaTareas.close();
			}
			catch (FileNotFoundException e1) {}
			catch (IOException e2) {}	
	}
	
	// Metodo para cargar las tareas de la sesion anterior
	public void cargaSesion(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("logTareas.txt"));
			
			String linea = "";
			String acumulador = "";
			int cuentaLineas = 0;

		      while(linea != null){		        
		        linea = br.readLine();
		        acumulador += linea;
		        cuentaLineas++;
		      }
		      
		      br.close();
		      System.out.println(acumulador);
		      
			
			StringTokenizer st = new StringTokenizer(acumulador, ",");
			String tmp = "",
				   emptySpace = "                           ";;
			
			for(int i=0; i<cuentaLineas; i++){
				tmp = st.nextToken();
				if(tmp.equals("*END*")){
					break;
				}
				this.listaTareas[i].setNombreTarea(tmp);
				this.nombresTareas[i].setText(Asignaturas.this.listaTareas[i].getNombreTarea() + emptySpace);
				tmp = st.nextToken();
				this.listaTareas[i].setFechaLimite(tmp);
				this.fechasTareas[i].setText(Asignaturas.this.listaTareas[i].getFechaLimite() + emptySpace);
				tmp = st.nextToken();
				this.listaTareas[i].setNombreMateria(tmp);
				this.nombreMaterias[i].setText(Asignaturas.this.listaTareas[i].getNombreMateria() + emptySpace);
				this.asignaturasActivas++;
			}
			
			this.imprimeTareas();
		}
		catch (FileNotFoundException e1) {}
		catch (IOException e2) {}	
		catch (NoSuchElementException e3) { System.out.println("Exception!"); }

	}

	@Override
	public void actionPerformed(ActionEvent e) {}

}
