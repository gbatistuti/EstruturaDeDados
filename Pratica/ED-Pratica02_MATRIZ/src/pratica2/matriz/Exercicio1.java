package pratica2.matriz;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        Scanner leitor = new Scanner(System.in);
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz ["+ linha +"] ["+ coluna +"]:");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        
        exibeMatriz(matriz);
    }
    
    public static void exibeMatriz(int [][] matriz){
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        
    }

}
