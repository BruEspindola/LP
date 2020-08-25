/*
 * Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex33 {
	public static void main(String[] args) {
		double N, cont, serie ;
		
		N = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero para calcular a serie:"));
		cont = 1;
		serie = 0;
		
		while (cont <= N){
			serie = serie + (1 / cont);
			
			System.out.printf("%.2f" , serie);
			System.out.println(" ");
			cont ++;
		}
		
	}
}
