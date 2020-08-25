/*
 Objetivo: Coletar a base e a altura de um triângulo. Calcule e mostre a área
 Programadora: Bruna Espindola
 Data: fev/2020
 
  */

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String Args[]) {

		double base, altura, area;

		base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do triângulo:"));

		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo:"));

		area = (base * altura) / 2;

		System.out.println("A area do triângulo é: " + area);

	}
}
