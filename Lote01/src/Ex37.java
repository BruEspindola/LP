/*
 * Objetivo: RReceba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu
N�n�simo termo.

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