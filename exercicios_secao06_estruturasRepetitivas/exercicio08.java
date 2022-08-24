/*Um algoritmo que lê um valor n, calcula e escreve 
seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */

package exercicios_secao06_estruturasRepetitivas; 

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número 'n': ");
		int n = sc.nextInt(), fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.print("Fatorial: " + fatorial);

		sc.close();
	}
}
