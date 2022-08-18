package exercicios_sessao5_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		double imposto = 0;

		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = (salario - 2000.00) * 8 / 100;
		} else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = (salario - 3000.00) * 18 / 100 + 1000.00 * 8 / 100;
		} else {
			imposto = (salario - 4500.00) * 28 / 100 + 1500.00 * 18 / 100 + 1000.00 * 8 / 100;
		}

		System.out.printf("Valor do imposto: R$ %.2f%n", imposto);

		sc.close();
	}
}
