/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class VentanaAltaMateria extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfMateria;
	private ButtonGroup bt;
	private JButton btnAtras,
					btnCrear,
					btnEliminar;
	private JRadioButton rdbtnVerde,
						 rdbtnAmarillo,
						 rdbtnRojo,
						 rdbtnAzul,
						 rdbtnRosa,
						 rdbtnNaranja;
	private MicroPanelAgenda mpa;
	private PanelAgenda pa;
	private JLabel lblNuevaMateria;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	//Editora micropaneles contenedores de cada materia
	//Ventana que pude los datos 
	public VentanaAltaMateria(MicroPanelAgenda mpa, PanelAgenda pa) {
		
			setTitle("Nueva Materia");
			this.mpa=mpa;
			this.pa=pa;
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setAlwaysOnTop(true);
			setBounds(100, 100, 450, 334);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			this.btnAtras = new JButton("Atr\u00E1s");
			this.btnAtras.setBounds(81, 212, 89, 23);
			panel.add(this.btnAtras);
			this.btnAtras.addActionListener(this);
			
			
			this.btnCrear = new JButton("Crear");
			this.btnCrear.setBounds(254, 212, 89, 23);
			panel.add(this.btnCrear);
			this.btnCrear.addActionListener(this);
			
			this.lblNuevaMateria = new JLabel("Nueva Materia");
			lblNuevaMateria.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNuevaMateria.setBounds(161, 11, 121, 14);
			panel.add(lblNuevaMateria);
			
			tfMateria = new JTextField();
			tfMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
			tfMateria.setBounds(122, 36, 231, 20);
			panel.add(tfMateria);
			tfMateria.setColumns(10);
			
			JLabel lblNombreMateria = new JLabel("Nombre Materia");
			lblNombreMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombreMateria.setBounds(22, 39, 103, 14);
			panel.add(lblNombreMateria);
			
			this.bt=new ButtonGroup();
			
			
			this.rdbtnVerde = new JRadioButton("Verde");
			rdbtnVerde.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnVerde.setBounds(100, 169, 109, 23);
			panel.add(this.rdbtnVerde);
			this.bt.add(this.rdbtnVerde);
			this.rdbtnVerde.setSelected(true);
			
			this.rdbtnAmarillo = new JRadioButton("Amarillo");
			rdbtnAmarillo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnAmarillo.setBounds(100, 143, 109, 23);
			panel.add(this.rdbtnAmarillo);
			this.bt.add(this.rdbtnAmarillo);
			
			this.rdbtnNaranja = new JRadioButton("Naranja");
			rdbtnNaranja.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnNaranja.setBounds(228, 143, 109, 23);
			panel.add(this.rdbtnNaranja);
			this.bt.add(this.rdbtnNaranja);
			
			this.rdbtnRosa = new JRadioButton("Rosa");
			rdbtnRosa.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnRosa.setBounds(228, 169, 109, 23);
			panel.add(this.rdbtnRosa);
			this.bt.add(this.rdbtnRosa);
			
			this.rdbtnAzul = new JRadioButton("Azul");
			rdbtnAzul.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnAzul.setBounds(228, 119, 109, 23);
			panel.add(this.rdbtnAzul);
			this.bt.add(this.rdbtnAzul);
			
			this.rdbtnRojo = new JRadioButton("Rojo");
			rdbtnRojo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			this.rdbtnRojo.setBounds(100, 119, 109, 23);
			panel.add(this.rdbtnRojo);
			this.bt.add(this.rdbtnRojo);
			
			JLabel lblEscogeElColor = new JLabel("Escoge el Color");
			lblEscogeElColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEscogeElColor.setBounds(164, 78, 118, 34);
			panel.add(lblEscogeElColor);
			
			this.btnEliminar = new JButton("Eliminar ");
			btnEliminar.setBounds(172, 246, 89, 23);
			panel.add(this.btnEliminar);
			this.btnEliminar.addActionListener(this);
			this.btnEliminar.setVisible(false);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent evt) {
		try{
			if (evt.getSource()==this.btnCrear){
				
				if(rdbtnVerde.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.GREEN);
					System.out.println(this.tfMateria.getText());
					this.dispose();
				}
				else if(this.rdbtnNaranja.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.ORANGE);
					this.dispose();
				}
				else if(this.rdbtnAzul.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.BLUE);
					this.dispose();
				}
				else if(this.rdbtnRojo.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.RED);
					this.dispose();
				}
				else if(this.rdbtnAmarillo.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.YELLOW);
					this.dispose();
				}
				else if(this.rdbtnRosa.isSelected()){
					this.mpa.setMateria(this.tfMateria.getText(),Color.PINK);
					this.dispose();
				}
				this.pa.modificarLista(this.mpa.getMaterias());
				System.out.println(this.tfMateria.getText());
				
			}
				
				
				//this.mpa.guardarSesion();
				
			
			else if(evt.getSource()==this.btnAtras){
				this.dispose();
			}
			
			else if(evt.getSource()==this.btnEliminar){
				System.out.println("Eliminar");
				this.pa.eliminarMateria(this.mpa.getNum());
				this.dispose();
			}
		} catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "ˇAsegurate de haber llenado todos los datos correctamente!");
		}
		
	}
	
	public void ventanaEditar(){
		setTitle("Editar Materia");
		this.btnEliminar.setVisible(true);
		this.lblNuevaMateria.setText("Editar Materia");
		this.btnCrear.setText("Aceptar");
		
	}
	public void ventanaCrear(){
		setTitle("Crear Materia");
		this.btnEliminar.setVisible(false);
		this.lblNuevaMateria.setText("Crear Materia");
		this.btnCrear.setText("Crear");
	}
}
