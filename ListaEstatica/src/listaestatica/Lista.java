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
public class Lista {
    // Atributos
    private int[] vetor;   // vetor onde serão armazenados os elementos da lista
    private int nroElem;   // quantidade de elementos que estão armazenados
                           // na lista (e tb representa o índice de onde
                           // será colocado o próx elemento na lista)
    
    // Construtor
    // Recebe o tamanho da lista a ser criada
    public Lista(int tam) {
        vetor = new int[tam];   // cria o vetor com o tamanho tam
        nroElem = 0;            // zera o nroElem
    }
    
    // Métodos
    
    /* Método adicionar - recebe um elemento que será colocado na lista
       Se não conseguir adicionar, devolve -1
       Se conseguir adicionar, devolve zero
    */
    public int adicionar(int elem){
        if (nroElem >= vetor.length) {  /* se a lista está cheia */
            return -1;                  /* então retorna -1 */
        }
        vetor[nroElem++] = elem;   /* coloca o elem na lista, no índice
                                      nroElem, e incrementa nroElem
                                    */
        //nroElem++;
        return 0;                  // retorna zero 
    }
    
    /* Método exibir - exibe os elementos que estão na lista */
    public void exibir() {
        System.out.println("\nLista:");
        /* percorre o vetor enquanto o indice i for menor do que nroElem
           exibindo os elementos da lista
        */
        for (int i=0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }
    
    /* Método buscar - recebe um elemento a ser procurado na lista
       Devolve o índice do elemento, caso encontre
       ou -1, caso não encontre
    */
    public int buscar(int elem) {
        // percorre o vetor enquanto o índice i < nroElem
        for (int i=0; i < nroElem; i++) {
            if (vetor[i] == elem) {  // se o vetor[i] é o elem procurado
                return i;            // retorna o índice i
            }
        }
        return -1;    // se não encontrou, retorna -1
    }
    
    /* Método removerPeloIndice - recebe o índice do elem a ser removido
       Se não removeu, retorna -1
       Se removeu, retorna zero
    */
    public int removerPeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return -1;
        }
        /* desloca os elementos da lista, de forma que não
           fique "buraco"
        */
        for (int i=indice; i < nroElem-1; i++) {
            vetor[i] = vetor[i+1];
        }
        nroElem--;
        return 0;
    }
    
    /* Método removerElemento - recebe o elemento a ser removido
       Retorna -1 se não encontrou ou zero se removeu
    */
    public int removerElemento(int elem) {
        // chama o método buscar para obter o índice do elem
        // ou -1 caso não encontre elem
        // passa o índice devolvido para o removerPeloIndice
        return removerPeloIndice(buscar(elem));
    }
    
    
}
