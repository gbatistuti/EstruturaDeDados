package listaEstaticaFigura;

public class Quadrado extends Figura {

	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calculaArea() {
		return getLado() * getLado();
	}

	@Override
	public String toString() {
		return "O tamanho do lado do quadrado é: " + getLado() + "\n Sua área calculada é: " + this.calculaArea()+ "\n";
	}

}
