/*
 * Objetivo: Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o
novo pre�o sabendo que:
Venda Mensal Pre�o Atual Pre�o Novo
&lt; 500 &lt; 30 + 10%
&gt;= 500 e &lt; 1000 &gt;= 30 e &lt; 80 +15%
&gt;= 1000 &gt;= 80 - 5%
Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex28 {
	public static void main(String[] args) {
		double atual, mensal, novo;

		atual = Double.parseDouble(JOptionPane.showInputDialog("Insira o pre�o atual:"));
		mensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a m�dia mensal:"));

		if (atual < 500 && mensal < 30) {
			novo = atual * 1.10;

		} else if (atual > 500 && atual < 1000 && mensal > 30 && mensal < 80) {
			novo = atual * 1.15;
		} else if (atual >= 1000 && mensal >= 80) {
			novo = atual * 0.95;
		} else {
			novo = atual;
		}
		System.out.printf("O novo pre�o � de: "+ "%.2f", novo);
	}
}
