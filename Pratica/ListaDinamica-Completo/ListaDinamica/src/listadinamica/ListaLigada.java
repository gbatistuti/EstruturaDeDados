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
public class ListaLigada {
    
    // Atributo
    private Node head;

    // Setter e Getter
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    // Construtor
    // Cria o nó referente ao Head com info zerado
    public ListaLigada() {
        head = new Node(0);
    }

    // Métodos

    /* Método insert(int info)
       Cria um nó novo com valor igual ao info
       Insere esse nó novo na lista, a partir do head 
    */
    public void insert(int info) {
        Node novo = new Node(info);     // cria um nó novo com valor igual ao info
        novo.setNext(head.getNext());   // faz o nó novo apontar para o
                                        // antigo primeiro nó da lista
        head.setNext(novo);     // faz o next do head ter o endereço do novo
                                // ou seja, novo passa a ser o 1o nó da lista
    }
    
    /* Método exibe - exibe o conteúdo da lista */
    public void exibe() {
       Node atual = head.getNext();     // atual contém o endereço do primeiro nó da lista
              
       while (atual != null) {          // enquanto atual é diferente de null (não acabou a lista)
           System.out.println(atual.getInfo()); // exibe o info de atual
           atual = atual.getNext();             // faz atual ter o endereço do proximo nó
       }
   }
    
    /* Método buscaNode - recebe um valor para ser pesquisado na lista
       Retorna o endereço do primeiro nó com esse valor, caso ele exista
       ou null, caso ele não exista na lista
    */
    public Node buscaNode(int valor) {
       Node atual = head.getNext();         // atual contém end. do 1o nó da lista
       
       while (atual != null) {              // enquanto atual diferente de null
           if (atual.getInfo() == valor) {  // verifica se info do atual = valor
               return atual;                // se for, retorna atual
           }
           atual = atual.getNext();         // senão, atual recebe end. do próx nó
       }
       return null;         // retorna null (não encontrou)
    }
    
    /* Método removeNode - recebe o valor do nó a ser removido
       Se encontrar o nó com esse valor, remove esse nó da lista
       e retorna true.
       Se não encontrar esse nó, retorna false
    */
    public boolean removeNode(int valor) {
        Node ant = head;         // ant recebe o end. do head (representa
                                 //  o nó anterior ao nó atual) 
        Node atual = head.getNext();    // atual recebe o end. do 1o nó da lista
        
        while (atual != null) {         // enquanto não terminou a lista
            if (atual.getInfo() == valor) {     // verifica se atual tem info = valor
                ant.setNext(atual.getNext());   // se tiver, remove o nó atual
                                                // fazendo o next do anterior receber
                                                // o next do atual
                return true;                    // e retorna true
            }
            // faz o ant e o atual "avançarem na lista"
            ant = atual;  // ou ant = ant.getNext();
            atual = atual.getNext();
        }
        
        return false;       // não encontrou o nó com info = valor
    }
    
    /* Método getTamanho() - retorna o tamanho da lista
    */
    public int getTamanho() {
        int tam = 0;            // inicializa tam com zero
        Node atual = head.getNext();    // atual recebe end. do 1o nó da lista
        
        while (atual != null) {     // enqto a lista não acabou
            tam++;                      // incrementa tam   
            atual = atual.getNext();    // faz atual receber end. do prox nó
        }
        return tam;     // retorna tam
    }
 
    
}
