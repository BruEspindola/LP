/* Objetivo: Receber 2 angulos de um triângulo. calcule e mostre o valor do terceiro angulos
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;

public class Ex14 {
	public static void main(String[] args) {
		double ang1, ang2, ang3;

		ang1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro angulo: "));
		ang2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo angulo: "));

		ang3 = 180 - (ang1 + ang2);

		System.out.println("O valor do 3º Angulo é de: " + ang3);

	}
}
