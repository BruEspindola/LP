/*
 * Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
idade em anos, meses e dias, considerando os anos bissextos.

*Programador:Bruna Espindola
*
* data: fav/2020   */
import javax.swing.JOptionPane;

public class Ex30 {
	public static void main(String[] args) {
		int dia = 0, i = 0, ano_at, mes_at, dia_at, ano_nasc, mes_nasc, dia_nasc, q_dia = 0, q_mes, q_ano;

		dia_at = Integer.parseInt(JOptionPane.showInputDialog("Dia hoje:"));
		mes_at = Integer.parseInt(JOptionPane.showInputDialog("Mês atual:"));
		ano_at = Integer.parseInt(JOptionPane.showInputDialog("Ano atual:"));

		dia_nasc = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento:"));
		mes_nasc = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento:"));
		ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));

		q_ano = ano_at - ano_nasc;
		q_mes = mes_at - mes_nasc;

		if (mes_at < mes_nasc) {
			q_ano = q_ano - 1;
		}  if (q_mes <= 0) {
			q_mes = q_mes + 12;
		} else if (dia_at < dia_nasc) {
			q_mes = q_mes - 1;

		}
		for (i = ano_nasc; i <= ano_at; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				dia = dia + 1;
				q_dia = (dia_at - dia_nasc) + dia;
			}
		}
		if (q_dia > 31) {
			q_dia = q_dia - 31;
		}
		System.out.println(q_ano);
		System.out.println(q_mes);
		System.out.println(q_dia);
	}
}
