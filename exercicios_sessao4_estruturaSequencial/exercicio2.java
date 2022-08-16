package exercicios_sessao4_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); /* Locale vai acima do Scanner */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do raio do círculo: ");
		double raio = sc.nextDouble();

		double area = /* π */ 3.14159 * (raio * raio);

		System.out.printf("A= %.4f%n", area);

		sc.close();
	}
}
