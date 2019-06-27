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
public class Node {
    
    // Atributos
    private int info;       // informação armazenada no nó
    private Node next;      // endereço do próximo nó da lista

    // Setters e Getters
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
 
    // Construtor
    // Recebe o valor do info para inicializar o nó
    // Atribui sempre null ao next do nó
    public Node(int info) {
        this.info = info;       // inicializa o info do nó
        next = null;            // inicializa o next do nó com null
    } 

}
