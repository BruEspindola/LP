/* Objetivo: Receber dois numeros e calcule a soma dos quadrados
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;

public class Ex09 {
	public static void main(String Args[]) {
		int X, Y, quad;
		
		X = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		quad = (X * X) + (Y * Y);
		
		System.out.println("A soma dos quadrados é: "+quad);
	}
}
