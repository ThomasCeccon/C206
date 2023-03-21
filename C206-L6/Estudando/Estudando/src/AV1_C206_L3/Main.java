package AV1_C206_L3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declaraco das variaveis
        int opcao;
        boolean flag = true;

        //instanciar o objeto todo
        Equipe equipe = new Equipe();

        // System.out.println("Equipe :");
        equipe.capitao="Vingadroes";

        //inicializar o vetocom 10 posicoes
        Heroi[] h1 = new Heroi[10];

        //caso queira adiconar posicao por posicao a mao
        //h1[0]=new Heroi(); ...


        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre no menu!");
        System.out.println("==============");

        //processamento
        while (flag) {
            System.out.println("1 - Adicionar novo heroi!");
            System.out.println("2 - Mostrar informacoes da equipe e de seus herois!");
            System.out.println("3 - Mostrar heroi mais forte de acordo com seu poder!");
            System.out.println("4 - Calcular porcentagem de herois da equipe que pode voar!");
            System.out.println("5 - Sair do menu!");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    entrada.nextLine();

                    System.out.println("Entre com o nome do heroi! ");
                    String nome_heroi = entrada.nextLine();

                    System.out.println("Entre com o valor do poder do heroi! ");
                    float poder_heroi = entrada.nextFloat();

                    System.out.println("Heroi pode voar (true) or (false)");
                    boolean pode_voar = entrada.nextBoolean();

                    Heroi heroi = new Heroi(nome_heroi, poder_heroi, pode_voar); // nova instancia para receber os valores
                    equipe.adicionarHeroi(heroi); //passar dados a equipe para adiciona novo heroi
                    break;

                case 2:
                    equipe.mostrarInfo();
                    break;

                case 3:
                    equipe.mostrarMaisForte();
                    break;

                case 4:
                    equipe.calcularVoadores();
                    break;

                case 5:
                    flag=false;
                    System.out.println("Sair do programa!");

            }


        }


    }
}
