/*
 * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qdte: 1 2 4 8 ... N

*Programador:Bruna Espindola
*
* data: fav/2020   */

public class Ex39 {
	public static void main(String[] args) {
		double quad, soma, grao;

		quad = 1;
		soma = quad;
		grao = 2;

		while (quad < 64) {
			soma = soma + grao;
			quad = quad + 1;
			grao = grao * 2;
			System.out.println(soma);
		}
	}
}
