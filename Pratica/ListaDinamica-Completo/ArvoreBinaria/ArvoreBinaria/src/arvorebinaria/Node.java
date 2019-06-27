/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author celia.taniwaki
 */
public class Node {

    // Atributos
    private int elemento;   // valor do nó
    private Node esq;       // endereço do filho esquerdo
    private Node dir;       // endereço do filho direito

    // Setters e getters
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Node getEsq() {
        return esq;
    }

    public void setEsq(Node esq) {
        this.esq = esq;
    }

    public Node getDir() {
        return dir;
    }

    public void setDir(Node dir) {
        this.dir = dir;
    }
    
    // Construtor
    public Node(int elemento) {
        this.elemento= elemento;
        esq= null;
        dir= null;
    }

    
}
