package atividade_baralho;

public class Carta {
	
	private String face;
	private String naipe;
	private int valor;
	
	public Carta(String face, String naipe, int valor) {
		this.face = face;
		this.naipe = naipe;
		this.valor = valor;
	}
	
	public Carta() {}
	
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return face + " de " + naipe;
	}
	
	

}
