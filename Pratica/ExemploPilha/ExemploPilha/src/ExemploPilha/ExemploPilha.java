package ExemploPilha;

public class ExemploPilha {

	public static void main(String[] args) {
		// cria um objeto da classe Pilha
		Pilha p = new Pilha(5);
		// empilha valores no objeto p
		p.push(10);
		p.push(20);
		p.push(30);
		p.push(40);
		p.push(50);
		p.push(60);
		
		System.out.println("\nDesempilhando:");
		while (!p.isEmpty()) {  // enquanto p não está vazia
			System.out.println(p.pop());  // desempilha e exibe
		}
	}

}
