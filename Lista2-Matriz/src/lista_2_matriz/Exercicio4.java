package lista_2_matriz;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        String[][] amigos = new String[5][2];

        for (int linha = 0; linha < amigos.length; linha++) {
            int col = 0;
            System.out.println("Digite o nome:");
            amigos[linha][col] = new Scanner(System.in).next();
            System.out.println("Digite o telefone:");
            amigos[linha][col + 1] = new Scanner(System.in).next();
        }

        pesquisar(amigos);
    }

    public static void pesquisar(String[][] matriz) {
        System.out.println("Digite o nome a ser pesquisado na agenda:");
        String nome = new Scanner(System.in).next();
        String telefone = "";

        for (int linha = 0; linha < matriz.length; linha++) {
            if (matriz[linha][0].equalsIgnoreCase(nome)) {
                telefone = matriz[linha][1];
            }
        }
        if (!"".equals(telefone)) {
            System.out.println("O telefone dele(a) é: " + telefone);
        } else {
            System.out.println("Nome não encontrado!!");
        }
    }
}
