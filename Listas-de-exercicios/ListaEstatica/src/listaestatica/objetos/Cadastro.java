package listaestatica.objetos;

public class Cadastro {

	private ListaObj lista;

	public Cadastro(int tam) {
		lista = new ListaObj(tam);
	}

	public void adicionaAluno(Aluno a) {
		lista.adicionar(a);
	}

	public void exibeTodos() {
		lista.exibir();
	}

	public Aluno buscaRa(int ra) {
		for (int c = 0; c < lista.getNroElem(); c++) {
			if ( ((Aluno)lista.getObj()[c]).getRa() == ra) {
				return (Aluno)lista.getObj(c);
			}
		}
		return null;
	}

}
