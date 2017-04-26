import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraMeta{
	private double porProyecto,
				calProyecto,
				porTareas,
				calTareas,
				porQuizzes,
				calQuizzes,
				porEntre,
				calEntre,
				porOtro,
				calOtro,
				porPar1,
				calPar1,
				porPar2,
				calPar2,
				porProyF,
				calProyF,
				porOtro1,
				calOtro1,
				porOtro2,
				calOtro2,
				porEx,
				porExF,
				calObj,
				calMin;
	public CalculadoraMeta(){
		
	}
				
	
	public CalculadoraMeta(String[] valores){
			try{
				this.porProyecto=Double.parseDouble(valores[0]);
				this.calProyecto=Double.parseDouble(valores[1]);
				this.porTareas=Double.parseDouble(valores[2]);
				this.calTareas=Double.parseDouble(valores[3]);
				this.porQuizzes=Double.parseDouble(valores[4]);
				this.calQuizzes=Double.parseDouble(valores[5]);
				this.porEntre=Double.parseDouble(valores[6]);
				this.calEntre=Double.parseDouble(valores[7]);
				this.porOtro=Double.parseDouble(valores[8]);
				this.calOtro=Double.parseDouble(valores[9]);
				this.porPar1=Double.parseDouble(valores[10]);
				this.calPar1=Double.parseDouble(valores[11]);
				this.porPar2=Double.parseDouble(valores[12]);
				this.calPar2=Double.parseDouble(valores[13]);
				this.porProyF=Double.parseDouble(valores[14]);
				this.calProyF=Double.parseDouble(valores[15]);
				this.porOtro1=Double.parseDouble(valores[16]);
				this.calOtro1=Double.parseDouble(valores[17]);
				this.porOtro2=Double.parseDouble(valores[18]);
				this.calOtro2=Double.parseDouble(valores[19]);
				this.calObj=Double.parseDouble(valores[20]);
				this.calMin=Double.parseDouble(valores[21]);
			}
			catch(NumberFormatException evt){
				
			}
	}
	
	public double calcularMensual(){
		//Faltan excepciones
		double totalProy,
			totalTarea,
			totalQuizzes,
			totalEntre,
			totalOtro,
			objetivo,
			minima,
			porEx;
		totalProy=(this.porProyecto/100)*this.calProyecto;
		totalTarea=(this.porTareas/100)*this.calTareas;
		totalQuizzes=(this.porQuizzes/100)*this.calQuizzes;
		totalEntre=(this.porEntre/100)*this.calEntre;
		totalOtro=(this.porOtro/100)*this.calOtro;		
		porEx=100-(this.porProyecto+this.porTareas+this.porQuizzes+this.porEntre+this.porOtro);
		objetivo=(this.calObj/porEx)*100;
		minima=(this.calMin/porEx)*100;
		
		return minima;
	}

}
