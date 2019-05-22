
public class AC3 {
	
	public static void main(String[] args) {
		
		int v[] = {2, 7, 3, 50, 46, 4, 30, 22, 8, 10};
		
		Pilha p = new Pilha(10);
		Fila f = new Fila(10);
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] <= 18) {
				f.insert(v[i]);
			} else {
				p.push(v[i]);
			}
		}
		
		while(!f.isEmpty()) {
			System.out.println(f.poll());
		}
		
		while(!p.isEmpty()) {
			System.out.println(p.pop());
		}
		
	}

}
