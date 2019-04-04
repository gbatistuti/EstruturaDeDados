/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica;

public class Lista {

	public static void main(String[] args) {


		ListaEstatica lista = new ListaEstatica(5);

		if (lista.adicionar(75) == -1)
			System.out.println("NÃ£o conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");

		if (lista.adicionar(20) == -1)
			System.out.println("NÃ£o conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");

		if (lista.adicionarInicio(30) == -1)
			System.out.println("Não conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");

		if (lista.adicionarInicio(75) == -1)
			System.out.println("Não conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");

		if (lista.adicionarNoIndice(87, 5) == -1)
			System.out.println("Não conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");

		if (lista.adicionar(7) == -1)
			System.out.println("NÃ£o conseguiu adicionar o elemento");
		else
			System.out.println("Adicionou elemento");


		lista.substituirElemento(75, 100);


		lista.exibir();

	}
}
