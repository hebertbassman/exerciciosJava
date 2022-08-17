package exercicios_sessao5_estruturaCondicional;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Insira a hora final: ");
		int horaFinal = sc.nextInt();
		int duracao;

		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.print("O jogo durou " + duracao + " hora(s).");

		sc.close();
	}
}