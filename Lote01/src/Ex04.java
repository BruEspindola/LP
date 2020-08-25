/*
 Objetivo: Receber a temperatura em graus Celsius e mostre convertida em Fahrenheit
 Programadora: Bruna Espindola
 Data: fev/2020
 
  */
import javax.swing.JOptionPane;
public class Ex04 {
	public static void main (String Args []){
		double C, F;
		
		C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em Celsius:"));
	
		F = (9 * C + 160) / 5;
		
		System.out.println("A temperatura é: "+F);
	}

}
