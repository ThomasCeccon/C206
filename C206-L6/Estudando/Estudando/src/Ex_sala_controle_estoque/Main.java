package Ex_sala_controle_estoque;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declaracao das variaveis
        int produto;

        //instanciar o objeto todo
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com 1 (para produto 1) ou 2 (para produto 2)");
        produto = entrada.nextInt();

        switch (produto) {
            case 1:
                System.out.println("cadastrar produto 1: ");

                System.out.println("entre com o codigo de serie");
                p1.codigoSerie = entrada.nextInt();

                entrada.nextLine();

                System.out.println("entre com o codigo do produto");
                p1.codigoProduto = entrada.nextLine();

                System.out.println("entre com o nome do produto");
                p1.nome_produto = entrada.nextLine();

                System.out.println("entre com a categoria do material");
                p1.categoria = entrada.nextLine();

                System.out.println("entre com a quantidade ");
                p1.quantidade = entrada.nextInt();

                //mostrar informacoes do produto 1
                p1.mostraInfo();
                break;

            case 2:
                System.out.println("cadastrar produto 2: ");

                System.out.println("entre com o codigo de serie");
                p2.codigoSerie = entrada.nextInt();

                entrada.nextLine();

                System.out.println("entre com o codigo do produto");
                p2.codigoProduto = entrada.nextLine();

                System.out.println("entre com o nome do produto");
                p2.nome_produto = entrada.nextLine();

                System.out.println("entre com a categoria do material");
                p2.categoria = entrada.nextLine();

                System.out.println("entre com a quantidade ");
                p2.quantidade = entrada.nextInt();


                //mostrar informacoes do produto 2
                p2.mostraInfo();
                break;

            default:
                System.out.println("digitou errado!");
                break;

        }


    }


}
