package AV1_C206_L1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag = true;
        int opcao;
        double maior = 0;
        double menor = 0;


        Plataforma p1 = new Plataforma();//instanciando a classe todo
        Jogo[] j1 = new Jogo[10];//definindo quantas posicoes o array recebe

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o nome da plataforma: ");
        //p1.nome_plataforma = entrada.nextLine();
        p1.nome_plataforma = "Mojang";

        System.out.println("Criador da plataforma: ");
        // p1.criador = entrada.nextLine();
        p1.criador = "steven";

        while (flag) {

            System.out.println("Aperte (1) para Adicionar jogo a plataforma\nAperte (2) para mostrar informacoes da plataforma e seus jogos\nAperte (3) para mostrar o nome do jogo mais caro e do mais barato cadastrado\nAperte (4) para calcular quantos jogos possuem dlc ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    entrada.nextLine();

                    System.out.println("Entre com o nome do jogo: ");
                    String nome_do_jogo = entrada.nextLine();

                    System.out.println("Entre com o genero do jogo:");
                    String genero_jogo = entrada.nextLine();

                    System.out.println("Entre com o preco do jogo:");
                    double preco_jogo = entrada.nextDouble();

                    System.out.println("Entre com a dlc do jogo:");
                    boolean dlc_jogo = entrada.nextBoolean();


                    //adicionar jogos instanciar e passar as entradas em adicionar jogo
                    Jogo jogo = new Jogo(nome_do_jogo, genero_jogo, preco_jogo, dlc_jogo);
                    p1.adicionarJogo(jogo);
                    break;

                case 2:
                    p1.mostrainfo();
                    break;

                case 3:
                    p1.mostraMaisCaroBarato();
                    break;

                case 4:
                    p1.calculoDlc();
                    break;

                default:
                    flag = false;
                    System.out.println("sair");

            }
        }

        //saida de dados
    }
}
