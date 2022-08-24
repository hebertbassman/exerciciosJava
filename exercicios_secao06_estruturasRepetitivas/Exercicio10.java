/* Um programa que lê um número inteiro positivo n. 
O programa então mostra na tela n linhas, 
começando de 1 até n. Para cada linha, mostra o número da linha,
depois o quadrado e o cubo do valor. */

package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio10 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}
}