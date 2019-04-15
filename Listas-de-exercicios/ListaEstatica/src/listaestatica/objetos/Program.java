package listaestatica.objetos;

public class Program {

	public static void main(String[] args) {

		Aluno aF = new AlunoFundamental("Gustavo", 123, 4.5, 10.0, 9.3, 7.9);
		Aluno aG = new AlunoGraduacao("Lohany", 456, 10.0, 6.5);
		Aluno aP = new AlunoPos("Giuliana", 789, 8.3, 10.0, 9.5);
		Aluno aF2 = new AlunoFundamental("Gabizinha", 159, 10.0, 3.0, 0.0, 10.0);
		Aluno aP2 = new AlunoPos("Silvia", 278, 0, 0, 10);

//		System.out.println(aF);
//		System.out.println(aG);
//		System.out.println(aP);

		Cadastro lista = new Cadastro(5);

		lista.adicionaAluno(aF);
		lista.adicionaAluno(aG);
		lista.adicionaAluno(aP);
		lista.adicionaAluno(aF2);
		lista.adicionaAluno(aP2);
		
		
		System.out.println("\n-----EXIBINDO TODOS------\n");
		lista.exibeTodos();
		
		System.out.println("\n-----BUSCANDO RA------\n");
		int raBuscado = 456;
		if (lista.buscaRa(raBuscado) == null) {
			System.out.println("Não foi encontrado nenhuma referência com RA: " + raBuscado);
		} else {
			System.out.println(lista.buscaRa(raBuscado));
		}
		
		
		System.out.println("\n-----APROVADOS------\n");
		lista.exibirAprovados();
		
		System.out.println("\n-----SOMA DAS MÉDIAS------\n");
		lista.exibirSomaMedia();
		
		System.out.println("\n-----ALUNO GRADUAÇÃO------\n");
		lista.exibirAlunosGraduacao();
	}

}
