package pratica07_pilha;

public class Exercicio3 {

	public static void main(String[] args) {
		String frase = "A pilha do gato";
		char[] fraseChar = frase.toCharArray();
		inverter(fraseChar);
	}

	public static void inverter(char[] c) {
		
		PilhaChar p = new PilhaChar(c.length);
		
		for (int i = 0; i < c.length; i++) {
			p.push(c[i]);
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(p.pop());
		}
	}
}
