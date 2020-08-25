/*
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for &gt;= 6,0 exibir “APROVADO”;
b. Se a média for &gt;= 3,0 ou &lt; 6,0 exibir “EXAME”;
c. Se a média for &lt; 3,0 exibir “RETIDO”.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex21 {
	public static void main(String[] args) {
		double N1, N2, N3, N4, MD;

		N1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da primeira nota:"));
		N2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da segunda nota:"));
		N3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da terceira nota:"));
		N4 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da quarta nota:"));

		MD = (N1 + N2 + N3 + N4) / 4;

		if (MD >= 6.0) {
			System.out.println("Aprovado " + MD);
		} else if (MD >= 3.0 && MD < 6.0) {
			System.out.println("Exame " + MD);

		} else {
			System.out.println("Retido " + MD);
		}
	}
}
