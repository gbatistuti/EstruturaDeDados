package listaestatica.objetos;

public class AlunoPos extends Aluno {

	private double n1, n2, notaMonografia;

	public AlunoPos(String nome, int ra, double n1, double n2, double notaMonografia) {
		super(nome, ra);
		this.n1 = n1;
		this.n2 = n2;
		this.notaMonografia = notaMonografia;
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

	public double getNotaMonografia() {
		return notaMonografia;
	}

	public void setNotaMonografia(double notaMonografia) {
		this.notaMonografia = notaMonografia;
	}

	@Override
	double calculaMedia() {
		return (this.getN1() + this.getN2() + getNotaMonografia()) / 3;
	}

	@Override
	public String toString() {
		return "Aluno: " + super.getNome() + "\nNota 1: " + this.getN1() + "\nNota 2: " + this.getN2()
				+ "\nNota Monografia: " + getNotaMonografia() + "\nMédia: " + calculaMedia()+"\n";
	}

}
