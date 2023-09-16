package mvc.model.javafundamentos;

import java.util.Scanner;

public class DoWhile3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("digite um numero");
		numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("digite outro numero");
		numero2 = Integer.parseInt(teclado.nextLine());
		int menor;
		int maior;
		if (numero1 > numero2) {
			maior = numero1;
			menor = numero2;
		} else {
			maior = numero2;
			menor = numero1;
		}
		do {
			System.out.println(menor);
			menor++;
		} while (menor <= maior);
		System.out.println("as diferenças são " + numero1);
		teclado.close();
	}
}

