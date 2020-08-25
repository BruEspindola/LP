/* Objetivo: Receber o raio de uma circunferencia. Calcule e mostre o comprimento da circunferencia
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;

public class Ex11 {
	public static void main(String[] args) {
		double raio, comp;
		

		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio de uma circunferencia:"));
		comp = (2 * 3.14) * raio;

		
		 System.out.printf("O comprimento da circunferencia é de: "+"%.2f", comp);
	}
}
