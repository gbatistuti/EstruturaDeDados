package listaEstaticaFigura;

public class Circulo extends Figura {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "O raio do círculo é " + getRaio() + "\nA área do círdulo é: " + calculaArea()+ "\n";
	}

	@Override
	double calculaArea() {
		return Math.PI * getRaio() * getRaio();
	}

}
