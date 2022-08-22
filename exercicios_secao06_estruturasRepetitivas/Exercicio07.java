package exercicios_secao06_estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor n: ");
		double n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Insira pares de números: ");

			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("Divisão impossível!");
			} 
			else {
				double result = (double) x / y; // (double) converte o resultado de x / y em double
				System.out.printf("%.1f%n", result);
			}
		}

		sc.close();
	}
}
