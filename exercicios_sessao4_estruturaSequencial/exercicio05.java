package exercicios_sessao4_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o código do produto 1: ");
		int codigo1 = sc.nextInt();
		System.out.print("Insira a quantidade de produtos 1: ");
		int quantidade1 = sc.nextInt();
		System.out.print("Insira o valor do produto 1: ");
		double valor1 = sc.nextDouble();

		System.out.print("Insira o código do produto 2: ");
		int codigo2 = sc.nextInt();
		System.out.print("Insira a quantidade de produtos 2: ");
		int quantidade2 = sc.nextInt();
		System.out.print("Insira o valor do produto 2: ");
		double valor2 = sc.nextDouble();

		double total = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.printf("Valor a pagar: %.2f%n", total);

		sc.close();

	}
}
