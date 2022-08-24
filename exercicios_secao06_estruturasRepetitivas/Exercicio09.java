/* Um algoritmo que lê um número inteiro n e calcula todos os seus divisores. */

package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número 'n': ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}
}