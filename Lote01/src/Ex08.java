/* Objetivo: Recebero valor de um deposito em poupan�a. Calcule e mostre o valor
 apos 1 m�s de aplica��o sabendo que rende 1,3%
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex08 {
	public static void main (String Args []){
		double deposito, aplica;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do deposito:"));
		
		aplica = (deposito * 1.013);
		
		System.out.println("Apos um m�s o valor ser� de: "+aplica);
	}
}
