package pratica2.matriz;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int[] posMaior = new int[2];
        int[] posMenor = new int[2];
        int[][] matriz = new int[3][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor de matriz [" + linha + "] [" + coluna + "]: \t");
                matriz[linha][coluna] = new Scanner(System.in).nextInt();
            }
        }
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > maior){
                    maior = matriz[linha][coluna];
                    posMaior[0] = linha;
                    posMaior[1] = coluna;
                }
            }
        }
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] < menor){
                    menor = matriz[linha][coluna];
                    posMenor[0] = linha;
                    posMenor[1] = coluna;
                }
            }
        }
        
        System.out.println("\n O maior elemento da matriz é: "+maior+" na posição ["+posMaior[0]+"],["+posMaior[1]+"] \n");
        System.out.println("O menor elemento da matriz é: "+menor+" na posição ["+posMenor[0]+"],["+posMenor[1]+"] \n");
    }
}
