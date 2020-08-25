/*
 * Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
resultado 7.

*Programador:Bruna Espindola
*
* data: fav/2020   */

public class Ex41 {
	public static void main(String[] args) {
		int d1, d2, soma;

		for (d1 = 1; d1 <= 6; d1++) {
			for (d2 = 1; d2 <= 6; d2++) {
				soma = d1 + d2;
				if (soma == 7) {
					System.out.println(d1);
					System.out.println(d2);
				}
			}
		}
	}
}
