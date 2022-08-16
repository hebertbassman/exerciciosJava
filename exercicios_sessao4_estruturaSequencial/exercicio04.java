package exercicios_sessao4_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the employee number: ");
		int number = sc.nextInt();
		System.out.print("Enter the number of worked hours: ");
		int workedHours = sc.nextInt();
		System.out.print("Enter the value of the worked hour: ");
		double hourValue = sc.nextDouble();

		double salary = workedHours * hourValue;

		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f%n", salary); 
		
		sc.close();

	}
}
