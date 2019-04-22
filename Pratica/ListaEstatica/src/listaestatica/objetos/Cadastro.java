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
			if (((Aluno) lista.getObj()[c]).getRa() == ra) {
				return (Aluno) lista.getObj(c);
			}
		}
		return null;
	}

	public void exibirAprovados() {
		for (int i = 0; i < lista.getNroElem(); i++) {
			if (((Aluno) lista.getObj()[i]).calculaMedia() >= 5.0) {
				System.out.println(lista.getObj(i));
			}
		}
	}

	public void exibirSomaMedia() {
		double somaMedias = 0;
		for (int i = 0; i < lista.getNroElem(); i++) {
			somaMedias += ((Aluno) lista.getObj()[i]).calculaMedia();
		}
		System.out.println("A soma das médias calculadas é: " + somaMedias);
	}

	public void exibirAlunosGraduacao() {
		for (int i = 0; i < lista.getNroElem(); i++) {
			if (lista.getObj()[i] instanceof AlunoGraduacao) {
				System.out.println(lista.getObj(i));
			}
		}
	}

}
