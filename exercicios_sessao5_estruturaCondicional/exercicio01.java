package exercicios_sessao5_estruturaCondicional;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.print("Negativo!");
		} else {
			System.out.print("Não negativo!");
		}

		sc.close();
	}
}
