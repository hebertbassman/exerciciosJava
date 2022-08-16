package exercicios_sessao4_estruturaSequencial;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor A: ");
		int A = sc.nextInt();
		System.out.print("Insira o valor B: ");
		int B = sc.nextInt();
		System.out.print("Insira o valor C: ");
		int C = sc.nextInt();
		System.out.print("Insira o valor D: ");
		int D = sc.nextInt();

		int diferenca = (A * B) - (C * D);

		System.out.println("DIFERENÇA = " + diferenca);

		sc.close();

	}
}
