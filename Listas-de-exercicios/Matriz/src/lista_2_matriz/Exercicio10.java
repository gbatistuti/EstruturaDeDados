package lista_2_matriz;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }

        for (int linha = 0; linha < transposta.length; linha++) {
            for (int coluna = 0; coluna < transposta[linha].length; coluna++) {
                transposta[linha][coluna] = matriz[coluna][linha];
            }
        }
        
        exibeMatriz(transposta);
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

}
