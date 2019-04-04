package listaestatica.objetos;

public class Program {

	public static void main(String[] args) {

		Aluno aF = new AlunoFundamental("Gustavo", 123, 4.5, 10.0, 9.3, 7.9);
		Aluno aG = new AlunoGraduacao("Lohany", 456, 10.0, 6.5);
		Aluno aP = new AlunoPos("Giuliana", 789, 8.3, 10.0, 9.5);
		
		System.out.println(aF.toString());
		System.out.println(aG.toString());
		System.out.println(aP.toString());
		
	}

}
