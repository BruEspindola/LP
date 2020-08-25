/*
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do
jogo em horas e minutos, sabendo que o tempo máximo é menor que 24
horas e pode começar num dia e terminar noutro.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex25 {
	public static void main(String[] args) {
		int hi, hf, mi, mf, tempoh, tempom;

		hi = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial do jogo:"));
		mi = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial do jogo:"));

		hf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final do jogo:"));
		mf = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto final do jogo:"));

		if (hf >= hi) {
			tempoh = hf - hi;
		} else {
			tempoh = hf + (24 - hi);
		}

		if (mf >= mi) {
			tempom = mf - mi;
		} else {
			tempom = mf + (59 - mi);
		}
		if (hi <= 0 && hf <= 0 && hi > 24 && hf > 24 && mi <= 0 && mf <= 0 && mi > 59 && mf > 59) {
			System.out.println("Valores invalidos");
		} else {
			System.out.println("O jogo durou " + tempoh + " horas e " + tempom + " minutos");
		}

	}
}
