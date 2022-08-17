package exercicios_sessao5_estruturaCondicional;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("São múltiplos.");
		} else {
			System.out.print("Não são múltiplos.");
		}
		
		sc.close();
	}
}