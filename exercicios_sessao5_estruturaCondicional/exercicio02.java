package exercicios_sessao5_estruturaCondicional;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.print("Par");
		} else {
			System.out.print("Ímpar");

			sc.close();
		}
	}
}