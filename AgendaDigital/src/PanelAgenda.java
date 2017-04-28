/* Proyecto Final - Programacion Orientada a Objetos
 * 
 * Emanuel Estrada Larios - 50%
 * Miguel Triana - 50%
 * 
 * jueves 27 de abril del 2017
 */

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.Color;

public class PanelAgenda extends JPanel {
	private MicroPanelAgenda MPA;
	private ArrayList<Materia> listaMaterias;
	private ArrayList<MicroPanelAgenda> arrayPaneles;


	/**
	 * Create the panel.
	 */
	public PanelAgenda(MicroPanelAgenda MPA) {
		this.listaMaterias= new ArrayList<Materia>();
		this.arrayPaneles = new ArrayList<MicroPanelAgenda>();
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{170, 170, 170, 170, 170, 100, 0};
		gridBagLayout.rowHeights = new int[] {24, 63, 63, 63, 63, 63, 63, 63, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblLunes = new JLabel("Lunes");
		lblLunes.setBackground(Color.GREEN);
		GridBagConstraints gbc_lblLunes = new GridBagConstraints();
		gbc_lblLunes.insets = new Insets(0, 0, 5, 5);
		gbc_lblLunes.gridx = 0;
		gbc_lblLunes.gridy = 0;
		add(lblLunes, gbc_lblLunes);
		
		JLabel lblMartes = new JLabel("Martes");
		GridBagConstraints gbc_lblMartes = new GridBagConstraints();
		gbc_lblMartes.insets = new Insets(0, 0, 5, 5);
		gbc_lblMartes.gridx = 1;
		gbc_lblMartes.gridy = 0;
		add(lblMartes, gbc_lblMartes);
		
		JLabel lblMiercoles = new JLabel("Miercoles");
		GridBagConstraints gbc_lblMiercoles = new GridBagConstraints();
		gbc_lblMiercoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiercoles.gridx = 2;
		gbc_lblMiercoles.gridy = 0;
		add(lblMiercoles, gbc_lblMiercoles);
		
		JLabel lblJueves = new JLabel("Jueves");
		GridBagConstraints gbc_lblJueves = new GridBagConstraints();
		gbc_lblJueves.insets = new Insets(0, 0, 5, 5);
		gbc_lblJueves.gridx = 3;
		gbc_lblJueves.gridy = 0;
		add(lblJueves, gbc_lblJueves);
		
		JLabel lblViernes = new JLabel("Viernes");
		GridBagConstraints gbc_lblViernes = new GridBagConstraints();
		gbc_lblViernes.insets = new Insets(0, 0, 5, 5);
		gbc_lblViernes.gridx = 4;
		gbc_lblViernes.gridy = 0;
		add(lblViernes, gbc_lblViernes);
		
		JLabel lblSabado = new JLabel("Sabado");
		GridBagConstraints gbc_lblSabado = new GridBagConstraints();
		gbc_lblSabado.insets = new Insets(0, 0, 5, 0);
		gbc_lblSabado.gridx = 5;
		gbc_lblSabado.gridy = 0;
		add(lblSabado, gbc_lblSabado);
		
		MicroPanelAgenda p0 = new MicroPanelAgenda(0,this);
		GridBagConstraints gbc_p0 = new GridBagConstraints();
		gbc_p0.insets = new Insets(0, 0, 5, 5);
		gbc_p0.fill = GridBagConstraints.BOTH;
		gbc_p0.gridx = 0;
		gbc_p0.gridy = 1;
		add(p0, gbc_p0);
		this.arrayPaneles.add(p0);
		
		
		MicroPanelAgenda p1 = new MicroPanelAgenda(1,this);
		GridBagConstraints gbc_p1 = new GridBagConstraints();
		gbc_p1.insets = new Insets(0, 0, 5, 5);
		gbc_p1.fill = GridBagConstraints.BOTH;
		gbc_p1.gridx = 1;
		gbc_p1.gridy = 1;
		add(p1, gbc_p1);
		this.arrayPaneles.add(p1);
		
		MicroPanelAgenda p2 = new MicroPanelAgenda(2,this);
		GridBagConstraints gbc_p2 = new GridBagConstraints();
		gbc_p2.insets = new Insets(0, 0, 5, 5);
		gbc_p2.fill = GridBagConstraints.BOTH;
		gbc_p2.gridx = 2;
		gbc_p2.gridy = 1;
		add(p2, gbc_p2);
		this.arrayPaneles.add(p2);
		
		MicroPanelAgenda p3 = new MicroPanelAgenda(3,this);
		GridBagConstraints gbc_p3 = new GridBagConstraints();
		gbc_p3.insets = new Insets(0, 0, 5, 5);
		gbc_p3.fill = GridBagConstraints.BOTH;
		gbc_p3.gridx = 3;
		gbc_p3.gridy = 1;
		add(p3, gbc_p3);
		this.arrayPaneles.add(p3);
		
		MicroPanelAgenda p4 = new MicroPanelAgenda(4,this);
		GridBagConstraints gbc_p4 = new GridBagConstraints();
		gbc_p4.insets = new Insets(0, 0, 5, 5);
		gbc_p4.fill = GridBagConstraints.BOTH;
		gbc_p4.gridx = 4;
		gbc_p4.gridy = 1;
		add(p4, gbc_p4);
		this.arrayPaneles.add(p4);
		
		MicroPanelAgenda p5 = new MicroPanelAgenda(5,this);
		GridBagConstraints gbc_p5 = new GridBagConstraints();
		gbc_p5.insets = new Insets(0, 0, 5, 0);
		gbc_p5.fill = GridBagConstraints.BOTH;
		gbc_p5.gridx = 5;
		gbc_p5.gridy = 1;
		add(p5, gbc_p5);
		this.arrayPaneles.add(p5);
		
		MicroPanelAgenda p6 = new MicroPanelAgenda(6,this);
		GridBagConstraints gbc_p6 = new GridBagConstraints();
		gbc_p6.insets = new Insets(0, 0, 5, 5);
		gbc_p6.fill = GridBagConstraints.BOTH;
		gbc_p6.gridx = 0;
		gbc_p6.gridy = 2;
		add(p6, gbc_p6);
		this.arrayPaneles.add(p6);
		
		MicroPanelAgenda p7 = new MicroPanelAgenda(7,this);
		GridBagConstraints gbc_p7 = new GridBagConstraints();
		gbc_p7.insets = new Insets(0, 0, 5, 5);
		gbc_p7.fill = GridBagConstraints.BOTH;
		gbc_p7.gridx = 1;
		gbc_p7.gridy = 2;
		add(p7, gbc_p7);
		this.arrayPaneles.add(p7);
		
		MicroPanelAgenda p8 = new MicroPanelAgenda(8,this);
		GridBagConstraints gbc_p8 = new GridBagConstraints();
		gbc_p8.insets = new Insets(0, 0, 5, 5);
		gbc_p8.fill = GridBagConstraints.BOTH;
		gbc_p8.gridx = 2;
		gbc_p8.gridy = 2;
		add(p8, gbc_p8);
		this.arrayPaneles.add(p8);
		
		MicroPanelAgenda p9 = new MicroPanelAgenda(9,this);
		GridBagConstraints gbc_p9 = new GridBagConstraints();
		gbc_p9.insets = new Insets(0, 0, 5, 5);
		gbc_p9.fill = GridBagConstraints.BOTH;
		gbc_p9.gridx = 3;
		gbc_p9.gridy = 2;
		add(p9, gbc_p9);
		this.arrayPaneles.add(p9);
		
		MicroPanelAgenda p10 = new MicroPanelAgenda(10,this);
		GridBagConstraints gbc_p10 = new GridBagConstraints();
		gbc_p10.insets = new Insets(0, 0, 5, 5);
		gbc_p10.fill = GridBagConstraints.BOTH;
		gbc_p10.gridx = 4;
		gbc_p10.gridy = 2;
		add(p10, gbc_p10);
		this.arrayPaneles.add(p10);
		
		MicroPanelAgenda p11 = new MicroPanelAgenda(11,this);
		GridBagConstraints gbc_p11 = new GridBagConstraints();
		gbc_p11.insets = new Insets(0, 0, 5, 0);
		gbc_p11.fill = GridBagConstraints.BOTH;
		gbc_p11.gridx = 5;
		gbc_p11.gridy = 2;
		add(p11, gbc_p11);
		this.arrayPaneles.add(p11);
		
		MicroPanelAgenda p12 = new MicroPanelAgenda(12,this);
		GridBagConstraints gbc_p12 = new GridBagConstraints();
		gbc_p12.insets = new Insets(0, 0, 5, 5);
		gbc_p12.fill = GridBagConstraints.BOTH;
		gbc_p12.gridx = 0;
		gbc_p12.gridy = 3;
		add(p12, gbc_p12);
		this.arrayPaneles.add(p12);
		
		MicroPanelAgenda p13 = new MicroPanelAgenda(13,this);
		GridBagConstraints gbc_p13 = new GridBagConstraints();
		gbc_p13.insets = new Insets(0, 0, 5, 5);
		gbc_p13.fill = GridBagConstraints.BOTH;
		gbc_p13.gridx = 1;
		gbc_p13.gridy = 3;
		add(p13, gbc_p13);
		this.arrayPaneles.add(p13);
		
		MicroPanelAgenda p14 = new MicroPanelAgenda(14,this);
		GridBagConstraints gbc_p14 = new GridBagConstraints();
		gbc_p14.insets = new Insets(0, 0, 5, 5);
		gbc_p14.fill = GridBagConstraints.BOTH;
		gbc_p14.gridx = 2;
		gbc_p14.gridy = 3;
		add(p14, gbc_p14);
		this.arrayPaneles.add(p14);
		
		MicroPanelAgenda p15 = new MicroPanelAgenda(15,this);
		GridBagConstraints gbc_p15 = new GridBagConstraints();
		gbc_p15.insets = new Insets(0, 0, 5, 5);
		gbc_p15.fill = GridBagConstraints.BOTH;
		gbc_p15.gridx = 3;
		gbc_p15.gridy = 3;
		add(p15, gbc_p15);
		this.arrayPaneles.add(p15);
		
		MicroPanelAgenda p16 = new MicroPanelAgenda(16,this);
		GridBagConstraints gbc_p16 = new GridBagConstraints();
		gbc_p16.insets = new Insets(0, 0, 5, 5);
		gbc_p16.fill = GridBagConstraints.BOTH;
		gbc_p16.gridx = 4;
		gbc_p16.gridy = 3;
		add(p16, gbc_p16);
		this.arrayPaneles.add(p16);
		
		MicroPanelAgenda p17 = new MicroPanelAgenda(17,this);
		GridBagConstraints gbc_p17 = new GridBagConstraints();
		gbc_p17.insets = new Insets(0, 0, 5, 0);
		gbc_p17.fill = GridBagConstraints.BOTH;
		gbc_p17.gridx = 5;
		gbc_p17.gridy = 3;
		add(p17, gbc_p17);
		this.arrayPaneles.add(p17);
		
		MicroPanelAgenda p18 = new MicroPanelAgenda(18,this);
		GridBagConstraints gbc_p18 = new GridBagConstraints();
		gbc_p18.insets = new Insets(0, 0, 5, 5);
		gbc_p18.fill = GridBagConstraints.BOTH;
		gbc_p18.gridx = 0;
		gbc_p18.gridy = 4;
		add(p18, gbc_p18);
		this.arrayPaneles.add(p18);
		
		MicroPanelAgenda p19 = new MicroPanelAgenda(19,this);
		GridBagConstraints gbc_p19 = new GridBagConstraints();
		gbc_p19.insets = new Insets(0, 0, 5, 5);
		gbc_p19.fill = GridBagConstraints.BOTH;
		gbc_p19.gridx = 1;
		gbc_p19.gridy = 4;
		add(p19, gbc_p19);
		this.arrayPaneles.add(p19);
		
		MicroPanelAgenda p20 = new MicroPanelAgenda(20,this);
		GridBagConstraints gbc_p20 = new GridBagConstraints();
		gbc_p20.insets = new Insets(0, 0, 5, 5);
		gbc_p20.fill = GridBagConstraints.BOTH;
		gbc_p20.gridx = 2;
		gbc_p20.gridy = 4;
		add(p20, gbc_p20);
		this.arrayPaneles.add(p20);
		
		MicroPanelAgenda p21 = new MicroPanelAgenda(21,this);
		GridBagConstraints gbc_p21 = new GridBagConstraints();
		gbc_p21.insets = new Insets(0, 0, 5, 5);
		gbc_p21.fill = GridBagConstraints.BOTH;
		gbc_p21.gridx = 3;
		gbc_p21.gridy = 4;
		add(p21, gbc_p21);
		this.arrayPaneles.add(p21);
		
		MicroPanelAgenda p22 = new MicroPanelAgenda(22,this);
		GridBagConstraints gbc_p22 = new GridBagConstraints();
		gbc_p22.insets = new Insets(0, 0, 5, 5);
		gbc_p22.fill = GridBagConstraints.BOTH;
		gbc_p22.gridx = 4;
		gbc_p22.gridy = 4;
		add(p22, gbc_p22);
		this.arrayPaneles.add(p22);
		
		MicroPanelAgenda p23 = new MicroPanelAgenda(23,this);
		GridBagConstraints gbc_p23 = new GridBagConstraints();
		gbc_p23.insets = new Insets(0, 0, 5, 0);
		gbc_p23.fill = GridBagConstraints.BOTH;
		gbc_p23.gridx = 5;
		gbc_p23.gridy = 4;
		add(p23, gbc_p23);
		this.arrayPaneles.add(p23);
		
		MicroPanelAgenda p24 = new MicroPanelAgenda(24,this);
		GridBagConstraints gbc_p24 = new GridBagConstraints();
		gbc_p24.insets = new Insets(0, 0, 5, 5);
		gbc_p24.fill = GridBagConstraints.BOTH;
		gbc_p24.gridx = 0;
		gbc_p24.gridy = 5;
		add(p24, gbc_p24);
		this.arrayPaneles.add(p24);
		
		MicroPanelAgenda p25 = new MicroPanelAgenda(25,this);
		GridBagConstraints gbc_p25 = new GridBagConstraints();
		gbc_p25.insets = new Insets(0, 0, 5, 5);
		gbc_p25.fill = GridBagConstraints.BOTH;
		gbc_p25.gridx = 1;
		gbc_p25.gridy = 5;
		add(p25, gbc_p25);
		this.arrayPaneles.add(p25);
		
		MicroPanelAgenda p26 = new MicroPanelAgenda(26,this);
		GridBagConstraints gbc_p26 = new GridBagConstraints();
		gbc_p26.insets = new Insets(0, 0, 5, 5);
		gbc_p26.fill = GridBagConstraints.BOTH;
		gbc_p26.gridx = 2;
		gbc_p26.gridy = 5;
		add(p26, gbc_p26);
		this.arrayPaneles.add(p26);
		
		MicroPanelAgenda p27 = new MicroPanelAgenda(27,this);
		GridBagConstraints gbc_p27 = new GridBagConstraints();
		gbc_p27.insets = new Insets(0, 0, 5, 5);
		gbc_p27.fill = GridBagConstraints.BOTH;
		gbc_p27.gridx = 3;
		gbc_p27.gridy = 5;
		add(p27, gbc_p27);
		this.arrayPaneles.add(p27);
		
		MicroPanelAgenda p28 = new MicroPanelAgenda(28,this);
		GridBagConstraints gbc_p28 = new GridBagConstraints();
		gbc_p28.insets = new Insets(0, 0, 5, 5);
		gbc_p28.fill = GridBagConstraints.BOTH;
		gbc_p28.gridx = 4;
		gbc_p28.gridy = 5;
		add(p28, gbc_p28);
		this.arrayPaneles.add(p28);
		
		MicroPanelAgenda p29 = new MicroPanelAgenda(29,this);
		GridBagConstraints gbc_p29 = new GridBagConstraints();
		gbc_p29.insets = new Insets(0, 0, 5, 0);
		gbc_p29.fill = GridBagConstraints.BOTH;
		gbc_p29.gridx = 5;
		gbc_p29.gridy = 5;
		add(p29, gbc_p29);
		this.arrayPaneles.add(p29);
		
		MicroPanelAgenda p30 = new MicroPanelAgenda(30,this);
		GridBagConstraints gbc_p30 = new GridBagConstraints();
		gbc_p30.insets = new Insets(0, 0, 5, 5);
		gbc_p30.fill = GridBagConstraints.BOTH;
		gbc_p30.gridx = 0;
		gbc_p30.gridy = 6;
		add(p30, gbc_p30);
		this.arrayPaneles.add(p30);
		
		MicroPanelAgenda p31 = new MicroPanelAgenda(31,this);
		GridBagConstraints gbc_p31 = new GridBagConstraints();
		gbc_p31.insets = new Insets(0, 0, 5, 5);
		gbc_p31.fill = GridBagConstraints.BOTH;
		gbc_p31.gridx = 1;
		gbc_p31.gridy = 6;
		add(p31, gbc_p31);
		this.arrayPaneles.add(p31);
		
		MicroPanelAgenda p32 = new MicroPanelAgenda(32,this);
		GridBagConstraints gbc_p32 = new GridBagConstraints();
		gbc_p32.insets = new Insets(0, 0, 5, 5);
		gbc_p32.fill = GridBagConstraints.BOTH;
		gbc_p32.gridx = 2;
		gbc_p32.gridy = 6;
		add(p32, gbc_p32);
		this.arrayPaneles.add(p32);
		
		MicroPanelAgenda p33 = new MicroPanelAgenda(33,this);
		GridBagConstraints gbc_p33 = new GridBagConstraints();
		gbc_p33.insets = new Insets(0, 0, 5, 5);
		gbc_p33.fill = GridBagConstraints.BOTH;
		gbc_p33.gridx = 3;
		gbc_p33.gridy = 6;
		add(p33, gbc_p33);
		this.arrayPaneles.add(p33);
		
		MicroPanelAgenda p34 = new MicroPanelAgenda(34,this);
		GridBagConstraints gbc_p34 = new GridBagConstraints();
		gbc_p34.insets = new Insets(0, 0, 5, 5);
		gbc_p34.fill = GridBagConstraints.BOTH;
		gbc_p34.gridx = 4;
		gbc_p34.gridy = 6;
		add(p34, gbc_p34);
		this.arrayPaneles.add(p34);
		
		MicroPanelAgenda p35 = new MicroPanelAgenda(35,this);
		GridBagConstraints gbc_p35 = new GridBagConstraints();
		gbc_p35.insets = new Insets(0, 0, 5, 0);
		gbc_p35.fill = GridBagConstraints.BOTH;
		gbc_p35.gridx = 5;
		gbc_p35.gridy = 6;
		add(p35, gbc_p35);
		this.arrayPaneles.add(p35);
		
		MicroPanelAgenda p36 = new MicroPanelAgenda(36,this);
		GridBagConstraints gbc_p36 = new GridBagConstraints();
		gbc_p36.insets = new Insets(0, 0, 0, 5);
		gbc_p36.fill = GridBagConstraints.BOTH;
		gbc_p36.gridx = 0;
		gbc_p36.gridy = 7;
		add(p36, gbc_p36);
		this.arrayPaneles.add(p36);
		
		MicroPanelAgenda p37 = new MicroPanelAgenda(37,this);
		GridBagConstraints gbc_p37 = new GridBagConstraints();
		gbc_p37.insets = new Insets(0, 0, 0, 5);
		gbc_p37.fill = GridBagConstraints.BOTH;
		gbc_p37.gridx = 1;
		gbc_p37.gridy = 7;
		add(p37, gbc_p37);
		this.arrayPaneles.add(p37);
		
		MicroPanelAgenda p38 = new MicroPanelAgenda(38,this);
		GridBagConstraints gbc_p38 = new GridBagConstraints();
		gbc_p38.insets = new Insets(0, 0, 0, 5);
		gbc_p38.fill = GridBagConstraints.BOTH;
		gbc_p38.gridx = 2;
		gbc_p38.gridy = 7;
		add(p38, gbc_p38);
		this.arrayPaneles.add(p38);
		
		MicroPanelAgenda p39 = new MicroPanelAgenda(39,this);
		GridBagConstraints gbc_p39 = new GridBagConstraints();
		gbc_p39.insets = new Insets(0, 0, 0, 5);
		gbc_p39.fill = GridBagConstraints.BOTH;
		gbc_p39.gridx = 3;
		gbc_p39.gridy = 7;
		add(p39, gbc_p39);
		this.arrayPaneles.add(p39);
		
		MicroPanelAgenda p40 = new MicroPanelAgenda(40,this);
		GridBagConstraints gbc_p40 = new GridBagConstraints();
		gbc_p40.insets = new Insets(0, 0, 0, 5);
		gbc_p40.fill = GridBagConstraints.BOTH;
		gbc_p40.gridx = 4;
		gbc_p40.gridy = 7;
		add(p40, gbc_p40);
		this.arrayPaneles.add(p40);
		
		MicroPanelAgenda p41 = new MicroPanelAgenda(41,this);
		GridBagConstraints gbc_p41 = new GridBagConstraints();
		gbc_p41.fill = GridBagConstraints.BOTH;
		gbc_p41.gridx = 5;
		gbc_p41.gridy = 7;
		add(p41, gbc_p41);
		this.arrayPaneles.add(p41);
		
		this.cargarDatos();
		

	}
	//Se llama para meter al array todo lo que queremos que se guarde en la base de datos.
	public void modificarLista(Materia mt){
		int tmp=0;	
		
		this.listaMaterias.add(mt);
		try {
			PrintWriter materias = new PrintWriter(new FileWriter("logMaterias.txt"));
			materias.println("START");
			for(int i=0; i<this.listaMaterias.size();i++){
				if(this.listaMaterias.get(i).getColorMateria()==Color.RED){
					tmp=0;
				} else if(this.listaMaterias.get(i).getColorMateria()==Color.BLUE){
					tmp=1;
				} else if(this.listaMaterias.get(i).getColorMateria()==Color.GREEN){
					tmp=2;
				} else if(this.listaMaterias.get(i).getColorMateria()==Color.YELLOW){
					tmp=3;
				} else if(this.listaMaterias.get(i).getColorMateria()==Color.PINK){
					tmp=4;
				} else if(this.listaMaterias.get(i).getColorMateria()==Color.ORANGE){
					tmp=5;
				}
				materias.println(this.listaMaterias.get(i).getNombreMateria()+","+this.listaMaterias.get(i).getNumeroMateria()+","+tmp);
			}
			materias.println("END");
			materias.close();
		}catch(FileNotFoundException evt){
			System.out.println("Error: "+evt);
		}catch(IOException evt){
			
		}
		
	}
	
	//Al iniciar el programa checa el archivo que guarda la agenda para despues cargarla a los paneles
	public void cargarDatos(){
		
		try {
			String linea,
				  nombre;
			int Num,
				color;
			Color fondo;
			
			StringTokenizer st;
			BufferedReader bf=new BufferedReader(new FileReader("logMaterias.txt"));
			linea=bf.readLine();
			if(linea.equals("START")){
				linea=bf.readLine();
				while (true) {
						
						st=new StringTokenizer(linea,",");
						nombre=st.nextToken();
						System.out.println(linea);
						Num=Integer.parseInt(st.nextToken());
						color=Integer.parseInt(st.nextToken());
						switch (color){
							case 0: fondo=Color.RED;
									break;
							case 1: fondo=Color.BLUE;
									break;
							case 2: fondo=Color.GREEN;
									break;
							case 3: fondo=Color.YELLOW;
									break;
							case 4: fondo=Color.PINK;
									break;
							case 5: fondo=Color.ORANGE;
									break;
							default: fondo = Color.WHITE;
						
						}
						
						for(int f=0;f<this.arrayPaneles.size();f++){
							if(Num==this.arrayPaneles.get(f).getNum()){
								this.arrayPaneles.get(f).setMateria(nombre, fondo);
								this.modificarLista(this.arrayPaneles.get(f).getMaterias());
								
							}
						}
						linea=bf.readLine();
					if (linea.equals("END")) {
						break;
					}
					
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException w){
			
		}
	}
	
	public void addArray(Materia mt){
		this.modificarLista(mt);
	}
	


}
