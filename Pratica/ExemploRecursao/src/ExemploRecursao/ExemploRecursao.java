package ExemploRecursao;

public class ExemploRecursao {
	
	/* Exemplo de método recursivo */
	/* Recebe o valor de n, e exibe os números de n até zero. */
	public static void contagemRegressiva(int n) {
		if (n < 0) {		/* se n é negativo */
			return;			/* retorna sem fazer nada */
		}
		else {    /* senão (n é positivo)  */
			System.out.println(n);   /* exibe o valor de n */
			contagemRegressiva(n-1); /* chama recursivamente o método
			                             para exibir de n-1 até zero */
		}
	}
	
	

	public static void main(String[] args) {
		/* chama o método acima, passando o valor 5 */
		contagemRegressiva(5);

	}

}
