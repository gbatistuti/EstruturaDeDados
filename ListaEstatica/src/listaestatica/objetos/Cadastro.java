package listaestatica.objetos;

public class Cadastro {

	private Aluno[] listaAluno;
	int nroElem;

	public Cadastro(int tam) {
		listaAluno = new Aluno[tam];
		nroElem = 0;
	}

	public void adicionaAluno(Aluno a) {
		if (nroElem >= listaAluno.length) {
			System.out.println("Não foi possível adicionar " + a.getNome() + ". Lista já está cheia.");
		} else {
			listaAluno[nroElem++] = a;
		}
	}

	public void exibeTodos() {
		for (int c = 0; c < nroElem; c++) {
			System.out.println(listaAluno[c].toString());
		}
	}

	public Aluno buscaRa(int ra) {
		Aluno retorno = null;
		for (int c = 0; c < listaAluno.length; c++) {
			if (listaAluno[c].getRa() == ra) {
				retorno = listaAluno[c];
			}
		}
		return retorno;
	}

}
