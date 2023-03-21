package AV1_C206_L5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracao das varaives
        boolean flag=true;
        int opcao;

        //instanciar o objeto todo
        Deck deck=new Deck();

        deck.dono="Theo";

        //iniciar o array
        Carta[] cartas=new Carta[10];

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Entre no menu!");
        System.out.println("==============");

        while(flag){

            System.out.println("1 - Adicione uma carta ao Deck!");
            System.out.println("2 - Mostrar as informacoes do deck e suas cartas!");
            System.out.println("3 - Mostrar o poder total do deck e sua media aritmetica!");
            System.out.println("4 - Cacluclar quantos soldados,arqueiros e pesados ha no deck!");

            opcao=entrada.nextInt();

            switch (opcao){

                case 1:

                    entrada.nextLine();

                    System.out.println("Dono da carta: ");
                    String nome_carta= entrada.nextLine();

                    System.out.println("Poder da carta: ");
                    int poder_carta= entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Classificacao da carta: ");
                    String classificacao_carta= entrada.nextLine();

                    Carta carta=new Carta(nome_carta,poder_carta,classificacao_carta);//passando os dados

                    deck.adicionarCarta(carta);//adicionado as cartas

                    break;

                case 2:
                    deck.mostraInfo();
                    break;

                case 3:
                    deck.CalculaPoderMedio();
                    break;

                case 4:
                    deck.calculaClassificacao();

            }
        }
    }
}
