/*
 * Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex22 {
	public static void main(String[] args) {
		int Valor1, Valor2;

		Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));

		if (Valor1 > Valor2) {
			System.out.println("A ordem crescente é: " + Valor2 + " - " + Valor1);
		} else {
			System.out.println("A ordem crescente é: " + Valor1 + " - " + Valor2);
		}
	}
}
