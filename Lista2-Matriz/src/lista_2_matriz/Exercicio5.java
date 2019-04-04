package lista_2_matriz;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int[][] matriz = new int[4][2];

        for (int c = 0; c < vetor1.length; c++) {
            vetor1[c] = new Scanner(System.in).nextInt();
        }

        for (int c = 0; c < vetor1.length; c++) {
            vetor2[c] = new Scanner(System.in).nextInt();
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            int col = 0;
            matriz[linha][col] = vetor1[linha];
            matriz[linha][col + 1] = vetor2[linha];
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println("");
        }
    }

}
