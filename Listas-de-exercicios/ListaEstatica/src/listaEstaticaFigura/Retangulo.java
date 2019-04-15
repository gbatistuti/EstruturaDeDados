package listaEstaticaFigura;

public class Retangulo extends Figura {

	private double baseR, altura;

	public Retangulo(double baseR, double altura) {
		this.baseR = baseR;
		this.altura = altura;
	}

	public double getBaseR() {
		return baseR;
	}

	public void setBaseR(double baseR) {
		this.baseR = baseR;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double calculaArea() {
		return getBaseR() * getAltura();
	}

	@Override
	public String toString() {
		return "Altura do retângulo: " + getAltura() + "\n Base do retângulo: " + getBaseR() + "\n Área do retângulo: "
				+ calculaArea() + "\n";
	}

}
