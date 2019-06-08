package pratica08_fila;

public class FilaCircular {

	private int tamanho;
	private int inicio;
	private int fim;
	private int capacidade;

	private String[] fila;

	public FilaCircular(int capacidade) {
		fila = new String[capacidade];
		tamanho = 0;
		inicio = 0;
		fim = 0;
		this.capacidade = capacidade;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public boolean isFull() {
		return tamanho == fila.length;
	}

	public void insert(String info) {
		if (isFull()) {
			System.out.println("Fila cheia");
		} else {
			fila[fim] = info;
			fim++;
			tamanho++;
			if(fim == tamanho) {
				fim = 0;
			}

		}
	}

	public String peek() {
		return fila[0];
	}

	public String poll() {
		if (isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		} else {
			String primeiro = fila[0]; 

			for (int i = 0; i < tamanho - 1; i++) {
				fila[i] = fila[i + 1];
			}

			fila[tamanho - 1] = null; // sobrescreve o último elemento da fila com null
			tamanho--; // decrementa o tamanho da fila
			return primeiro; // retorna o primeiro elemento da fila
		}
	}

}
