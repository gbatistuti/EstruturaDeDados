package lista_2_matriz;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean verificador;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }
        verificador = verificarQuadradoMagico(matriz);
        System.out.println(verificador);
    }

    public static boolean verificarQuadradoMagico(int[][] matriz) {

        int diagPrinc = 0, diagSec = 0, l1 = 0, l2 = 0, l3 = 0, c1 = 0, c2 = 0, c3 = 0;
        int mediaDiag, mediaLinha, mediaCol;

        for (int i = 0; i < matriz.length; i++) {
            diagPrinc += matriz[i][i];
        }

        int d = matriz.length - 1;
        for (int[] matriz1 : matriz) {
            diagSec += matriz1[d];
            d--;
        }

        mediaDiag = (diagPrinc + diagSec) / 2;

        for (int l = 0; l < matriz.length; l++) {
            l1 += matriz[0][l];
            l2 += matriz[1][l];
            l3 += matriz[2][l];
        }
        mediaLinha = (l1 + l2 + l3) / 3;

        for (int c = 0; c < matriz[0].length; c++) {
            c1 += matriz[c][0];
            c2 += matriz[c][1];
            c3 += matriz[c][2];
        }
        mediaCol = (c1 + c2 + c3) / 3;

        return mediaDiag == mediaLinha && mediaLinha == mediaCol && mediaCol == mediaDiag;
    }
}
