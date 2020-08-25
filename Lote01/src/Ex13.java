/* Objetivo: Receber a quantidade de alimentos em kilos. Calcule e mostre quantos dias durará
 esse alimento sabendo que pessoa consome 50g ao dia
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex13 {
public static void main(String[] args) {
	double quant, dias;
	
	quant = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de alimentos em kilos:"));
	
	dias = (quant * 1000)/50;
	
	System.out.println("Consumindo 50g ao dia a quantidade de: "+quant+ "kg, durará: "+dias+ " dias");
}
}
