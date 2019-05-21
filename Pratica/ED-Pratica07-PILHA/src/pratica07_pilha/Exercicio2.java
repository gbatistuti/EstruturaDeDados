package pratica07_pilha;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		System.out.println("Digite um numero inteiro:");
		int n = new Scanner(System.in).nextInt();

		converter(n);

	}

	public static void converter(int n) {
		int quociente;
		int resto;
		int tam = -1;

		for (int i = 0; n >= Math.pow(2, i); i++) {
			tam = (int) Math.pow(2, i);
		}

		Pilha p = new Pilha(tam);
		tam = 0;

		do {
			quociente = n / 2;
			resto = n % 2;
			p.push(resto);
			n = quociente;
			tam++;
		} while (quociente != 0);

		for (int i = 0; i < tam; i++) {
				System.out.println(p.pop());
		}

	}

}
