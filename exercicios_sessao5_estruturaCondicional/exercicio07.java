package exercicios_sessao5_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor X: ");
		double x = sc.nextDouble();
		System.out.print("Valor Y: ");
		double y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.print("Origem");

		} else if (x == 0 && y != 0) {
			System.out.print("Eixo Y");

		} else if (y == 0 && x != 0) {
			System.out.print("Eixo X");

		} else if (x > 0 && y > 0) {
			System.out.print("Quadrante 1");

		} else if (x < 0 && y > 0) {
			System.out.print("Quadrante 2");

		} else if (x < 0 && y < 0) {
			System.out.print("Quadrante 3");

		} else if (x > 0 && y < 0) {
			System.out.print("Quadrante 4");
		}

		sc.close();
	}
}