/*
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menos valor.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex18 {
	public static void main(String[] args) {

		int dif, valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		if (valor1 >= valor2){
			dif = valor1 - valor2;
		}else{
			dif = valor2 - valor1;
		}
		System.out.println("A diferença é de: "+dif);
	}
}
