package listaEstaticaFigura;

public abstract class Figura {

	private String cor;
	private int espessura;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getEspessura() {
		return espessura;
	}

	public void setEspessura(int espessura) {
		this.espessura = espessura;
	}

	abstract double calculaArea();

	public String toString() {
		return "A cor da figura é: " + getCor() + " e a espessura do contorno é: " + getEspessura();
	}

}
