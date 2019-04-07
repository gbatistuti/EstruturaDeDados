package listaestatica.objetos;

public abstract class Aluno {

	private String nome;
	private int ra;

	public Aluno(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}

	
	public int getRa() {
		return ra;
	}

	
	public void setRa(int ra) {
		this.ra = ra;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	abstract double calculaMedia();

	
	public String toString() {

		return "Aluno: " + getNome() + " RA: " + getRa();

	}
}
