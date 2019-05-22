package pratica07_pilha;

public class PilhaObj {

	private Object[] pilha;
	private int topo;

	public PilhaObj(int capacidade) {
		this.pilha = new Object[capacidade];
		this.topo = -1;
	}

	public boolean isEmpty() {
		return topo == -1;
	}

	public boolean isFull() {
		return topo == pilha.length - 1;
	}

	public void push(Object info) {
		if (isFull()) {
			System.out.println("Pilha cheia");
		} else {
			pilha[++topo] = info;
		}
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("Pilha vazia");
			return -1;
		} else {
			return pilha[topo--];
		}
	}

	PilhaObj multiPop(int n) {

		if (n < pilha.length) {
			PilhaObj aux = new PilhaObj(n);
			for (int i = 0; i < n; i++) {
				aux.push(this.pop());
			}
			return aux;
		}
		return null;
	}

	void multiPush(PilhaObj aux) {
		while (!aux.isEmpty()) {
			this.push(aux.pop());
		}
	}

}
