package listaEstaticaFigura;

public class Triangulo extends Figura {

	private double baseT, altura;

	public Triangulo(double baseT, double altura) {
		super();
		this.baseT = baseT;
		this.altura = altura;
	}

	public double getBaseT() {
		return baseT;
	}

	public void setBaseT(double baseT) {
		this.baseT = baseT;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Base do tri‚ngulo: " + getBaseT() + "\nAltura do tri‚ngulo: " + getAltura() + "\n¡rea do tri‚ngulo: "
				+ calculaArea()+ "\n";
	}

	@Override
	double calculaArea() {
		return (getBaseT() * getAltura()) / 2;
	}

}
