/* Objetivo: Receber o ano de nascimento e o ano atual. calcule e mostre a sua idade e quantos anote terá 
 daqui 17 anos
 Programadora: Bruna Espindola
 Data: fev/2020
*/
import javax.swing.JOptionPane;
public class Ex12 {
public static void main(String[] args) {
		int idade, atual, futura, nasc;
		nasc = Integer.parseInt(JOptionPane.showInputDialog("Insir o ano de nascimento:"));
		
		atual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:"));
		
		idade = atual - nasc;
		
		futura = idade + 17;
		
		System.out.println("Você tem: "+idade+ " anos, e daqui 17 anos terá: "+futura+" anos");
		
}
}
