package pratica07_pilha;

public class Exercicio4 {

 public static void main(String[] args) {
	 String palavra = "kaiak";
	 char[] p1 = palavra.toCharArray();
	 
	 if(ehPalindromo(p1)) {
		 System.out.println("É palíndromo");
	 } else {
		 System.out.println("Não é palindromo");
	 }
	 
	
}
 
 public static boolean ehPalindromo(char[] c) {
	 PilhaChar p = new PilhaChar(c.length);
	 
	 for(int i = 0; i < c.length; i++) {
		 p.push(c[i]);
	 }
	 
	 for(int i = 0; i < c.length; i++) {
		 if(p.pop() != c[i]) {
			 return false;
		 }
		 return true;
	 }
	 
	 
	 return false;
 }
	
}
