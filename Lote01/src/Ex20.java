/*
 * Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex20 {
	public static void main(String[] args) {
		Double A, B, C, X1, X2, delta;

		A = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A:"));
		B = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor B:"));
		C = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor C:"));

		delta = (B * B) - 4 * (A * C);

		if (delta > 0) {
			X1 = (-B + Math.sqrt(delta)) / (2 * A);
			X2 = (-B - Math.sqrt(delta)) / (2 * A);

			System.out.println("As raízes são: " + X1 + " e: " + X2);
		} else {
			System.out.println("Não há raízes reais");
		}

	}
}
