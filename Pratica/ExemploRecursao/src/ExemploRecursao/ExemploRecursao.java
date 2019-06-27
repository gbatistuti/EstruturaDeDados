package ExemploRecursao;

public class ExemploRecursao {
	
	/* Exemplo de m�todo recursivo */
	/* Recebe o valor de n, e exibe os n�meros de n at� zero. */
	public static void contagemRegressiva(int n) {
		if (n < 0) {		/* se n � negativo */
			return;			/* retorna sem fazer nada */
		}
		else {    /* sen�o (n � positivo)  */
			System.out.println(n);   /* exibe o valor de n */
			contagemRegressiva(n-1); /* chama recursivamente o m�todo
			                             para exibir de n-1 at� zero */
		}
	}
	
	

	public static void main(String[] args) {
		/* chama o m�todo acima, passando o valor 5 */
		contagemRegressiva(5);

	}

}
