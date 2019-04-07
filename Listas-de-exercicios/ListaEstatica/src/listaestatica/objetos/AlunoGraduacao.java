package listaestatica.objetos;

public class AlunoGraduacao extends Aluno {

	private double n1, n2;

	public AlunoGraduacao(String nome, int ra, double n1, double n2) {
		super(nome, ra);
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	@Override
	double calculaMedia() {
		return (this.getN1() * 0.4) + (this.getN2() * 0.6) / 2;
	}

	@Override
	public String toString() {
		return "Aluno: " + super.getNome() + "\nNota 1: " + this.getN1() + "\nNota 2: " + this.getN2() + "\nMédia: "
				+ calculaMedia()+"\n";
	}

}
