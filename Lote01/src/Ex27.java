/*
 * Objetivo: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de
dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex27 {
	public static void main(String[] args) {
		double volta, ext, tempo, vm;

		volta = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de voltas:"));
		ext = Double.parseDouble(JOptionPane.showInputDialog("Insira a extens�o do percurso:"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo em minutos:"));

		vm = ((volta * ext) / (tempo * 60)) * 3.6;

		System.out.printf("A velocidade media � de: " + "%.2f", vm);
	}
}
