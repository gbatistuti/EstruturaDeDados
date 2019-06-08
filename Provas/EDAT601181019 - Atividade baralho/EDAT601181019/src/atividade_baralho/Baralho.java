package atividade_baralho;

import java.util.Random;

public class Baralho {

	private PilhaObj baralho;

	public Baralho() {
		String[] face = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		String[] naipe = { "Copas", "Paus", "Ouros", "Espadas" };
		baralho = new PilhaObj(52);

		int c = 0;
		while (!baralho.isFull()) {
			baralho.push(new Carta(face[c % 13], naipe[c / 13], c % 13 + 1));
			c++;
		}
	}

	public Carta removeCarta(int ind) {

		PilhaObj aux = new PilhaObj(ind);

		for (int i = 0; i < ind; i++) {
			aux.push(baralho.pop());
		}

		Carta alvo = (Carta) baralho.pop();

		while (!aux.isEmpty()) {
			baralho.push(aux.pop());
		}

		return alvo;
	}

	public void embaralhar() {
		Random nroAleatorio = new Random();

		for (int i = 0; i < 52; i++) {
			int indice = nroAleatorio.nextInt(52);
			if (indice != 0) {
				baralho.push(removeCarta(indice));
			}
		}
	}

	public Carta virarCarta() {
		return (Carta) baralho.pop();
	}

	public void exibir() {
		baralho.exibePilhaBaseParaTopo();
	}
}
