/*
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex29 {
	public static void main(String[] args) {
		double novo = 0, valor, X;

		X = Double.parseDouble(JOptionPane.showInputDialog("Menu: 1 - Poupança  2 - Renda Fixa"));

		while (X != 2 && X != 1) {
			X = Double.parseDouble(JOptionPane.showInputDialog("Valor invalido! Menu: 1 - Poupança  2 - Renda Fixa"));
		}  if (X == 1) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser aplicado na Poupança:"));
			novo = valor * 1.03;
		} else if (X == 2) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser aplicado na renda fixa:"));
			novo = valor * 1.05;
		}

		System.out.println("Após 1 mês o valor corrigido é de: " + novo);
	}

}
