/*
 * Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
e cresce 2 cm ao ano.

*Programador:Bruna Espindola
*
* data: fav/2020   */

public class Ex43 {
	public static void main(String[] args) {
		double ana, maria, anos=1;
		
		ana = 1.10;
		maria = 1.50;
		
		while (maria >= ana){
			ana = ana + 0.03;
			maria = maria + 0.02;
			anos++;
		}
		System.out.println(anos);
	}
}
