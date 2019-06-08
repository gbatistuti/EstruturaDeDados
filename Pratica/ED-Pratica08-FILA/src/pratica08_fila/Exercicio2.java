package pratica08_fila;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int[] v = {2, 7, -3, -50, 45, -4, 30, -21, 38};
		
		FilaInt f1 = new FilaInt(10);
		FilaInt f2 = new FilaInt(10);
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] >= 0) {
				f1.insert(v[i]);
			} else f2.insert(v[i]);
		}
		
		while(!f1.isEmpty()) {
			System.out.println(f1.poll());
		}
		
		while(!f2.isEmpty()) {
			System.out.println(f2.poll());
		}
		
	}

}
