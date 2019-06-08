package exemploFila;

public class Fila {
	// Atributos
	private int tamanho;	// representa a qtidade de elementos
	                        // na fila e tamb�m o �ndice onde ser�
	                        // inserido o novo elemento na fila
	private String[] fila;
	
	// Construtor
	// Recebe a capacidade da fila (tamanho total do vetor fila)
	public Fila(int capacidade) {
		fila = new String[capacidade];
		tamanho = 0;
	}
	
	// M�todos
	
	/* M�todo isEmpty - n�o recebe nada e devolve true se a fila
	 * est� vazia e false, caso contr�rio
	 */
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	/* M�todo isFull - n�o recebe nada e devolve true se a fila
	 * est� cheia e false, caso contr�rio
	 */
	public boolean isFull() {
		return tamanho == fila.length;
	}
	
	/* M�todo insert - recebe a info para ser inserida na fila
	 *  Verifica se a fila est� cheia. Se estiver, exibe uma msg.
	 *  Se n�o estiver, coloca a info na fila, �ndice tamanho
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
	
	/* M�todo peek - n�o recebe nada e retorna o primeiro elemento
	 *               da fila (mas sem remov�-lo)
	 */
	
	public String peek() {
		return fila[0];
	}
	
	/* M�todo poll - n�o recebe nada e retorna o primeiro elemento
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
			
			// sugest�o do Matheus Vicente
			// for (int i = 1; i < tamanho; i++ ) {
			//	 fila[i-1] = fila[i];
			// }
			
			fila[tamanho-1] = null; // sobrescreve o �ltimo elemento da fila com null
			tamanho--;  // decrementa o tamanho da fila
			return primeiro;  // retorna o primeiro elemento da fila
		}
	}
	
}
