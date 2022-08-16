package exercicios_sessao4_estruturaSequencial;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um valor: ");
		int num1 = sc.nextInt();

		System.out.print("Insira um valor: ");
		int num2 = sc.nextInt();

		int soma = num1 + num2;

		System.out.println("Soma = " + soma);

		sc.close();

	}

}