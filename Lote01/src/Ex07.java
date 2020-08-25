/* Objetivo: Receber os valores do comprimento, largura e altura de um Paralelepipido, mostre seu volume
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String Args[]) {
		double volume, comp, altura, largura;

		comp = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento:"));

		altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura:"));

		largura = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura:"));

		volume = comp * altura * largura;

		System.out.println("O volume do paralelepipido é: " + volume);

	}
}
