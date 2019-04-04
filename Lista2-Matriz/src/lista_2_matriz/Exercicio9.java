package lista_2_matriz;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        int[][] m3x4 = new int[3][4];
        int[][] m4x2 = new int[4][2];
        int[][] matrizResultante = new int[3][2];

        m3x4 = preencherMatriz(m3x4);
        System.out.println("Agora preencha a segunda matriz: ");
        m4x2 = preencherMatriz(m4x2);

        matrizResultante = multiplicarMatrizes(m3x4, m4x2);
        exibeMatriz(matrizResultante);

    }

    public static int[][] preencherMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }
        return matriz;
    }

    public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2) {
        int[][] matrizResultante = new int[3][2];
        

        for (int linha = 0; linha < matrizResultante.length; linha++) {
            for (int coluna = 0; coluna < matrizResultante[linha].length; coluna++) {
                for (int i = 0; i < 4; i++) {
                    matrizResultante[linha][coluna] += (m1[linha][i] * m2[i][coluna]);
                }
            }
        }
        return matrizResultante;
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
