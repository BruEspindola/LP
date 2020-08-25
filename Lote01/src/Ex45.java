/*
 * Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

*Programador:Bruna Espindola
*
* data: fav/2020   */

public class Ex45 {
	public static void main(String[] args) {
		double i, j, soma = 0;

		i = 1;
		j = 1;

		do {
			if (i % 2 != 0) {
				soma = soma + (i / j);

			} else {
				soma = soma - (i / j);
			}
			i++;
			j = i * i;

		} while (i <= 15);
		System.out.println(soma);

	}
}
