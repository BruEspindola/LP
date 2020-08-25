/*
 * Objetivo:Receba um número inteiro. Calcule e mostre o seu fatorial.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;
public class Ex32{
    public static void main(String Args[]){
        
int fat = 1, i ,valor;

valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que deseja descobrir o fatorial: "));

 for (i = 1; i <= valor; i++){
	 fat = fat * i;
	  System.out.println( fat);
 }       
    }
}