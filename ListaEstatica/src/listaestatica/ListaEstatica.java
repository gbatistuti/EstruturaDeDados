/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica;

/**
 *
 * @author celia.taniwaki
 */
public class ListaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice;
        // cria um objeto da classe Lista com tamanho 5
        Lista lista = new Lista(5);

        // adiciona elementos na lista
        if (lista.adicionar(10) == -1)
            System.out.println("Não conseguiu adicionar o elemento 10");
        else
            System.out.println("Adicionou elemento 10");
        
        if (lista.adicionar(20) == -1)
            System.out.println("Não conseguiu adicionar o elemento 20");
        else
            System.out.println("Adicionou elemento 20");

        if (lista.adicionar(30) == -1)
            System.out.println("Não conseguiu adicionar o elemento 30");
        else
            System.out.println("Adicionou elemento 30");
        
        // Exibe elementos da lista
        lista.exibir();

        // Busca o elemento 20
        indice = lista.buscar(20);
        if (indice == -1)
            System.out.println("Elemento 20 não encontrado");
        else
            System.out.println("Elemento 20 encontrado no índice "
                                + indice);

        // Busca o elemento 50                        
        indice = lista.buscar(50);
        if (indice == -1)
            System.out.println("Elemento 50 não encontrado");
        else
            System.out.println("Elemento 50 encontrado no índice "
                                + indice);
        
        // Remove elemento do índice 1
        if (lista.removerPeloIndice(1)== -1)       
            System.out.println("�?ndice inválido");
        else
            System.out.println("Removeu o elemento do índice 1");
        
        // Exibe elementos da lista
        lista.exibir();
        
        // Remove elemento 10
        if (lista.removerElemento(10) == 0)
            System.out.println("Removeu o elemento 10");
        else
            System.out.println("Elemento 10 não encontrado");
        
        // Exibe elementos da lista
        lista.exibir();
         
         
         
         }
    

        
    
    
}
