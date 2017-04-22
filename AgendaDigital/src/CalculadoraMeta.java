import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraMeta extends JPanel {
	
public CalculadoraMeta(){
		
		// Inicializa panel
		super();
		this.setPreferredSize(new Dimension(1000,600));
		this.setBackground(new Color(255,255,255));
		
		this.add(new JLabel("Calificaciones"));
	}

}
