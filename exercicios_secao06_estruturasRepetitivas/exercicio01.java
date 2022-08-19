package exercicios_secao06_estruturasRepetitivas;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida!");
			System.out.print("Senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");

		sc.close();

	}
}
