/*
 Objetivo: Coletar a base e a altura de um tri�ngulo. Calcule e mostre a �rea
 Programadora: Bruna Espindola
 Data: fev/2020
 
  */

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String Args[]) {

		double base, altura, area;

		base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do tri�ngulo:"));

		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do tri�ngulo:"));

		area = (base * altura) / 2;

		System.out.println("A area do tri�ngulo �: " + area);

	}
}
