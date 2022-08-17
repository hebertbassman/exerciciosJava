package exercicios_sessao4_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor A: ");
		double A = sc.nextDouble();
		System.out.print("Insira o valor B: ");
		double B = sc.nextDouble();
		System.out.print("Insira o valor C: ");
		double C = sc.nextDouble();
		
		double areaTrianguloRetangulo = (A * C) / 2;
		double areaCirculo =  /*pi*/ 3.14159 * (C * C);
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("Área do triângulo retângulo: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("Área do círculo: %.3f%n", areaCirculo);
		System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);
		
		sc.close();

	}
}
