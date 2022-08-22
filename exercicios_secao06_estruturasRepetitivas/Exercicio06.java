package exercicios_secao06_estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor n: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.print("Insira uma sequência de três números reais: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("%.1f%n", media);

		}

		sc.close();
	}
}
