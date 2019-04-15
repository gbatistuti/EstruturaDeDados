package listaEstaticaFigura;

import listaestatica.objetos.ListaObj;

public class Imagem {

	private ListaObj listaImagem;
	
	public Imagem(int tam) {
		listaImagem = new ListaObj(tam);
	}

	void adicionarFigura(Figura f) {
		listaImagem.adicionar(f);
	}

	void exibirFiguras() {
		listaImagem.exibir();
	}

	void exibirSomaArea() {
		double somaAreas = 0;
		for (int i = 0; i < listaImagem.getNroElem(); i++) {
			somaAreas += ((Figura) listaImagem.getObj()[i]).calculaArea();
		}
		System.out.println("A soma das áreas é: " + somaAreas);
	}
	
	void exibirFiguraAreaMaior20() {
		for (int i = 0; i < listaImagem.getNroElem(); i++) {
			if(((Figura) listaImagem.getObj()[i]).calculaArea() > 20) {
				System.out.println(listaImagem.getObj(i));
			}
		}
	}
	
	void exibirQuadrado() {
		for (int i = 0; i < listaImagem.getNroElem(); i++) {
			if(listaImagem.getObj()[i] instanceof Quadrado) {
				System.out.println(listaImagem.getObj(i));
			}
		}
	}

}
