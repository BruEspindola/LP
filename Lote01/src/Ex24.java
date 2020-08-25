/*
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3..

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex24 {
	public static void main(String[] args) {
		int valor, resto2, resto3;

		valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));

		resto2 = valor % 2;
		resto3 = valor % 3;

		if (resto2 == 0 && resto3 == 0) {
			System.out.println(valor + " é divisivel por 2 e por 3");
		} else {
			System.out.println(valor + " não é divisivel por 2 e por 3");
		}
	}
}
