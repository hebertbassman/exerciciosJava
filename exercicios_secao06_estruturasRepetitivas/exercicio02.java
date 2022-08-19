package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("X: ");
		int x = sc.nextInt();
		System.out.print("Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");

			} else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");

			} else if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");

			} else if (x > 0 && y < 0) {
				System.out.println("Quadrante 4");
			}

			System.out.print("X: ");
			x = sc.nextInt();
			System.out.print("Y: ");
			y = sc.nextInt();

		}

		sc.close();

	}
}