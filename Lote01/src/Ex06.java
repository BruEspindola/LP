/* Objetivo: Receber dois valores em x e y. Efetue a troca de seus valores
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;

public class Ex06 {
	public static void main(String Args[]) {
		
		int X, Y, X1, Y1;
		
		X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X:"));
		
		Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y:"));
		
		X1 = X;
		Y1 = Y;
		
		Y = X1;
		X = Y1;
		
		System.out.println("O valor de X é: "+X+ " O valor de Y é: "+Y);
	}
}
