package lista_2_matriz;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        System.out.println("Quantas linhas terão na matriz?");
        int linha = new Scanner(System.in).nextInt();
        System.out.println("Quantas colunas terão na matriz?");
        int coluna = new Scanner(System.in).nextInt();

        int[][] matriz = new int[linha][coluna];

        System.out.println("Digite os valores para a matriz:");

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = new Scanner(System.in).nextInt();
            }
        }

        int num = exibeNum10a20(matriz);
        System.out.println("A quantidade de números entre 10 e 20 na matriz foi: " + num + "\n");
        double media = mediaPares(matriz);
        System.out.println("A média dos valores pares da matriz é: " + media + "\n");
    }

    public static int exibeNum10a20(int[][] matriz) {
        int num10a20 = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > 10 && matriz[linha][coluna] < 20) {
                    num10a20++;
                }
            }
        }
        return num10a20;
    }

    public static double mediaPares(int[][] matriz) {
        double media = 0.0;
        int par = 0, numeros = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] % 2 == 0) {
                    numeros += matriz[linha][coluna];
                    par++;
                }
            }
        }

        media = numeros / par;
        return media;
    }
}
