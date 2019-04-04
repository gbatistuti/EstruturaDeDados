package listaestatica.objetos;

public class AlunoFundamental extends Aluno {

	private double n1, n2, n3, n4;

	public AlunoFundamental(String nome, int ra, double n1, double n2, double n3, double n4) {
		super(nome, ra);
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
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

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	@Override
	double calculaMedia() {
		return (this.getN1() + this.getN2() + this.getN3() + this.getN4()) / 4;
	}

	@Override
	public String toString() {
		return "Aluno: " + super.getNome() + "\nNota 1: " + this.getN1() + "\nNota 2: " + this.getN2() + "\nNota 3: "
				+ this.getN3() + "\nNota 4: " + this.getN4() + "\nMédia: " + calculaMedia()+"\n";
	}

}
