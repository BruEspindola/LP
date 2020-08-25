/*
 * Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos
existentes entre eles.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex40 {
	public static void main(String[] args) {
		int n1, n2, maior, menor, i, j;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));

		if (n1 > n2) {
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		for (i = menor; i <= maior; i++) {
			for (j = 1; j <= i; j++) {
				if (i % 1 == 0 || i % i == 0) {
					
				}
			}System.out.println(i);
		}
		
	}
}
