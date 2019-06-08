package pratica08_fila;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		FilaCircular f = new FilaCircular(5);
		
		String v1 = "1";
		String v2 = "2";
		String v3 = "3";
		String v4 = "4";
		String v5 = "5";
		String v6 = "6";
		
		f.insert(v1);
		f.insert(v2);
		f.insert(v3);
		f.insert(v4);
		f.insert(v5);
//		f.insert(v6);
		
		System.out.println(f.peek());
		
	}

}
