/*
 * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex26 {
	public static void main(String[] args) {
		int X, Y;

		X = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));

	
		int mult;
		if (X >= Y) {
			mult = X % Y;
		} else {
			mult = Y % X;
		}
		if (mult == 0) {
			System.out.println(+X + " " + Y + " São multiplos");
		} else {
			System.out.println(+X + " " + Y + " Não são multiplos");
		}

	}
}
