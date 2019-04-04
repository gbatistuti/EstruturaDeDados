package lista_2_matriz;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int n;
        System.out.println("Digite um número maior do que 1 e menor do que 6 para ser o tamanho da matriz:");
        n = new Scanner(System.in).nextInt();
        while (n <= 1 && n >= 6) {
            System.out.println("Digite APENAS um número maior do que 1 e menor do que 6:");
            n = new Scanner(System.in).nextInt();
        }

        int[][] matriz = new int[n][n];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }
        somarDiagonais(matriz);
    }

    public static void somarDiagonais(int[][] matriz) {
        int diagPrinc = 0, diagSec = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagPrinc += matriz[i][i];
        }

        int d = matriz.length - 1;
        for (int c = 0; c < matriz.length; c++) {
            diagSec += matriz[c][d];
            d--;
        }
        
        System.out.println("A soma dos elementos da diagonal principal é: "+diagPrinc+"\n");
        System.out.println("A soma dos elementos da diagonal secundária é: "+diagSec+"\n");

    }

}
