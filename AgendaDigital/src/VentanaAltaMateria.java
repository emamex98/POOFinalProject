import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaAltaMateria extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaMateria frame = new VentanaAltaMateria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAltaMateria() {
		setTitle("Nueva Materia");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(77, 206, 89, 23);
		panel.add(btnAtrs);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(250, 206, 89, 23);
		panel.add(btnCrear);
		
		JLabel lblNuevaMateria = new JLabel("Nueva Materia");
		lblNuevaMateria.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNuevaMateria.setBounds(161, 11, 121, 14);
		panel.add(lblNuevaMateria);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(190, 47, 137, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombreMateria = new JLabel("Nombre Materia");
		lblNombreMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombreMateria.setBounds(77, 50, 103, 14);
		panel.add(lblNombreMateria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(135, 93, 55, 20);
		panel.add(comboBox);
		
		JLabel lblPosicionHorario = new JLabel("Posicion Horario");
		lblPosicionHorario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPosicionHorario.setBounds(22, 96, 103, 14);
		panel.add(lblPosicionHorario);
	}
}
