/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica;

public class Lista {

	public static void main(String[] args) {
		int indice;
		// cria um objeto da classe Lista com tamanho 5
		ListaEstatica lista = new ListaEstatica(5);
		ListaEstaticString liString = new ListaEstaticString(3);

//		liString.adicionar("Gu");
//		liString.adicionar("Juliana");
//		liString.adicionar("Otavio");
//		
//		liString.exibir();
//		System.out.println(liString.buscar("Ju"));	
//		
//		liString.removerElemento("Gu");
//		liString.exibir();
		

        // adiciona elementos na lista
        if (lista.adicionar(75) == -1)
            System.out.println("NÃ£o conseguiu adicionar o elemento 10");
        else
            System.out.println("Adicionou elemento 10");
        
        if (lista.adicionar(20) == -1)
            System.out.println("NÃ£o conseguiu adicionar o elemento 20");
        else
            System.out.println("Adicionou elemento 20");

        if (lista.adicionarInicio(30) == -1)
            System.out.println("Não conseguiu adicionar o elemento 30");
        else
            System.out.println("Adicionou elemento 30");
        
        if (lista.adicionarInicio(75) == -1)
            System.out.println("Não conseguiu adicionar o elemento 30");
        else
            System.out.println("Adicionou elemento 30");
        
        // Exibe elementos da lista
        lista.exibir();
//
//        // Busca o elemento 20
//        indice = lista.buscar(20);
//        if (indice == -1)
//            System.out.println("Elemento 20 nÃ£o encontrado");
//        else
//            System.out.println("Elemento 20 encontrado no Ã­ndice "
//                                + indice);
//
//        // Busca o elemento 50                        
//        indice = lista.buscar(50);
//        if (indice == -1)
//            System.out.println("Elemento 50 nÃ£o encontrado");
//        else
//            System.out.println("Elemento 50 encontrado no Ã­ndice "
//                                + indice);
//        
        // Remove elemento do Ã­ndice 1
//        if (lista.removerPeloIndice(1)== -1)       
//            System.out.println("Ã�ndice invÃ¡lido");
//        else
//            System.out.println("Removeu o elemento do Ã­ndice 1");
        
        if (lista.removerTodosElem(75)== -1)       
            System.out.println("Elemento não encontrado");
        else
            System.out.println("Removido(s)");
        
        
        // Exibe elementos da lista
        lista.exibir();
        
//        // Remove elemento 10
//        if (lista.removerElemento(10) == 0)
//            System.out.println("Removeu o elemento 10");
//        else
//            System.out.println("Elemento 10 nÃ£o encontrado");
//        
//        // Exibe elementos da lista
//        lista.exibir();
//        
//        
//        Lista lista2 = new Lista(5);
//        if (lista2.adicionarOrdenado(17) == 0)
//            System.out.println("17 inserido com sucesso");
//        else
//            System.out.println("Falha ao inserir o 17");
//        
//        if (lista2.adicionarOrdenado(32) == 0)
//            System.out.println("32 inserido com sucesso");
//        else
//            System.out.println("Falha ao inserir o 32");
//         
//        lista2.exibir();
//        
//        if (lista2.adicionarOrdenado(5) == 0)
//            System.out.println("5 inserido com sucesso");
//        else
//            System.out.println("Falha ao inserir o 5");
//
//        lista2.exibir();
//        
//        if (lista2.adicionarOrdenado(23) == 0)
//            System.out.println("23 inserido com sucesso");
//        else
//            System.out.println("Falha ao inserir o 23");
//
//        lista2.exibir();
//        
	}

}
