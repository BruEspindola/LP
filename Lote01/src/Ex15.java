/* Objetivo: Receber os valores de dois catetos de um triângulo retângulo e mostre a hipotenusa
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex15 {
public static void main(String[] args) {
	double cat1, cat2, hip;
	
	cat1 =Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
	cat2= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo cateto: "));

	hip = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
	
	System.out.println("O valor da hipotenusa é de: "+hip);
}
}
