import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseListener;
import java.awt.Color;

public class PanelAgenda extends JPanel {
	private MicroPanelAgenda MPA;

	/**
	 * Create the panel.
	 */
	public PanelAgenda(MicroPanelAgenda MPA) {
		
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
		
		JPanel panelLun1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun1 = new GridBagConstraints();
		gbc_panelLun1.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun1.fill = GridBagConstraints.BOTH;
		gbc_panelLun1.gridx = 0;
		gbc_panelLun1.gridy = 1;
		add(panelLun1, gbc_panelLun1);
		
		
		JPanel panelMar1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar1 = new GridBagConstraints();
		gbc_panelMar1.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar1.fill = GridBagConstraints.BOTH;
		gbc_panelMar1.gridx = 1;
		gbc_panelMar1.gridy = 1;
		add(panelMar1, gbc_panelMar1);
		
		JPanel panelMie1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie1 = new GridBagConstraints();
		gbc_panelMie1.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie1.fill = GridBagConstraints.BOTH;
		gbc_panelMie1.gridx = 2;
		gbc_panelMie1.gridy = 1;
		add(panelMie1, gbc_panelMie1);
		
		JPanel panelJue1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue1 = new GridBagConstraints();
		gbc_panelJue1.insets = new Insets(0, 0, 5, 5);
		gbc_panelJue1.fill = GridBagConstraints.BOTH;
		gbc_panelJue1.gridx = 3;
		gbc_panelJue1.gridy = 1;
		add(panelJue1, gbc_panelJue1);
		
		JPanel panelVie1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie1 = new GridBagConstraints();
		gbc_panelVie1.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie1.fill = GridBagConstraints.BOTH;
		gbc_panelVie1.gridx = 4;
		gbc_panelVie1.gridy = 1;
		add(panelVie1, gbc_panelVie1);
		
		JPanel panelSab1 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab1 = new GridBagConstraints();
		gbc_panelSab1.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab1.fill = GridBagConstraints.BOTH;
		gbc_panelSab1.gridx = 5;
		gbc_panelSab1.gridy = 1;
		add(panelSab1, gbc_panelSab1);
		
		JPanel panelLun2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun2 = new GridBagConstraints();
		gbc_panelLun2.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun2.fill = GridBagConstraints.BOTH;
		gbc_panelLun2.gridx = 0;
		gbc_panelLun2.gridy = 2;
		add(panelLun2, gbc_panelLun2);
		
		JPanel panelMar2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar2 = new GridBagConstraints();
		gbc_panelMar2.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar2.fill = GridBagConstraints.BOTH;
		gbc_panelMar2.gridx = 1;
		gbc_panelMar2.gridy = 2;
		add(panelMar2, gbc_panelMar2);
		
		JPanel panelMie2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie2 = new GridBagConstraints();
		gbc_panelMie2.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie2.fill = GridBagConstraints.BOTH;
		gbc_panelMie2.gridx = 2;
		gbc_panelMie2.gridy = 2;
		add(panelMie2, gbc_panelMie2);
		
		JPanel panelJue2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue2 = new GridBagConstraints();
		gbc_panelJue2.insets = new Insets(0, 0, 5, 5);
		gbc_panelJue2.fill = GridBagConstraints.BOTH;
		gbc_panelJue2.gridx = 3;
		gbc_panelJue2.gridy = 2;
		add(panelJue2, gbc_panelJue2);
		
		JPanel panelVie2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie2 = new GridBagConstraints();
		gbc_panelVie2.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie2.fill = GridBagConstraints.BOTH;
		gbc_panelVie2.gridx = 4;
		gbc_panelVie2.gridy = 2;
		add(panelVie2, gbc_panelVie2);
		
		JPanel panelSab2 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab2 = new GridBagConstraints();
		gbc_panelSab2.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab2.fill = GridBagConstraints.BOTH;
		gbc_panelSab2.gridx = 5;
		gbc_panelSab2.gridy = 2;
		add(panelSab2, gbc_panelSab2);
		
		JPanel panelLun3 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun3 = new GridBagConstraints();
		gbc_panelLun3.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun3.fill = GridBagConstraints.BOTH;
		gbc_panelLun3.gridx = 0;
		gbc_panelLun3.gridy = 3;
		add(panelLun3, gbc_panelLun3);
		
		JPanel panelMar3 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar3 = new GridBagConstraints();
		gbc_panelMar3.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar3.fill = GridBagConstraints.BOTH;
		gbc_panelMar3.gridx = 1;
		gbc_panelMar3.gridy = 3;
		add(panelMar3, gbc_panelMar3);
		
		JPanel panelMie3 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie3 = new GridBagConstraints();
		gbc_panelMie3.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie3.fill = GridBagConstraints.BOTH;
		gbc_panelMie3.gridx = 2;
		gbc_panelMie3.gridy = 3;
		add(panelMie3, gbc_panelMie3);
		
		JPanel PanelJue3 = new MicroPanelAgenda();
		GridBagConstraints gbc_PanelJue3 = new GridBagConstraints();
		gbc_PanelJue3.insets = new Insets(0, 0, 5, 5);
		gbc_PanelJue3.fill = GridBagConstraints.BOTH;
		gbc_PanelJue3.gridx = 3;
		gbc_PanelJue3.gridy = 3;
		add(PanelJue3, gbc_PanelJue3);
		
		JPanel panelVie3 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie3 = new GridBagConstraints();
		gbc_panelVie3.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie3.fill = GridBagConstraints.BOTH;
		gbc_panelVie3.gridx = 4;
		gbc_panelVie3.gridy = 3;
		add(panelVie3, gbc_panelVie3);
		
		JPanel panelSab3 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab3 = new GridBagConstraints();
		gbc_panelSab3.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab3.fill = GridBagConstraints.BOTH;
		gbc_panelSab3.gridx = 5;
		gbc_panelSab3.gridy = 3;
		add(panelSab3, gbc_panelSab3);
		
		JPanel panelLun4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun4 = new GridBagConstraints();
		gbc_panelLun4.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun4.fill = GridBagConstraints.BOTH;
		gbc_panelLun4.gridx = 0;
		gbc_panelLun4.gridy = 4;
		add(panelLun4, gbc_panelLun4);
		
		JPanel panelMar4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar4 = new GridBagConstraints();
		gbc_panelMar4.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar4.fill = GridBagConstraints.BOTH;
		gbc_panelMar4.gridx = 1;
		gbc_panelMar4.gridy = 4;
		add(panelMar4, gbc_panelMar4);
		
		JPanel panelMie4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie4 = new GridBagConstraints();
		gbc_panelMie4.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie4.fill = GridBagConstraints.BOTH;
		gbc_panelMie4.gridx = 2;
		gbc_panelMie4.gridy = 4;
		add(panelMie4, gbc_panelMie4);
		
		JPanel panelJue4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue4 = new GridBagConstraints();
		gbc_panelJue4.insets = new Insets(0, 0, 5, 5);
		gbc_panelJue4.fill = GridBagConstraints.BOTH;
		gbc_panelJue4.gridx = 3;
		gbc_panelJue4.gridy = 4;
		add(panelJue4, gbc_panelJue4);
		
		JPanel panelVie4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie4 = new GridBagConstraints();
		gbc_panelVie4.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie4.fill = GridBagConstraints.BOTH;
		gbc_panelVie4.gridx = 4;
		gbc_panelVie4.gridy = 4;
		add(panelVie4, gbc_panelVie4);
		
		JPanel panelSab4 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab4 = new GridBagConstraints();
		gbc_panelSab4.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab4.fill = GridBagConstraints.BOTH;
		gbc_panelSab4.gridx = 5;
		gbc_panelSab4.gridy = 4;
		add(panelSab4, gbc_panelSab4);
		
		JPanel panelLun5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun5 = new GridBagConstraints();
		gbc_panelLun5.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun5.fill = GridBagConstraints.BOTH;
		gbc_panelLun5.gridx = 0;
		gbc_panelLun5.gridy = 5;
		add(panelLun5, gbc_panelLun5);
		
		JPanel panelMar5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar5 = new GridBagConstraints();
		gbc_panelMar5.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar5.fill = GridBagConstraints.BOTH;
		gbc_panelMar5.gridx = 1;
		gbc_panelMar5.gridy = 5;
		add(panelMar5, gbc_panelMar5);
		
		JPanel panelMie5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie5 = new GridBagConstraints();
		gbc_panelMie5.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie5.fill = GridBagConstraints.BOTH;
		gbc_panelMie5.gridx = 2;
		gbc_panelMie5.gridy = 5;
		add(panelMie5, gbc_panelMie5);
		
		JPanel panelJue5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue5 = new GridBagConstraints();
		gbc_panelJue5.insets = new Insets(0, 0, 5, 5);
		gbc_panelJue5.fill = GridBagConstraints.BOTH;
		gbc_panelJue5.gridx = 3;
		gbc_panelJue5.gridy = 5;
		add(panelJue5, gbc_panelJue5);
		
		JPanel panelVie5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie5 = new GridBagConstraints();
		gbc_panelVie5.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie5.fill = GridBagConstraints.BOTH;
		gbc_panelVie5.gridx = 4;
		gbc_panelVie5.gridy = 5;
		add(panelVie5, gbc_panelVie5);
		
		JPanel panelSab5 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab5 = new GridBagConstraints();
		gbc_panelSab5.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab5.fill = GridBagConstraints.BOTH;
		gbc_panelSab5.gridx = 5;
		gbc_panelSab5.gridy = 5;
		add(panelSab5, gbc_panelSab5);
		
		JPanel panelLun6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun6 = new GridBagConstraints();
		gbc_panelLun6.insets = new Insets(0, 0, 5, 5);
		gbc_panelLun6.fill = GridBagConstraints.BOTH;
		gbc_panelLun6.gridx = 0;
		gbc_panelLun6.gridy = 6;
		add(panelLun6, gbc_panelLun6);
		
		JPanel panelMar6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar6 = new GridBagConstraints();
		gbc_panelMar6.insets = new Insets(0, 0, 5, 5);
		gbc_panelMar6.fill = GridBagConstraints.BOTH;
		gbc_panelMar6.gridx = 1;
		gbc_panelMar6.gridy = 6;
		add(panelMar6, gbc_panelMar6);
		
		JPanel panelMie6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie6 = new GridBagConstraints();
		gbc_panelMie6.insets = new Insets(0, 0, 5, 5);
		gbc_panelMie6.fill = GridBagConstraints.BOTH;
		gbc_panelMie6.gridx = 2;
		gbc_panelMie6.gridy = 6;
		add(panelMie6, gbc_panelMie6);
		
		JPanel panelJue6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue6 = new GridBagConstraints();
		gbc_panelJue6.insets = new Insets(0, 0, 5, 5);
		gbc_panelJue6.fill = GridBagConstraints.BOTH;
		gbc_panelJue6.gridx = 3;
		gbc_panelJue6.gridy = 6;
		add(panelJue6, gbc_panelJue6);
		
		JPanel panelVie6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie6 = new GridBagConstraints();
		gbc_panelVie6.insets = new Insets(0, 0, 5, 5);
		gbc_panelVie6.fill = GridBagConstraints.BOTH;
		gbc_panelVie6.gridx = 4;
		gbc_panelVie6.gridy = 6;
		add(panelVie6, gbc_panelVie6);
		
		JPanel panelSab6 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab6 = new GridBagConstraints();
		gbc_panelSab6.insets = new Insets(0, 0, 5, 0);
		gbc_panelSab6.fill = GridBagConstraints.BOTH;
		gbc_panelSab6.gridx = 5;
		gbc_panelSab6.gridy = 6;
		add(panelSab6, gbc_panelSab6);
		
		JPanel panelLun7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelLun7 = new GridBagConstraints();
		gbc_panelLun7.insets = new Insets(0, 0, 0, 5);
		gbc_panelLun7.fill = GridBagConstraints.BOTH;
		gbc_panelLun7.gridx = 0;
		gbc_panelLun7.gridy = 7;
		add(panelLun7, gbc_panelLun7);
		
		JPanel panelMar7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMar7 = new GridBagConstraints();
		gbc_panelMar7.insets = new Insets(0, 0, 0, 5);
		gbc_panelMar7.fill = GridBagConstraints.BOTH;
		gbc_panelMar7.gridx = 1;
		gbc_panelMar7.gridy = 7;
		add(panelMar7, gbc_panelMar7);
		
		JPanel panelMie7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelMie7 = new GridBagConstraints();
		gbc_panelMie7.insets = new Insets(0, 0, 0, 5);
		gbc_panelMie7.fill = GridBagConstraints.BOTH;
		gbc_panelMie7.gridx = 2;
		gbc_panelMie7.gridy = 7;
		add(panelMie7, gbc_panelMie7);
		
		JPanel panelJue7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelJue7 = new GridBagConstraints();
		gbc_panelJue7.insets = new Insets(0, 0, 0, 5);
		gbc_panelJue7.fill = GridBagConstraints.BOTH;
		gbc_panelJue7.gridx = 3;
		gbc_panelJue7.gridy = 7;
		add(panelJue7, gbc_panelJue7);
		
		JPanel panelVie7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelVie7 = new GridBagConstraints();
		gbc_panelVie7.insets = new Insets(0, 0, 0, 5);
		gbc_panelVie7.fill = GridBagConstraints.BOTH;
		gbc_panelVie7.gridx = 4;
		gbc_panelVie7.gridy = 7;
		add(panelVie7, gbc_panelVie7);
		
		JPanel panelSab7 = new MicroPanelAgenda();
		GridBagConstraints gbc_panelSab7 = new GridBagConstraints();
		gbc_panelSab7.fill = GridBagConstraints.BOTH;
		gbc_panelSab7.gridx = 5;
		gbc_panelSab7.gridy = 7;
		add(panelSab7, gbc_panelSab7);
		
		

	}

}