import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthScrollPaneUI;

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
				porExF,
				calObj,
				calMin,
				totalProy,
				totalTarea,
				totalQuizzes,
				totalEntre,
				totalOtro,
				minima,
				porTotal,
				porEx,
				objetivo,
				totalPar1,
				totalPar2,
				totalProyF,
				totalOtro1,
				totalOtro2,
				porTotalF,
				calTotal,
				calTotalF,
				objetivoF,
				minimaF;
	
	
	private String[] valores;
	//private PanelCalificacion pc;
	
				
	
	public CalculadoraMeta(String[] valores){
			//this.pc=pc;
			this.valores=valores;
		
	}
	
	public double calcularMensualMinimo(){
		//Faltan excepciones
		try{
			for(int i=0;i<12;i++){
				System.out.println(i);
				if(this.valores[i]==null){
					System.out.println("Llenar valores mensuales");
					throw new NumberFormatException();
				} else if(Double.parseDouble(this.valores[i])>100){
					throw new NumberFormatException();
				}
			}
			this.porProyecto=Double.parseDouble(this.valores[0]);
			this.calProyecto=Double.parseDouble(this.valores[1]);
			this.porTareas=Double.parseDouble(this.valores[2]);
			this.calTareas=Double.parseDouble(this.valores[3]);
			this.porQuizzes=Double.parseDouble(this.valores[4]);
			this.calQuizzes=Double.parseDouble(this.valores[5]);
			this.porEntre=Double.parseDouble(this.valores[6]);
			this.calEntre=Double.parseDouble(this.valores[7]);
			this.porOtro=Double.parseDouble(this.valores[8]);
			this.calOtro=Double.parseDouble(this.valores[9]);
			this.calObj=Double.parseDouble(this.valores[10]);
			this.calMin=Double.parseDouble(this.valores[11]);
			
		
		
			this.totalProy=(this.porProyecto/100)*this.calProyecto;
			//System.out.println(this.totalProy);
			this.totalTarea=(this.porTareas/100)*this.calTareas;
			//System.out.println(this.totalTarea);
			this.totalQuizzes=(this.porQuizzes/100)*this.calQuizzes;
			//System.out.println(this.totalQuizzes);
			this.totalEntre=(this.porEntre/100)*this.calEntre;
			//System.out.println(this.totalEntre);
			this.totalOtro=(this.porOtro/100)*this.calOtro;
			//System.out.println(this.totalOtro);
			this.calTotal=(this.totalProy+this.totalTarea+this.totalQuizzes+this.totalEntre+this.totalOtro);
			this.porTotal=(this.porProyecto+this.porTareas+this.porQuizzes+this.porEntre+this.porOtro);

			if(this.porTotal>=100){
				//throw new NumberFormatException();
			} 
			
			//System.out.println("Total Porcentaje"+this.porTotal);
			this.porEx=100-porTotal;
			//System.out.println("Porcentaje Examen"+this.porEx);
			this.minima=(this.calMin-this.calTotal)/(porEx/100);
			return this.minima;
		
		
			
		} catch (NumberFormatException evt){
			System.out.println("PARSE");
			this.minima=-2;
			System.out.println("Error: "+evt);
			JOptionPane.showMessageDialog(null, "�Asegurate de haber llenado los datos correctamente!");
			
		} catch (Exception ev){
			JOptionPane.showMessageDialog(null, "�Error!: "+ev);
			this.minima=-2;
		}
		
		return -2;
	}
	
	public double calcularSemestralMinima(){
		try{
			this.porPar1=Double.parseDouble(this.valores[12]);
			this.calPar1=Double.parseDouble(this.valores[13]);
			this.porPar2=Double.parseDouble(this.valores[14]);
			this.calPar2=Double.parseDouble(this.valores[15]);
			this.porProyF=Double.parseDouble(this.valores[16]);
			this.calProyF=Double.parseDouble(this.valores[17]);
			this.porOtro1=Double.parseDouble(this.valores[18]);
			this.calOtro1=Double.parseDouble(this.valores[19]);
			this.porOtro2=Double.parseDouble(this.valores[20]);
			this.calOtro2=Double.parseDouble(this.valores[21]);
			this.calObj=Double.parseDouble(this.valores[22]);
			this.calMin=Double.parseDouble(this.valores[23]);
			
			for(int i=12;i<24;i++){
				if(this.valores[i]==null){
						throw new NumberFormatException();
				} else if(Double.parseDouble(this.valores[i])>100){
					throw new NumberFormatException();
				}
			}
			
			
			this.totalPar1=(this.porPar1/100)*this.calPar1;
			
			this.totalPar2=(this.porPar2/100)*this.calPar2;
			
			this.totalProyF=(this.porProyF/100)*this.calProyF;
			
			this.totalOtro1=(this.porOtro1/100)*this.calOtro1;
			
			this.totalOtro2=(this.porOtro2/100)*this.calOtro2;
			//System.out.println("totalOtro"+this.totalOtro2);
			this.porTotalF=(this.porPar1+this.porPar2+this.porProyF+this.porOtro1+this.porOtro2);
			
			if(this.porTotalF>=100){
				throw new NumberFormatException();
			}
			
			//System.out.println("Porcentaje Total: "+this.porTotalF);
			this.calTotalF=(this.totalPar1+this.totalPar2+this.totalProyF+this.totalOtro1+this.totalOtro2);
			//System.out.println("Calificacion Total: "+this.calTotalF);
			this.porExF=100-this.porTotalF;
			//System.out.println("Porcentaje Examen Final: "+this.porExF);
			this.minimaF=(this.calMin-this.calTotalF)/(this.porExF/100);
			//System.out.println("MINIMA FINAL: "+this.minimaF);
			return this.minimaF;
		}
		catch(NumberFormatException evt){
			JOptionPane.showMessageDialog(null, "�Asegurate de haber llenado los datos correctamente!");
			this.minimaF=-2;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "�Error!: "+e);
			this.minimaF=-2;
		}
		return -2;
	}
	
	public double calcularMensualObjetivo(){	
		//Faltan excepciones
		this.objetivo=(this.calObj-this.calTotal)/(this.porEx/100);
		return this.objetivo;
	}
	
	
	
	public double getMinima() {
		return minima;
	}

	public double getObjetivo() {
		return objetivo;
	}

	public double getObjetivoF() {
		return objetivoF;
	}

	public double getMinimaF() {
		return minimaF;
	}

	public double calcularSemestralObjetivo(){
		this.objetivoF=(this.calObj-this.calTotalF)/(this.porExF/100);
		return this.objetivoF;
	}
	
	public double getPorEx(){
		return this.porEx;
	}
	
	public double getPorExF(){
		return this.porExF;

	}

}
