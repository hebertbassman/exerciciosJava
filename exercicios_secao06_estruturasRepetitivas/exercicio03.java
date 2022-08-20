package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual seu combustível preferido? (1. Álcool, 2. Gasolina, 3. Diesel)"); /* 4. Encerra o programa e mostra a contagem de votos. */

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int combustivel = sc.nextInt();

		while (combustivel != 4) {

			if (combustivel < 0 || combustivel > 4) {
				System.out.println("Código inválido! Insira um número entre 1 e 3!");	
			}

			else if (combustivel == 1) {
				alcool = alcool + 1;
				System.out.println("Muito obrigado!");
			}

			else if (combustivel == 2) {
				gasolina = gasolina + 1;
				System.out.println("Muito obrigado!");
			}

			else if (combustivel == 3) {
				diesel = diesel + 1;
				System.out.println("Muito obrigado!");
			}
			
			System.out.println();
			System.out.println("Qual seu combustível preferido? (1. Álcool, 2. Gasolina, 3. Diesel)");
			combustivel = sc.nextInt();
		}

		System.out.println("Muito obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}
}