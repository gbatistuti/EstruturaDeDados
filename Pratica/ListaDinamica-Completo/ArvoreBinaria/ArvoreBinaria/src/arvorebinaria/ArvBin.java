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
public class ArvBin {
    // Atributo
    private Node raiz;          // raiz da árvore

    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
    
    // Construtor - árvore binária vazia não tem raiz
    public ArvBin() {
        raiz= null;     // atribui null para a raiz
    }
    
    // Métodos

    /* Método criaRaiz - recebe o valor do nó raiz
       Cria o objeto Node com esse valor e atribui para a raiz
    */

    public Node criaRaiz(int valor) {
        raiz = new Node(valor);     // cria o objeto Node com o valor recebido
                                    // como argumento e atribui esse objeto
                                    // para o atributo raiz
        return raiz;                            
    }
    

    /* Método InsereDir - recebe o endereço de um nó chamado de pai, e o valor do novo nó
     * Cria um novo nó e insere esse nó como filho direito do nó pai
     * Se a árvore está vazia ou se o pai já tem filho direito, não insere
     * Retorna o endereço do novo nó, caso a inserção tenha sido bem sucedida
     * Caso contrário, retorna null
     */ 
    public Node insereDir(Node pai, int valor) {
        // se a árvore está vazia ou se o pai já tem um filho direito
        // então retorna null
        if (raiz == null || pai.getDir() != null) {
            return null;
        }
        
        Node novo = new Node(valor); // cria um nó novo com o valor recebido
                                     // como argumento
        
        // faz o nó novo ser o filho direito do nó pai                             
        pai.setDir(novo);
        
        return novo;
    }
    
    
    /* Método InsereEsq - recebe o endereço de um nó chamado de pai, e o valor do novo nó
     * Cria um novo nó e insere esse nó como filho esquerdo do nó pai
     * Se a árvore está vazia e se o pai já tem filho esquerdo, não insere
     * Retorna o endereço do novo nó, caso a inserção tenha sido bem sucedida
     * Caso contrário, retorna null
     */
    public Node insereEsq(Node pai, int valor) {
        // se a árvore está vazia ou se o pai já tem um filho esquerdo
        // então retorna null
        if (raiz == null || pai.getEsq() != null) {
            return null;
        }
        
        Node novo = new Node(valor); // cria um nó novo com o valor recebido
                                     // como argumento
        
        // faz o nó novo ser o filho esquerdo do nó pai                             
        pai.setEsq(novo);
        
        return novo;
    }
    
    // Método exibeArv()
    public void exibeArv(Node node) {
        if (node != null) {
            // exibe o valor do nó node
            System.out.print("Valor: " + node.getElemento()); 
            
            // exibe o filho esquerdo do nó node
            if (node.getEsq() == null) {
                System.out.print("\tEsq: --"); // se não tem filho esq, exibe --
            }
            else {          // senão exibe o valor do filho esq
                System.out.print("\tEsq: " + node.getEsq().getElemento());
            } 
            
            // exibe o filho direito do nó node
            if (node.getDir() == null) {
                System.out.print("\tDir: --"); // se não tem filho dir, exibe --
            }
            else {          // senão exibe o valor do filho dir
                System.out.print("\tDir: " + node.getDir().getElemento());
            }

            // muda para a próxima linha
            System.out.println("");

            // chama recursivamente o método exibeArv para exibir
            // a subárvore do lado esquerdo
            exibeArv(node.getEsq());

            // chama recursivamente o método exibeArv para exibir
            // a subárvore do lado direito
            exibeArv(node.getDir());
            
        }
        
    }
            
    // Exibe os nós da árvore seguindo o percurso pré-ordem
    public void preOrdem(Node node) {
        if (node != null) {
            System.out.print(node.getElemento() + "\t"); // exibe o valor do nó
            preOrdem(node.getEsq());     // exibe recursivamente a subarvore esquerda       
            preOrdem(node.getDir());     // exibe recursivamente a subarvore direita
        }
    }       
            
    // Exibe os nós da árvore seguindo o percurso em-ordem
    public void emOrdem(Node node) {
        if (node != null) {
            emOrdem(node.getEsq());         // exibe recursivamente a subarevore esquerda
            System.out.print(node.getElemento() + "\t");    // exibe o valor do nó
            emOrdem(node.getDir());         // exibe recursivamente a subarvore direita
        }
    }       
            
    // Exibe os nós da árvore seguindo o percurso pos-ordem
    public void posOrdem(Node node) {
        if (node != null) {
            posOrdem(node.getEsq());        // exibe recursivamente a subarvore esquerda
            posOrdem(node.getDir());        // exibe recursivamente a subarvore direita
            System.out.print(node.getElemento() + "\t");    // exibe o valor do nó
        }
    }               
            
            
            
            
    
    
}
