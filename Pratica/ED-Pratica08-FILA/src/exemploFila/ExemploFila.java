package exemploFila;

public class ExemploFila {

	public static void main(String[] args) {
		/* cria um objeto da classe Fila, com capacidade para 5 Strings */
		Fila f = new Fila(5);

		/* Insere 5 Strings */
		f.insert("Marco Aur�lio");
		f.insert("Volpe");
		f.insert("Natanael");
		f.insert("Michel");
		f.insert("Proc�pio");
		/* Tenta inserir a 6a String, mas a fila est� cheia */
		f.insert("J�ssica");
		
		/* Consulta 2 vezes quem � o primeiro da fila */
		System.out.println("O primeiro da fila � " + f.peek());
		System.out.println("O primeiro da fila � " + f.peek());

		/* Remove um elemento da fila e consulta quem � o primeiro */
		System.out.println("Retirando o elemento: "+ f.poll());
		System.out.println("O primeiro da fila � " + f.peek());
		
		/* Remove mais um elemento da fila e consulta quem � o primeiro */
		System.out.println("Retirando o elemento: "+ f.poll());
		System.out.println("O primeiro da fila � " + f.peek());

		/* Insere mais 2 Strings */
		f.insert("J�ssica");
		f.insert("Vit�ria");
		
		/* Esvazia a fila, removendo e exibindo um por um */
		System.out.println("\nEsvaziando a fila");
		while (!f.isEmpty()) {
			System.out.println("Retirando o elemento: "+ f.poll());
		}
	}

}
