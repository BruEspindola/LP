/*
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex23 {
	public static void main(String[] args) {
		int V1, V2, V3, V4;

		V1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		V2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
		V3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor:"));
		V4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto valor:"));

		if (V4 < V1) {
			System.out.println(+V4 + " " + V1 + " " + V2 + " " + V3);
		} else if (V4 < V2) {
			System.out.println(+V1 + " " + V4 + " " + V2 + " " + V3);
		} else if (V4 < V3) {
			System.out.println(+V1 + " " + V2 + " " + V4 + " " + V3);
		} else {
			System.out.println(+V1 + " " + V2 + " " + V3 + " " + V4);
		}

	}
}
