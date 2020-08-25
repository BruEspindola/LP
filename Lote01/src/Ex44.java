/*
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da
potência.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex44 {
	public static void main(String[] args) {
		double base, exp, pote = 0, i;

		base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base da potencia:"));
		exp = Double.parseDouble(JOptionPane.showInputDialog("Insira o expoente da potencia:"));

		if (exp == 0) {
			System.out.println("1");

		} else if (exp == 1) {
			System.out.println(base);

		} else if (base == 1) {
			System.out.println(base);
		} else if (base == 0 && exp > 0) {
			System.out.println(base);
		} else {
			for (i = 1; i <= exp; i++) {
				pote = pote + (base * i);
			}
			System.out.println(pote);
		}

	}
}
