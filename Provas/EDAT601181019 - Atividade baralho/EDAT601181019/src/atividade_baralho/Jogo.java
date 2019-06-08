package atividade_baralho;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();

		System.out.println("-----EM ORDEM----");
		baralho.exibir();
		System.out.println("---------");

		baralho.embaralhar();

		System.out.println("-----EMBARALHADO----");
		baralho.exibir();
		System.out.println("---------");

		baralho.embaralhar();

		int novamente = 1;

		do {
			System.out.println("DIGITE QUANTAS CARTAS DESEJA VIRAR:");
			int virar;
			do {
				System.out.println("(VALOR DEVE ESTAR ENTRE 3 E 7)");
				virar = new Scanner(System.in).nextInt();
			} while (virar < 3 || virar > 7);

			int c = 0;
			int valor[] = new int[virar];
			for (int i = 0; i < virar; i++) {
				Carta removido = baralho.removeCarta(i);
				System.out.println(i+1 + "ª CARTA VIRADA: " + removido);
				valor[i] = removido.getValor();
				if (i != 0) {
					if (valor[i] > valor[i - 1]) {
						c++;
					}
				}
			}

			if (c == (virar-1)) {
				System.out.println("\nGANHOU!!!!\n");
			} else {
				System.out.println("\nNÃO FOI DESSA VEZ :(\n");
			}

			System.out.println("Quer jogar novamente?\nPara SIM, digite 1. Para NÃO, digite outro número");
			novamente = new Scanner(System.in).nextInt();

		} while (novamente == 1);
	}

}
