package pratica07_pilha;

public class Exercicio6_Livro {
	private String nome;
	private String autor;

	public Exercicio6_Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Autor: " + autor;
	}
	
	
	public static void main(String[] args) {
		
		PilhaObj p = new PilhaObj(5);
		
		Exercicio6_Livro l1 = new Exercicio6_Livro("Rita", "Clarice");
		Exercicio6_Livro l2 = new Exercicio6_Livro("Glória", "Perez");
		Exercicio6_Livro l3 = new Exercicio6_Livro("John", "Green");
		Exercicio6_Livro l4 = new Exercicio6_Livro("Juscelino", "Rolling");
		
		p.push(l1);
		p.push(l2);
		p.push(l3);
		p.push(l4);
		
		PilhaObj aux = p.multiPop(4);
		System.out.println("Retirando da pilha -> " + p.pop());
		p.multiPush(aux);
		
		while(!p.isEmpty()) {
			System.out.println("Sobrou -> " + p.pop());
		}
		
	}

}
