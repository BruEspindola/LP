/* Objetivo: Receber a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto
 e o numero de dependentes. Calcule o sálario a receber
 Programadora: Bruna Espindola
 Data: fev/2020
*/


import javax.swing.JOptionPane;
public class Ex16 {
public static void main(String[] args) {
	double quant, hora, desc, dep, salB, salL;
	
	quant = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));

	hora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora: "));

	desc = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto: "));

	dep = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantdade de dependentes: "));

	salB = quant * hora;
	
	dep = dep * 100;
	
	salL = salB - (desc/100) + dep ; 
	
	System.out.println("O salario a receber é de: "+salL);

}
}
