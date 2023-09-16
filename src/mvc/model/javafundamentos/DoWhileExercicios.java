package mvc.model.javafundamentos;

import java.util.Scanner;

public class DoWhileExercicios {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 999;
		do {
			System.out.println(numero);
			numero--;
		} while (numero > 100);
		teclado.close();
	}
}
