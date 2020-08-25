/*
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles..

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex19 {
	public static void main(String[] args) {
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		if (valor1 >= valor2){
			System.out.println("O maior valor é: "+ valor1);
		}else{
			System.out.println("O maior valor é: "+valor2);
		}
	}
}
