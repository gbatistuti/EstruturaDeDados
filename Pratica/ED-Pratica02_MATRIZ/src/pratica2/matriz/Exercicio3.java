package pratica2.matriz;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor relacionado à linha " + (linha + 1) + " e coluna " + (coluna + 1) + "");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }

        for (int c = 0; c < vetor.length; c++) {
            vetor[c] = matriz[0][c] + matriz[1][c] + matriz[2][c];
        }

        for (int linha = 0; linha < vetor.length; linha++) {
            System.out.print(vetor[linha] + "\t");
            
        }
    }

}
