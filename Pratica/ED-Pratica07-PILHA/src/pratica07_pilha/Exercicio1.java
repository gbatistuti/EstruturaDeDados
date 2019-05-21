package pratica07_pilha;

public class Exercicio1 {
	
	public static boolean ehPalindromo(int[] v) {
		// cria um objeto da Pilha do tamanho do vetor v
		Pilha p = new Pilha(v.length);
		
		// percorre o vetor v, empilhando todos os elementos de v
		for (int i =0; i < v.length; i++) {
			p.push(v[i]);
		}
		
		// percorre novamente o vetor, 
		// desempilhando os elementos da pilha e comparando com os 
		// elementos do vetor
		// como os elementos da pilha, ao ser desempilhados, correspondem
		// aos elementos do vetor, de trás para frente
		// então, se algum for diferente, a sequencia não é palíndromo
		for (int i=0; i < v.length ; i++) {
			if (p.pop() != v[i])
				return false;
		}
		
		// retorna true, indicando que é palíndromo
		// pois todos os elementos desempilhados correspondem exatamente
		// a cada elemento do vetor
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
         int[] vetor = {10, 20, 30, 30, 20, 10};
         int[] vet2 = { 10, 20, 30, 40};
         
         if (ehPalindromo(vetor)) {
        	 System.out.println("vetor é palíndromo");
         }
         else {
        	 System.out.println("vetor não é palíndromo");
         }
         
         if (ehPalindromo(vet2)) {
        	 System.out.println("vet2 é palíndromo");
         }
         else {
        	 System.out.println("vet2 não é palíndromo");
         }

	}

}
