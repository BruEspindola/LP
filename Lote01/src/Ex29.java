/*
 * Objetivo: Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupan�a = 3% e a renda fixa = 5%. Demais tipos n�o ser�o considerados.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex29 {
	public static void main(String[] args) {
		double novo = 0, valor, X;

		X = Double.parseDouble(JOptionPane.showInputDialog("Menu: 1 - Poupan�a  2 - Renda Fixa"));

		while (X != 2 && X != 1) {
			X = Double.parseDouble(JOptionPane.showInputDialog("Valor invalido! Menu: 1 - Poupan�a  2 - Renda Fixa"));
		}  if (X == 1) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser aplicado na Poupan�a:"));
			novo = valor * 1.03;
		} else if (X == 2) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser aplicado na renda fixa:"));
			novo = valor * 1.05;
		}

		System.out.println("Ap�s 1 m�s o valor corrigido � de: " + novo);
	}

}
