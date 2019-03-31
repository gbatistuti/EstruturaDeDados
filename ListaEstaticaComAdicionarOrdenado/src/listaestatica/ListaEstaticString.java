package listaestatica;

import java.util.Arrays;

public class ListaEstaticString {
	private String[] vetor;
	private int nroElem;

	public ListaEstaticString(int tam) {
		vetor = new String[tam];
		nroElem = 0;
	}

	public int adicionar(String elem) {
		if (nroElem >= vetor.length) {
			return -1;
		}
		vetor[nroElem++] = elem;

		return 0;
	}

	public void exibir() {
		if (nroElem == 0) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("\nLista:");

			for (int i = 0; i < nroElem; i++) {
				System.out.println(vetor[i]);
			}
		}
	}

	public int buscar(String elem) {
		for (int i = 0; i < nroElem; i++) {
			if (vetor[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}

	public int removerPeloIndice(int indice) {
		if (indice < 0 || indice >= nroElem) {
			return -1;
		}

		for (int i = indice; i < nroElem - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		nroElem--;
		return 0;
	}

	public int removerElemento(String elem) {
		return removerPeloIndice(buscar(elem));
	}

//	public int adicionarOrdenado(String elem) {
//		int indice = nroElem;
//		if (nroElem >= vetor.length) {
//			return -1;
//		}
//
//		boolean achou = false;
//
//		
//		for (int i = 0; i < nroElem && !achou; i++) {
//			if (elem <= vetor[i]) {
//				indice = i;
//				achou = true;
//			}
//		}
//
//		for (int i = nroElem - 1; i >= indice; i--) {
//			vetor[i + 1] = vetor[i];
//		}
//
//		vetor[indice] = elem; 
//		nroElem++;
//		return 0;
//		
//		//Arrays.sort(vetor);
//	}

}
