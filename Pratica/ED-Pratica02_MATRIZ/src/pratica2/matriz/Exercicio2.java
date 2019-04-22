package pratica2.matriz;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        //Cria uma matriz 3x4, preenche-a com números
        //digitados pelo usuário
        //Depois imprime esses números no formato de matriz
        int[][] matriz1 = new int[2][3];
        int[][] matriz2 = new int[2][3];
        
        
        criarMatriz(matriz1);
        exibeMatriz(matriz1);
       
        criarMatriz(matriz2);
        exibeMatriz(matriz2);
        
        System.out.println("A soma das duas matrizes é:");
        exibeMatriz(somarMatrizes(matriz1, matriz2));
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

    }

    public static void criarMatriz(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz[" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    public static int[][] somarMatrizes(int matriz1[][], int matriz2[][]){
        int[][] matriz3 = new int[2][3];
        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
                matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        
        return matriz3;
    }
}
