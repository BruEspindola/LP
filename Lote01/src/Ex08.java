/* Objetivo: Recebero valor de um deposito em poupança. Calcule e mostre o valor
 apos 1 mês de aplicação sabendo que rende 1,3%
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex08 {
	public static void main (String Args []){
		double deposito, aplica;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do deposito:"));
		
		aplica = (deposito * 1.013);
		
		System.out.println("Apos um mês o valor será de: "+aplica);
	}
}
