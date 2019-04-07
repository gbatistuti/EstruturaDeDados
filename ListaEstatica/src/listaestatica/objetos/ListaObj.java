package listaestatica.objetos;

public class ListaObj {

	private Object[] obj;
	private int nroElem;

	public ListaObj(int tam) {
		obj = new Object[tam];
		nroElem = 0;
	}

	public int adicionar(Object elem) {
		if (nroElem >= obj.length) {
			return -1;
		}
		obj[nroElem++] = elem;
		return 0;
	}

	public int adicionarInicio(Object elem) {
		int resposta;

		if (nroElem >= obj.length) {
			resposta = -1;
		}

		if (obj == null) {
			obj[0] = elem;
			resposta = 0;
		}

		int sub = nroElem - 1;
		for (int i = nroElem; i > 0; i--) {
			obj[sub + 1] = obj[sub];
			sub--;
		}
		obj[0] = elem;
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
				System.out.println(obj[i]);
			}
		}
	}

	public int buscar(Object elem) {

		for (int i = 0; i < nroElem; i++) {
			if (obj[i].equals(elem)) {
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
			obj[i] = obj[i + 1];
		}
		nroElem--;
		return 0;
	}

	public int removerElemento(Object elem) {
		return removerPeloIndice(buscar(elem));
	}

	public int removerTodosElem(Object elem) {
		int retorno = -1;
		int c = nroElem;
		for (int i = 0; i < c; i++) {
			if (obj[i].equals(elem)) {
				removerPeloIndice(i);
				retorno = 0;
			}
		}

		return retorno;
	}

//	public int adicionarOrdenado(Object elem) {
//		int indice = nroElem;
//		if (nroElem >= obj.length) {
//			return -1;
//		}
//
//		boolean achou = false;
//		for (int i = 0; i < nroElem && !achou; i++) {
//			if (elem <= obj[i]) {
//				indice = i;
//				achou = true;
//			}
//		}
//
//		for (int i = nroElem - 1; i >= indice; i--) {
//			obj[i + 1] = obj[i];
//		}
//		obj[indice] = elem;
//		nroElem++;
//		return 0;
//	}

	public int adicionarNoIndice(int elem, int indice) {
		if (nroElem >= obj.length) {
			return -1;
		}

		if (indice >= obj.length) {
			return -1;
		}

		int sub = nroElem - 1;
		for (int i = nroElem; i >= indice; i--) {
			obj[sub + 1] = obj[sub];
			sub--;
		}
		obj[indice] = elem;
		nroElem++;

		return 0;
	}

	public int substituirElemento(int substituido, int substituto) {
		int retorno = -1;
		int c = nroElem;
		for (int i = 0; i < c; i++) {
			if (obj[i].equals(substituido)) {
				obj[i] = substituto;
				retorno = 0;
			}
		}

		return retorno;

	}

}
