/*
 * Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somatória dos números ímpares entre esses valores.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex35 {
	public static void main(String[] args) {
		int i, n1, n2, soma = 0;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));

		if (n1 < n2) {
			for (i = n1; i <= n2; i++) {
				if (i % 2 != 0) {
					soma = soma + i;
				}
			}

		}

		for (i = n2; i <= n1; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);

	}

}
