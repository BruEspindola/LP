/* Objetivo: Receber dois numeros reais. calcule e mostre a diferen�a de valores 
 Programadora: Bruna Espindola
 Data: fev/2020
*/

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String ARgs[]) {
		
		double X, Y, dif;
		
		X = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X:"));
		Y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y:"));
		
		if (X>Y){			
			dif = X - Y;
		
		}else{
			dif = Y - X;
		}
		System.out.println("A diferen�a � de: "+dif);
	}
}
