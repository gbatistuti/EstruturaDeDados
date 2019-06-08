package pratica08_fila;

public class FilaInt {
	private int tamanho;	 
	                       
	private int[] fila;
	
	public FilaInt(int capacidade) {
		fila = new int[capacidade];
		tamanho = 0;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public boolean isFull() {
		return tamanho == fila.length;
	}
	
	public void insert(int info) {
		if (isFull()) {
			System.out.println("Fila cheia");
		}
		else {
			fila[tamanho++] = info;
		}
	}
	
	public int peek() {
		return fila[0];
	}
	
	public int poll() {
		if (isEmpty()) {
			System.out.println("Fila vazia");
			return 0;
		}
		else {
			int primeiro = fila[0]; 

			for (int i = 0; i < tamanho-1; i++) {
				fila[i] = fila[i+1];
			}
			
			fila[tamanho-1] = 0;  
			tamanho--;  
			return primeiro;   
		}
	}
	
}
