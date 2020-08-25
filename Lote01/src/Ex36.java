/*
 * Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex36 {
	public static void main(String[] args) {
		int i=1, j, n, resp = 1, soma = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));

		while (i <= n) {
			j = 1;
			while (j <= n) {
				resp = resp * j;
				System.out.println(resp);
				j++;
			}
			soma = soma + (1 / resp);
			i++;

		}
		System.out.println(soma);
	}
}
