/*
 * Objetivo: RReceba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
N’nésimo termo.

*Programador:Bruna Espindola
*
* data: fav/2020   */

import javax.swing.JOptionPane;

public class Ex37 {
	public static void main(String[] args) {
		int N, a, b, i;
		a = 0;
		b = 1;
		
		N = Integer.parseInt(JOptionPane.showInputDialog("Inisra um valor"));
		for( i=0; i<N;  i++) {
			System.out.print(a + " ");
			b+=a;
			a=b-a;
		
	}
	
}}