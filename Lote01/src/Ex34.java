/*
 * Objetivo:Receba um número. Calcule e mostre os resultados da tabuada desse número.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex34 {
	public static void main(String[] args) {
		int tab, N, i;
		N = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para mostrar a tabuada:"));

		for (i = 0; i <= 10; i++) {
			tab = N * i;
			System.out.println(N + " * " + i + " = " + tab);
		}
	}
}
