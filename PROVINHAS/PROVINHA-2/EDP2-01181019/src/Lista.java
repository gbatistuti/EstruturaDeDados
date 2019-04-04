
public class Lista {

	public static void main(String[] args) {
		
		ListaEstatica lista = new ListaEstatica(5);
		
		if (lista.adicionarNoIndice(2, 0) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");
        
        if (lista.adicionarNoIndice(10, 1) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");

        if (lista.adicionarNoIndice(15, 0) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");
        
        if (lista.adicionarNoIndice(12, 1) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");
        
        lista.exibir();
        
        if (lista.adicionarNoIndice(12, 1) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");
        
        
        lista.exibir();
        
        if (lista.substituirElemento(12, 111) == -1)
            System.out.println("Não conseguiu adicionar o elemento");
        else
            System.out.println("Adicionou elemento");
        
        lista.exibir();

	}

}
