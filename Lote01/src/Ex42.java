/*
 * Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

*Programador:Bruna Espindola
*
* data: fav/2020   */

public class Ex42 {
	public static void main(String[] args) {
		double i = 1, v1, v2, soma = 0;

		v1 = 1;
		v2 = 1;

		while (i <= 50) {
			v1 = i + 1;
			v2 = i + 2;
			System.out.println(v1);
			System.out.println(v2);
			soma = soma + (v1 / v2);
			i++;
		}
		System.out.println(soma);
	}
}
