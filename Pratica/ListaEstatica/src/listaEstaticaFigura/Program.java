package listaEstaticaFigura;

public class Program {

	public static void main(String[] args) {

		Figura circ = new Circulo(10);
		Figura quad = new Quadrado(5);
		Figura tri = new Triangulo(10, 7);
		Figura ret = new Retangulo(25, 10);

		System.out.println("-----CALCULANDO ÁREAS-----\n");
		System.out.println(circ.calculaArea());
		System.out.println(quad.calculaArea());
		System.out.println(tri.calculaArea());
		System.out.println(ret.calculaArea());
		
		Imagem img = new Imagem(5);
		img.adicionarFigura(circ);
		img.adicionarFigura(quad);
		img.adicionarFigura(tri);
		img.adicionarFigura(ret);
		
		System.out.println("\n----EXIBINDO FIGURAS----\n");
		img.exibirFiguras();
		
		System.out.println("\n----EXIBINDO FIGURAS COM ÁREA MAIOR QUE 20----\n");
		img.exibirFiguraAreaMaior20();
		
		System.out.println("\n----EXIBINDO QUADRADO----\n");
		img.exibirQuadrado();
	}

}
