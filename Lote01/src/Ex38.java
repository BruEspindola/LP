/*
 * Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor
valor. Obs.: somente valores positivos.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex38 {
	public static void main(String[] args) {
		int i, N, maior, menor;

		N = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
		if (N >= 0) {
			maior = N;
			menor = N;

			for (i = 1; i <= 99; i++) {
				N = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
				if (N > maior && N >= 0) {
					maior = N;
				} else if (N < menor && N >= 0) {
					menor = N;
				}

			}
			System.out.println(maior);
			System.out.println(menor);
		}

	}
}
