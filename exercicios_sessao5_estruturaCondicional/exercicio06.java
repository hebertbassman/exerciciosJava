package exercicios_sessao5_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número: ");
		double num = sc.nextDouble();

		if (num >= 0 && num <= 25) {
			System.out.print("Intervalo [0,25]");
		} else if (num > 25 && num <= 50) {
			System.out.print("Intervalo (25,50]");
		} else if (num > 50 && num <= 75) {
			System.out.print("Intervalo (50,75]");
		} else if (num > 75 && num <= 100) {
			System.out.print("Intervalo (75,100]");
		} else {
			System.out.print("Fora de intervalo!");
		}

		sc.close();

	}
}