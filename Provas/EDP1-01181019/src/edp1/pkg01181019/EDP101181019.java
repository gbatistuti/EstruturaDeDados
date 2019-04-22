package edp1.pkg01181019;

import java.util.Scanner;

public class EDP101181019 {

    public static void main(String[] args) {
        //ENTREGA DE OSCAR: 
        //O MENU INICIAL DEVER�? CONTER AS SEGUINTES OPÇÕES:
        //1- INCLUIR OS NOMES DOS FILMES A SEREM VOTADOS, 
        //2- COMPUTAR OS VOTOS (INT)
        //3- MOSTRAR RESULTADOS
        //4 - SAIR
        //O PROGRAMA DEVER�? GUARDAR EM UM VETOR O NOME DE 3 FILMES QUE O USU�?RIO DIGITAR
        //COMPUTAR OS VOTOS DE CADA FILME E EXIBIR O VENCEDOR COM A QUANTIDADE DE VOTOS E A PORCENTAGEM TOTAL

        int escolha = 0;
        String ganhou = "";
        String[] filmes = new String[3];
        filmes[0] = "";
        System.out.println("----- BEM VINDO À PREMIAÇÃO DO OSCAR -----");
        while (escolha != 4) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - INCLUIR OS NOMES DOS FILMES A SEREM VOTADOS");
            System.out.println("2 - COMPUTAR OS VOTOS");
            System.out.println("3 - MOSTRAR RESULTADOS");
            System.out.println("4 - SAIR");
            escolha = new Scanner(System.in).nextInt();
            switch (escolha) {
                case 1:
                    filmes = incluirFilmes();
                    System.out.println("");
                    break;
                case 2:
                    if (filmes[0].isEmpty()) {
                        System.out.println("Nenhum filme foi adicionado à votação \n");
                    } else {
                        ganhou = computarVotos(filmes);
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (ganhou.isEmpty()) {
                        System.out.println("Ainda não houve nenhuma votação \n");
                    } else {
                        System.out.println(ganhou);
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Saiu do sistema");
                    break;
                default:
                    System.out.println("Digite uma opção válida \n");
                    break;
            }
        }
    }

    public static String[] incluirFilmes() {
        String[] filmes = new String[3];
        for (int c = 0; c < filmes.length; c++) {
            System.out.println("Digite o nome do " + (c + 1) + "° filme");
            filmes[c] = new Scanner(System.in).next();
        }
        return filmes;
    }

    public static String computarVotos(String[] filmes) {
        System.out.println("Digite o número do filme que deseja votar: (digite um número negativo para sair da votação)");
        int escolhido = 0, maisVotado = 0;
        double porcentagem = 0.0, totalDeVotos = 0.0;
        int p1 = 0, p2 = 0, p3 = 0;
        while (escolhido >= 0) {
            System.out.println("Em qual filme deseja votar?");
            for (int c = 0; c < filmes.length; c++) {
                System.out.print((c + 1) + " - " + filmes[c] + "\t");
            }
            escolhido = new Scanner(System.in).nextInt();
            switch (escolhido) {
                case 1:
                    p1++;
                    break;
                case 2:
                    p2++;
                    break;
                case 3:
                    p3++;
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
            totalDeVotos = p1 + p2 + p3;
        }
        if (p1 > p2 && p1 > p3) {
            maisVotado = p1;
            porcentagem = (p1 / totalDeVotos)*100.0;
            return ("O filme vencedor foi o " + filmes[0] + " com o total de " + maisVotado + " votos e um percentual de "+porcentagem+"% dos votos");
        } else if (p2 > p1 && p2 > p3) {
            maisVotado = p2;
            porcentagem = (p2 / totalDeVotos)*100.0;
            return ("O filme vencedor foi o " + filmes[1] + " com o total de " + maisVotado + " votos e um percentual de "+porcentagem+"% dos votos");
        } else if (p3 > p1 && p3 > p2) {
            maisVotado = p3;
            porcentagem = (p3 / totalDeVotos)*100.0;
            return ("O filme vencedor foi o " + filmes[2] + " com o total de " + maisVotado + " votos e um percentual de "+porcentagem+"% dos votos");
        }

        return "";
    }

}
