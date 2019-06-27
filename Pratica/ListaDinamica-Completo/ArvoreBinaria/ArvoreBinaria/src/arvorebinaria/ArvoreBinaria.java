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
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cria um objeto da classe ArvBin
        ArvBin arv= new ArvBin();
        
        // Cria a raiz da árvore com valor 6
        arv.criaRaiz(6);
        
        // Cria e insere os filhos esquerdo e direito da raiz
        Node no4= arv.insereEsq(arv.getRaiz(), 4);
        Node no8= arv.insereDir(arv.getRaiz(), 8);
        
        // Cria e insere os filhos esquerdo e direito no nó 4
        Node no2= arv.insereEsq(no4, 2);
        Node no5= arv.insereDir(no4, 5);
        
        // Cria e insere os filhos esquerdo e direito no nó 8
        Node no7= arv.insereEsq(no8, 7);
        Node no9= arv.insereDir(no8, 9);
        
        // Cria e insere os filhos esquerdo e direito no nó 2
        Node no1= arv.insereEsq(no2, 1);
        Node no3= arv.insereDir(no2, 3);
        
        // Exibe a árvore
        arv.exibeArv(arv.getRaiz());
        
        // Exibe os nós em pre-ordem
        System.out.println("\nPre-ordem:");
        arv.preOrdem(arv.getRaiz());
        System.out.println("");
        
        // Exibe os nós em em-ordem
        System.out.println("\nEm-ordem:");
        arv.emOrdem(arv.getRaiz());
        System.out.println("");

        // Exibe os nós em pós-ordem
        System.out.println("\nPós-ordem:");
        arv.posOrdem(arv.getRaiz());
        System.out.println("");
    }
    
}
