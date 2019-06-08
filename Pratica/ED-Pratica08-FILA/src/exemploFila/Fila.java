package exemploFila;

public class Fila {
	// Atributos
	private int tamanho;	// representa a qtidade de elementos
	                        // na fila e também o índice onde será
	                        // inserido o novo elemento na fila
	private String[] fila;
	
	// Construtor
	// Recebe a capacidade da fila (tamanho total do vetor fila)
	public Fila(int capacidade) {
		fila = new String[capacidade];
		tamanho = 0;
	}
	
	// Métodos
	
	/* Método isEmpty - não recebe nada e devolve true se a fila
	 * está vazia e false, caso contrário
	 */
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	/* Método isFull - não recebe nada e devolve true se a fila
	 * está cheia e false, caso contrário
	 */
	public boolean isFull() {
		return tamanho == fila.length;
	}
	
	/* Método insert - recebe a info para ser inserida na fila
	 *  Verifica se a fila está cheia. Se estiver, exibe uma msg.
	 *  Se não estiver, coloca a info na fila, índice tamanho
	 *  e incrementa tamanho
	 */
	public void insert(String info) {
		if (isFull()) {
			System.out.println("Fila cheia");
		}
		else {
			fila[tamanho++] = info;
		}
	}
	
	/* Método peek - não recebe nada e retorna o primeiro elemento
	 *               da fila (mas sem removê-lo)
	 */
	
	public String peek() {
		return fila[0];
	}
	
	/* Método poll - não recebe nada e retorna o primeiro elemento
	 *               da fila, removendo-o da fila
	 */
	public String poll() {
		if (isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		}
		else {
			String primeiro = fila[0]; // salva o primeiro elemento da fila
			// faz a fila "andar"
			for (int i = 0; i < tamanho-1; i++) {
				fila[i] = fila[i+1];
			}
			
			// sugestão do Matheus Vicente
			// for (int i = 1; i < tamanho; i++ ) {
			//	 fila[i-1] = fila[i];
			// }
			
			fila[tamanho-1] = null; // sobrescreve o último elemento da fila com null
			tamanho--;  // decrementa o tamanho da fila
			return primeiro;  // retorna o primeiro elemento da fila
		}
	}
	
}
