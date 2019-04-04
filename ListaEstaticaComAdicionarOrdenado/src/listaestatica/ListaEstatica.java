/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica;

public class ListaEstatica {

	private int[] vetor;
	private int nroElem;

	public ListaEstatica(int tam) {
		vetor = new int[tam];
		nroElem = 0;
	}

	public int adicionar(int elem) {
		if (nroElem >= vetor.length) {
			return -1;
		}
		vetor[nroElem++] = elem;
		return 0;
	}

	public int adicionarInicio(int elem) {
		int resposta;

		if (nroElem >= vetor.length) {
			resposta = -1;
		}

		if (vetor == null) {
			vetor[0] = elem;
			resposta = 0;
		}

		int sub = nroElem - 1;
		for (int i = nroElem; i > 0; i--) {
			vetor[sub + 1] = vetor[sub];
			sub--;
		}
		vetor[0] = elem;
		nroElem++;
		resposta = 0;
		return resposta;
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

	public int buscar(int elem) {

		for (int i = 0; i < nroElem; i++) {
			if (vetor[i] == elem) {
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

	public int removerElemento(int elem) {
		return removerPeloIndice(buscar(elem));
	}

	public int removerTodosElem(int elem) {
		int retorno = -1;
		int c = nroElem;
		for (int i = 0; i < c; i++) {
			if (vetor[i] == elem) {
				removerPeloIndice(i);
				retorno = 0;
			}
		}

		return retorno;
	}

	public int adicionarOrdenado(int elem) {
		int indice = nroElem;
		if (nroElem >= vetor.length) {
			return -1;
		}

		boolean achou = false;
		for (int i = 0; i < nroElem && !achou; i++) {
			if (elem <= vetor[i]) {
				indice = i;
				achou = true;
			}
		}

		for (int i = nroElem - 1; i >= indice; i--) {
			vetor[i + 1] = vetor[i];
		}
		vetor[indice] = elem;
		nroElem++;
		return 0;
	}
	
	
	
	
	
	public int adicionarNoIndice(int elem, int indice) {
		if (nroElem >= vetor.length) {
			return -1;
		}
		
		if(indice>=vetor.length) {
			return -1;
		}
			
		
		int sub = nroElem - 1;
		for (int i = nroElem; i >= indice; i--) {
			vetor[sub + 1] = vetor[sub];
			sub--;
		}
		vetor[indice] = elem;
		nroElem++;
				
		return 0;
	}

	public int substituirElemento(int substituido, int substituto) {
		int retorno = -1;
		int c = nroElem;
		for (int i = 0; i < c; i++) {
			if (vetor[i] == substituido) {
				vetor[i] = substituto;
				retorno = 0;
			}
		}

		return retorno;

	}

}
