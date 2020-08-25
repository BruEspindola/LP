/* Objetivo: Calcule a quantidade de litros  gastos em uma viagem, sabendo que automovel faz 12 km/l.
 *receber o tempo e a Vm
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex17 {
public static void main(String[] args) {
	double tempo, Vm, litros;
	
	tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de viagem: "));

	Vm= Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média: "));

	litros = (Vm * tempo) / 12;
	
	System.out.println("A quantidade de litros gastos na viagem é de: "+litros);
}
}
