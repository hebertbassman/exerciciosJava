package exercicios_sessao5_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.print("Negativo!");
		}
			else {
				System.out.print("Não negativo!");
			}
			
			sc.close();
		}
	}