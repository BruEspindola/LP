/*
 Objetivo: Receber o sálario de e mostrar o novo sálario com reajuste de 15%
 Programadora: Bruna Espindola
 Data: fev/2020
 
  */
import javax.swing.JOptionPane;

public class Ex02 {

	public static void main (String Args []){
		
		double salario, Nsalario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario:"));
		
		Nsalario = salario * 1.15;
		
		System.out.println("O novo salario é: "+Nsalario);
	}
}
