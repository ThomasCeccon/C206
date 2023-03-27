package Prova1_lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag = true;
        int opcao;

        //instaniciar o objeto todo
        Aldeia aldeia = new Aldeia();
        aldeia.nome = "Ninja";
        aldeia.quantidadeMoradores = 100;
        aldeia.regiao = "Minas";

        //iniciar o objeto parte
        Ninja[] ninja1 = new Ninja[100];

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre no menu");
        System.out.println("=============");

        while (flag) {

            System.out.println("1- Adicionar um ninja na aldeia: ");
            System.out.println("2- Mostrar as informacoes da aldeia e seus ninjas: ");
            System.out.println("3- Mostrar o nome dos ninjas classificados no ranking S: ");
            System.out.println("4- Mostrar quantidade de ninjas Gennin,Chummin e ANBU: ");
            System.out.println("5- Sair do programa: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    //quebra de linha
                    entrada.nextLine();

                    System.out.println("Nome do ninja: ");
                    String nome_ninja = entrada.nextLine();

                    System.out.println("Idade do ninja: ");
                    int idade_ninja = entrada.nextInt();

                    //quebra de linha
                    entrada.nextLine();

                    System.out.println("Titulo do ninja: ");
                    String titulo_ninja = entrada.nextLine();

                    System.out.println("Ranking do Ninja: ");
                    String ranking_ninja = entrada.nextLine();

                    Ninja ninja = new Ninja(nome_ninja, idade_ninja, titulo_ninja, ranking_ninja);//passando dados do ninja
                    aldeia.adicionarNinja(ninja);//adicionando dados do ninja na aldeia
                    break;

                case 2:
                    aldeia.mostraInfo();
                    break;

                case 3:
                    aldeia.rankingS();
                    break;

                case 4:
                    aldeia.quantidadeTitulos();
                    break;

                case 5:
                    flag = false;
                    System.out.println("Sair do menu!");
                    break;

                default:
                    break;
            }
        }
    }
}