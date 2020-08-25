/* Objetivo: Receber A, B e C de uma equação de 2º grau. 
 Calcule e mostre as raízes reais (Considerar que tem 2 raízes)
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex05 {
public static void main (String Args []){
	Double A, B, C, X1, X2, delta;
	
	A = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A:"));
	B= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor B:"));
	C = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor C:"));

	delta = (B*B)-4 * (A*C);
	
	X1 = ( -B + Math.sqrt(delta)) / (2*A);
	X2 = ( -B - Math.sqrt(delta)) / (2*A);
	
	System.out.println("Valor de X1 "+ X1 + " X2: "+X2);
}
}
