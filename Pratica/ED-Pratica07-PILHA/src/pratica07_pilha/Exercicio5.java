package pratica07_pilha;

public class Exercicio5 {

	public static void main(String[] args) {
		String s1 = "Primeira";
		String s2 = "Segunda";
		String s3 = "Terceira";
		String s4 = "Quarta";

		PilhaObj pO = new PilhaObj(4);

		pO.push(s1);
		pO.push(s2);
		pO.push(s3);
		pO.push(s4);

		for (int i = 0; i < 4; i++) {
			System.out.println(pO.pop());
		}
	}

}
