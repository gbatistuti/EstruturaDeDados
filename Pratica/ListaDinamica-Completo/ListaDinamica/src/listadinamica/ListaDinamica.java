/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica;

/**
 *
 * @author celia.taniwaki
 */
public class ListaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cria um objeto lista da classe ListaLigada
        ListaLigada lista= new ListaLigada();

        // Insere valores na lista
        lista.insert(10);
        lista.insert(20);
        lista.insert(30);
        
        // Exibe o conteúdo da lista
        lista.exibe();
        
        // Exibe o tamanho da lista
        System.out.println("Tamanho da lista:" + lista.getTamanho());
        
        // Verifica se existe o valor 20 na lista
        if (lista.buscaNode(20)== null) {
            System.out.println("Valor 20 não encontrado");
        }
        else {
            System.out.println("Valor 20 encontrado");
        }
        
        // Verifica se existe o valor 100 na lista
        if (lista.buscaNode(100) == null) {
            System.out.println("Valor 100 não encontrado");
        }
        else {
            System.out.println("Valor 100 encontrado");
        }
        
        // Remove o nó com valor 20
        if (lista.removeNode(20)) {
            System.out.println("Nó 20 removido");
        }
        else {
            System.out.println("Nó 20 não encontrado");
        }
        
        // exibe a lista
        lista.exibe();
        
        // Exibe o tamanho da lista
        System.out.println("Tamanho da lista:" + lista.getTamanho());

        // Remove o nó com valor 100
        if (lista.removeNode(100)) {
            System.out.println("Nó 100 removido");
        }
        else {
            System.out.println("Nó 100 não encontrado");
        }
        
        
        
    }
    
}
