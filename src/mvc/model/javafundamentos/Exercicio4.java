package mvc.model.javafundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		do {
			System.out.println("digite um número positivo");
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero < 0);
		System.out.println("o numero multiplicado por 5 é "+numero*5);
		teclado.close();
	}
	}
		

