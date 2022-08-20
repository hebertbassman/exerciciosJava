package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número entre 1 e 1000.");
		int x = sc.nextInt();

		if (x < 0 || x > 1000) {
			System.out.println("Número inválido!");
			System.out.println();
			main(null);
		}

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}