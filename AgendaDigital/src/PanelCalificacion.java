import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class PanelCalificacion extends JPanel {
	private JTextField txtProyecto;
	private JTextField txtTareas;
	private JTextField txtQuizzes;
	private JTextField txtEntregables;
	private JTextField txtOtros;
	private JTextField tfPorProy;
	private JTextField tfPorTarea;
	private JTextField tfPorQuizz;
	private JTextField tfPorEntre;
	private JTextField tfPorOtro;
	private JTextField tfCalProy;
	private JTextField tfCalTar;
	private JTextField tfCalQuizz;
	private JTextField tfCalEntre;
	private JTextField tfCalOtro;
	private JLabel lblCalficacion;
	private JLabel lblExamen;
	private JLabel lblCalEx;
	private JTextField txtProyectoFinal;
	private JTextField txtParcial;
	private JTextField txtParcial_1;
	private JTextField txtOtros_1;
	private JTextField txtOtros_2;
	private JLabel lblExamenFinal;
	private JTextField tfPorParc1;
	private JTextField tfPorParc2;
	private JTextField tfPorProyF;
	private JTextField tfPorOtro1;
	private JTextField tfPorOtro2;
	private JTextField tfCalParc1;
	private JTextField tfCalParc2;
	private JTextField tfCalProyF;
	private JTextField tfCalOtro1;
	private JTextField tfCalOtro2;
	private JLabel lblCalificacion;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField tfCalObj;
	private JTextField tfCalMin;
	private JLabel lblObjetivo;
	private JLabel lblCal;
	private JLabel lbCalExObj;
	private JLabel lblMinima;
	private JLabel lbObjetivo;
	private JLabel label_5;
	private JLabel lbCalFinObj;
	private JLabel lbCalFinObje;
	private JLabel lblCalFnMin;
	private JButton btnCalMensual;
	private JButton btnCalSem;
	
	private CalculadoraMeta cm;
	
	
	private String[] valoresCalificacion;

	/**
	 * Create the panel.
	 */
	public PanelCalificacion() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		this.setPreferredSize(new Dimension(960, 500));
		JLabel lblCalculadorDeCalificaciones = new JLabel("Calculador de Calificaciones");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalculadorDeCalificaciones, 40, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCalculadorDeCalificaciones, 393, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalculadorDeCalificaciones, 54, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalculadorDeCalificaciones, 595, SpringLayout.WEST, this);
		lblCalculadorDeCalificaciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblCalculadorDeCalificaciones);
		
		JLabel lblCalculadorCalificacinMensual = new JLabel("Calculador Calificaci\u00F3n Mensual");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalculadorCalificacinMensual, 94, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCalculadorCalificacinMensual, 105, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalculadorCalificacinMensual, 108, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalculadorCalificacinMensual, 316, SpringLayout.WEST, this);
		lblCalculadorCalificacinMensual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalculadorCalificacinMensual);
		
		JLabel lblCalculador = new JLabel("Calculador Calificaci\u00F3n Semestral");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalculador, 0, SpringLayout.NORTH, lblCalculadorCalificacinMensual);
		springLayout.putConstraint(SpringLayout.WEST, lblCalculador, 654, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalculador, -84, SpringLayout.EAST, this);
		lblCalculador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalculador);
		
		txtProyecto = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtProyecto, 157, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtProyecto, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtProyecto, 177, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtProyecto, 126, SpringLayout.WEST, this);
		txtProyecto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProyecto.setText("Proyecto");
		add(txtProyecto);
		txtProyecto.setColumns(10);
		
		txtTareas = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTareas, 200, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtTareas, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtTareas, 220, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtTareas, 126, SpringLayout.WEST, this);
		txtTareas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTareas.setText("Tareas");
		add(txtTareas);
		txtTareas.setColumns(10);
		
		txtQuizzes = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtQuizzes, 247, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtQuizzes, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtQuizzes, 267, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtQuizzes, 126, SpringLayout.WEST, this);
		txtQuizzes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtQuizzes.setText("Quizzes");
		add(txtQuizzes);
		txtQuizzes.setColumns(10);
		
		txtEntregables = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEntregables, 294, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtEntregables, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEntregables, 314, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtEntregables, 126, SpringLayout.WEST, this);
		txtEntregables.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEntregables.setText("Entregables");
		add(txtEntregables);
		txtEntregables.setColumns(10);
		
		txtOtros = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtOtros, 342, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtOtros, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtOtros, 362, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtOtros, 126, SpringLayout.WEST, this);
		txtOtros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtOtros.setText("Otros");
		add(txtOtros);
		txtOtros.setColumns(10);
		
		tfPorProy = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorProy, 157, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfPorProy, 161, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorProy, 177, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfPorProy, 208, SpringLayout.WEST, this);
		tfPorProy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorProy);
		tfPorProy.setColumns(10);
		
		tfPorTarea = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorTarea, 200, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfPorTarea, 161, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorTarea, 220, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfPorTarea, 208, SpringLayout.WEST, this);
		tfPorTarea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorTarea);
		tfPorTarea.setColumns(10);
		
		tfPorQuizz = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorQuizz, 247, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfPorQuizz, 161, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorQuizz, 267, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfPorQuizz, 208, SpringLayout.WEST, this);
		tfPorQuizz.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorQuizz);
		tfPorQuizz.setColumns(10);
		
		tfPorEntre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorEntre, 294, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfPorEntre, 161, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorEntre, 314, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfPorEntre, 208, SpringLayout.WEST, this);
		tfPorEntre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorEntre);
		tfPorEntre.setColumns(10);
		
		tfPorOtro = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorOtro, 342, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfPorOtro, 161, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorOtro, 362, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfPorOtro, 208, SpringLayout.WEST, this);
		tfPorOtro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorOtro);
		tfPorOtro.setColumns(10);
		
		tfCalProy = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalProy, 157, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalProy, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalProy, 177, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalProy, 355, SpringLayout.WEST, this);
		tfCalProy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalProy);
		tfCalProy.setColumns(10);
		
		tfCalTar = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalTar, 200, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalTar, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalTar, 220, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalTar, 355, SpringLayout.WEST, this);
		tfCalTar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalTar);
		tfCalTar.setColumns(10);
		
		tfCalQuizz = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalQuizz, 247, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalQuizz, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalQuizz, 267, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalQuizz, 355, SpringLayout.WEST, this);
		tfCalQuizz.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalQuizz);
		tfCalQuizz.setColumns(10);
		
		tfCalEntre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalEntre, 294, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalEntre, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalEntre, 314, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalEntre, 355, SpringLayout.WEST, this);
		tfCalEntre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalEntre);
		tfCalEntre.setColumns(10);
		
		tfCalOtro = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalOtro, 342, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalOtro, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalOtro, 362, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalOtro, 355, SpringLayout.WEST, this);
		tfCalOtro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalOtro);
		tfCalOtro.setColumns(10);
		
		JLabel lblTrabajo = new JLabel("Trabajo");
		springLayout.putConstraint(SpringLayout.NORTH, lblTrabajo, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTrabajo, 61, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTrabajo, 146, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTrabajo, 107, SpringLayout.WEST, this);
		lblTrabajo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblTrabajo);
		
		JLabel label = new JLabel("%");
		springLayout.putConstraint(SpringLayout.NORTH, label, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 171, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 146, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label, 187, SpringLayout.WEST, this);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(label);
		
		lblCalficacion = new JLabel("Calficacion /100");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalficacion, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCalficacion, 269, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalficacion, 139, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalficacion, 386, SpringLayout.WEST, this);
		lblCalficacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalficacion);
		
		lblExamen = new JLabel("Examen");
		springLayout.putConstraint(SpringLayout.NORTH, lblExamen, 421, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblExamen, 61, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblExamen, 435, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblExamen, 107, SpringLayout.WEST, this);
		lblExamen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblExamen);
		
		lblCalEx = new JLabel(" ");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalEx, 422, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCalEx, 288, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalEx, 436, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalEx, 355, SpringLayout.WEST, this);
		lblCalEx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalEx);
		
		txtProyectoFinal = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtProyectoFinal, 0, SpringLayout.NORTH, txtQuizzes);
		springLayout.putConstraint(SpringLayout.EAST, txtProyectoFinal, 699, SpringLayout.WEST, this);
		txtProyectoFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProyectoFinal.setText("Proyecto Final");
		add(txtProyectoFinal);
		txtProyectoFinal.setColumns(10);
		
		txtParcial = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtParcial, 0, SpringLayout.NORTH, txtProyecto);
		springLayout.putConstraint(SpringLayout.WEST, txtParcial, 0, SpringLayout.WEST, txtProyectoFinal);
		springLayout.putConstraint(SpringLayout.SOUTH, txtParcial, 177, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtParcial, 699, SpringLayout.WEST, this);
		txtParcial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtParcial.setText("Parcial 1");
		add(txtParcial);
		txtParcial.setColumns(10);
		
		txtParcial_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtParcial_1, 0, SpringLayout.NORTH, txtTareas);
		springLayout.putConstraint(SpringLayout.WEST, txtParcial_1, 0, SpringLayout.WEST, txtProyectoFinal);
		springLayout.putConstraint(SpringLayout.EAST, txtParcial_1, 699, SpringLayout.WEST, this);
		txtParcial_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtParcial_1.setText("Parcial 2");
		add(txtParcial_1);
		txtParcial_1.setColumns(10);
		
		txtOtros_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtProyectoFinal, 0, SpringLayout.WEST, txtOtros_1);
		springLayout.putConstraint(SpringLayout.NORTH, txtOtros_1, 0, SpringLayout.NORTH, txtEntregables);
		springLayout.putConstraint(SpringLayout.EAST, txtOtros_1, 699, SpringLayout.WEST, this);
		txtOtros_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtOtros_1.setText("Otros");
		add(txtOtros_1);
		txtOtros_1.setColumns(10);
		
		txtOtros_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtOtros_2, 258, SpringLayout.EAST, tfCalOtro);
		springLayout.putConstraint(SpringLayout.EAST, txtOtros_2, -261, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, txtOtros_1, 0, SpringLayout.WEST, txtOtros_2);
		springLayout.putConstraint(SpringLayout.NORTH, txtOtros_2, 0, SpringLayout.NORTH, txtOtros);
		springLayout.putConstraint(SpringLayout.SOUTH, txtOtros_2, 362, SpringLayout.NORTH, this);
		txtOtros_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtOtros_2.setText("Otros");
		add(txtOtros_2);
		txtOtros_2.setColumns(10);
		
		lblExamenFinal = new JLabel("Examen Final");
		springLayout.putConstraint(SpringLayout.NORTH, lblExamenFinal, 422, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblExamenFinal, 626, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblExamenFinal, 436, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblExamenFinal, 712, SpringLayout.WEST, this);
		lblExamenFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblExamenFinal);
		
		tfPorParc1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfPorParc1, 0, SpringLayout.NORTH, txtProyecto);
		springLayout.putConstraint(SpringLayout.WEST, tfPorParc1, 731, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfPorParc1, 177, SpringLayout.NORTH, this);
		tfPorParc1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorParc1);
		tfPorParc1.setColumns(10);
		
		tfPorParc2 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, tfPorParc1, 0, SpringLayout.EAST, tfPorParc2);
		springLayout.putConstraint(SpringLayout.NORTH, tfPorParc2, 0, SpringLayout.NORTH, txtTareas);
		springLayout.putConstraint(SpringLayout.EAST, tfPorParc2, 777, SpringLayout.WEST, this);
		tfPorParc2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorParc2);
		tfPorParc2.setColumns(10);
		
		tfPorProyF = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, tfPorParc2, 0, SpringLayout.WEST, tfPorProyF);
		springLayout.putConstraint(SpringLayout.NORTH, tfPorProyF, 0, SpringLayout.NORTH, txtQuizzes);
		springLayout.putConstraint(SpringLayout.EAST, tfPorProyF, 777, SpringLayout.WEST, this);
		tfPorProyF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorProyF);
		tfPorProyF.setColumns(10);
		
		tfPorOtro1 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, tfPorProyF, 0, SpringLayout.WEST, tfPorOtro1);
		springLayout.putConstraint(SpringLayout.NORTH, tfPorOtro1, 0, SpringLayout.NORTH, txtEntregables);
		springLayout.putConstraint(SpringLayout.WEST, tfPorOtro1, 731, SpringLayout.WEST, this);
		tfPorOtro1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorOtro1);
		tfPorOtro1.setColumns(10);
		
		tfPorOtro2 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, tfPorOtro1, 0, SpringLayout.EAST, tfPorOtro2);
		springLayout.putConstraint(SpringLayout.NORTH, tfPorOtro2, 0, SpringLayout.NORTH, txtOtros);
		springLayout.putConstraint(SpringLayout.WEST, tfPorOtro2, 32, SpringLayout.EAST, txtOtros_2);
		springLayout.putConstraint(SpringLayout.EAST, tfPorOtro2, 777, SpringLayout.WEST, this);
		tfPorOtro2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPorOtro2);
		tfPorOtro2.setColumns(10);
		
		tfCalParc1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalParc1, -1, SpringLayout.NORTH, txtProyecto);
		springLayout.putConstraint(SpringLayout.WEST, tfCalParc1, 51, SpringLayout.EAST, tfPorParc1);
		springLayout.putConstraint(SpringLayout.EAST, tfCalParc1, -46, SpringLayout.EAST, this);
		tfCalParc1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalParc1);
		tfCalParc1.setColumns(10);
		
		tfCalParc2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalParc2, -1, SpringLayout.NORTH, txtTareas);
		springLayout.putConstraint(SpringLayout.WEST, tfCalParc2, 51, SpringLayout.EAST, tfPorParc2);
		springLayout.putConstraint(SpringLayout.EAST, tfCalParc2, -46, SpringLayout.EAST, this);
		tfCalParc2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalParc2);
		tfCalParc2.setColumns(10);
		
		tfCalProyF = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalProyF, -1, SpringLayout.NORTH, txtQuizzes);
		springLayout.putConstraint(SpringLayout.WEST, tfCalProyF, 0, SpringLayout.WEST, tfCalParc1);
		springLayout.putConstraint(SpringLayout.EAST, tfCalProyF, 914, SpringLayout.WEST, this);
		tfCalProyF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalProyF);
		tfCalProyF.setColumns(10);
		
		tfCalOtro1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalOtro1, -1, SpringLayout.NORTH, txtEntregables);
		springLayout.putConstraint(SpringLayout.WEST, tfCalOtro1, 0, SpringLayout.WEST, tfCalParc1);
		springLayout.putConstraint(SpringLayout.EAST, tfCalOtro1, 914, SpringLayout.WEST, this);
		tfCalOtro1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalOtro1);
		tfCalOtro1.setColumns(10);
		
		tfCalOtro2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalOtro2, 0, SpringLayout.NORTH, txtOtros);
		springLayout.putConstraint(SpringLayout.WEST, tfCalOtro2, 0, SpringLayout.WEST, tfCalParc1);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalOtro2, 362, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalOtro2, 914, SpringLayout.WEST, this);
		tfCalOtro2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalOtro2);
		tfCalOtro2.setColumns(10);
		
		lblCalificacion = new JLabel("Calificacion /100");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalificacion, 3, SpringLayout.NORTH, lblTrabajo);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalificacion, 142, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalificacion, 934, SpringLayout.WEST, this);
		lblCalificacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalificacion);
		
		label_2 = new JLabel("Trabajo");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label_2, 641, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label_2, 146, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label_2, 687, SpringLayout.WEST, this);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(label_2);
		
		label_3 = new JLabel("%");
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label_3, 751, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label_3, 146, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label_3, 767, SpringLayout.WEST, this);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(label_3);
		
		tfCalObj = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalObj, 201, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalObj, 495, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalObj, 221, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalObj, 581, SpringLayout.WEST, this);
		tfCalObj.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalObj);
		tfCalObj.setColumns(10);
		
		tfCalMin = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCalMin, 295, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tfCalMin, 495, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tfCalMin, 315, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tfCalMin, 581, SpringLayout.WEST, this);
		tfCalMin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfCalMin);
		tfCalMin.setColumns(10);
		
		lblObjetivo = new JLabel("Objetivo");
		springLayout.putConstraint(SpringLayout.NORTH, lblObjetivo, 204, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblObjetivo, 408, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblObjetivo, 218, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblObjetivo, 485, SpringLayout.WEST, this);
		lblObjetivo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblObjetivo);
		
		lblCal = new JLabel("Aprobatoria");
		springLayout.putConstraint(SpringLayout.NORTH, lblCal, 298, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCal, 408, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCal, 312, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCal, 485, SpringLayout.WEST, this);
		lblCal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCal);
		
		lbCalExObj = new JLabel(" ");
		springLayout.putConstraint(SpringLayout.NORTH, lbCalExObj, 461, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lbCalExObj, 288, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lbCalExObj, 475, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lbCalExObj, 355, SpringLayout.WEST, this);
		lbCalExObj.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lbCalExObj);
		
		lblMinima = new JLabel("Minima");
		springLayout.putConstraint(SpringLayout.NORTH, lblMinima, 422, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblMinima, 232, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblMinima, 278, SpringLayout.WEST, this);
		add(lblMinima);
		
		lbObjetivo = new JLabel("Objetivo");
		springLayout.putConstraint(SpringLayout.NORTH, lbObjetivo, 462, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lbObjetivo, 232, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lbObjetivo, 278, SpringLayout.WEST, this);
		add(lbObjetivo);
		
		label_5 = new JLabel("Minima");
		springLayout.putConstraint(SpringLayout.WEST, lblCalificacion, 0, SpringLayout.WEST, label_5);
		springLayout.putConstraint(SpringLayout.NORTH, label_5, 421, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label_5, 817, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, label_5, 863, SpringLayout.WEST, this);
		add(label_5);
		
		lbCalFinObj = new JLabel("Objetivo");
		springLayout.putConstraint(SpringLayout.NORTH, lbCalFinObj, 461, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lbCalFinObj, 817, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lbCalFinObj, 863, SpringLayout.WEST, this);
		add(lbCalFinObj);
		
		lbCalFinObje = new JLabel(" ");
		springLayout.putConstraint(SpringLayout.NORTH, lbCalFinObje, 460, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lbCalFinObje, 873, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lbCalFinObje, 474, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lbCalFinObje, 940, SpringLayout.WEST, this);
		lbCalFinObje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lbCalFinObje);
		
		lblCalFnMin = new JLabel(" ");
		springLayout.putConstraint(SpringLayout.NORTH, lblCalFnMin, 421, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCalFnMin, 873, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCalFnMin, 435, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblCalFnMin, 940, SpringLayout.WEST, this);
		lblCalFnMin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCalFnMin);
		
		btnCalMensual = new JButton("Calificacion Mensual");
		springLayout.putConstraint(SpringLayout.NORTH, btnCalMensual, 50, SpringLayout.SOUTH, tfCalMin);
		springLayout.putConstraint(SpringLayout.WEST, btnCalMensual, 408, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCalMensual, 91, SpringLayout.SOUTH, tfCalMin);
		springLayout.putConstraint(SpringLayout.EAST, btnCalMensual, 0, SpringLayout.EAST, tfCalObj);
		add(btnCalMensual);
		
		btnCalSem = new JButton("Calificacion Semestral");
		springLayout.putConstraint(SpringLayout.NORTH, btnCalSem, 0, SpringLayout.NORTH, lblExamen);
		springLayout.putConstraint(SpringLayout.WEST, btnCalSem, 0, SpringLayout.WEST, lblObjetivo);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCalSem, -38, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnCalSem, 0, SpringLayout.EAST, tfCalObj);
		add(btnCalSem);

	}
	
	public void arrayDatos(){
		this.valoresCalificacion=new String[21];
		this.valoresCalificacion[0]=tfPorProy.getText();
		this.valoresCalificacion[1]=tfCalProy.getText();
		this.valoresCalificacion[2]=tfPorTarea.getText();
		this.valoresCalificacion[3]=tfCalTar.getText();
		this.valoresCalificacion[4]=tfPorQuizz.getText();
		this.valoresCalificacion[5]=tfCalQuizz.getText();
		this.valoresCalificacion[6]=tfPorEntre.getText();
		this.valoresCalificacion[7]=tfCalEntre.getText();
		this.valoresCalificacion[8]=tfPorOtro.getText();
		this.valoresCalificacion[9]=tfCalOtro.getText();
		this.valoresCalificacion[10]=tfPorParc1.getText();
		this.valoresCalificacion[11]=tfCalParc1.getText();
		this.valoresCalificacion[12]=tfPorParc2.getText();
		this.valoresCalificacion[13]=tfCalParc2.getText();
		this.valoresCalificacion[14]=tfPorProyF.getText();
		this.valoresCalificacion[15]=tfCalProyF.getText();
		this.valoresCalificacion[16]=tfPorOtro1.getText();
		this.valoresCalificacion[17]=tfCalOtro1.getText();
		this.valoresCalificacion[18]=tfPorOtro2.getText();
		this.valoresCalificacion[19]=tfCalOtro2.getText();
		this.valoresCalificacion[20]=tfCalObj.getText();
		this.valoresCalificacion[21]=tfCalMin.getText();
		this.cm = new CalculadoraMeta(this.valoresCalificacion);		
				
		
		
		
	}

}