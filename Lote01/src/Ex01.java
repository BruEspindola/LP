/*
 Objetivo: Coletar o lado do quadrado e mostrar a sua área
 Programadora: Bruna Espindola
 Data: fev/2020
 
  */

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String Args[]) {
		
		int area, lado;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Insira o lado do quadrado:"));
		
		area = lado * lado;
		
		System.out.println("A area do quadrado é: " +area);
	}
}
