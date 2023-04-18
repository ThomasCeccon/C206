package Exercitando;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        int opcao;
        boolean flag = true;

        //inicializando o vetor cliente com 100 posicoes
        Cliente []cliente =new Cliente[100];
        //instanciando a classe conta
        Conta c1 = new Conta();// Cliente clientes=new Cliente();

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        while (flag) {
            System.out.println("Bem vindo ao banco DO BRASIL!");

            System.out.println("1-Adicionar cliente");
            System.out.println("2-Coloacar informacoes da conta");
            System.out.println("3-mostrar cliente");

            opcao = entrada.nextInt();


            switch (opcao) {

                case 1:

                    entrada.nextLine();


                    System.out.println("Entre com seu nome: ");
                    String nome_cliente = entrada.nextLine();

                    System.out.println("Entre com sua idade:");
                    int idade_cliente = entrada.nextInt();

                    System.out.println("Entre com seu cpf: ");
                    long cpf_cliente = entrada.nextLong();

                    entrada.nextLine();

                    System.out.println("Qual seu sexo:(M) ou (F)");
                    String sexo_cliente = entrada.nextLine();

                    Cliente cliente1 = new Cliente(nome_cliente, cpf_cliente, idade_cliente, sexo_cliente);

                    c1.addconta(cliente1);
                    break;

                case 2:
                    System.out.println("Tipo de conta: ");
                    String tip_conta=entrada.nextLine();
                    System.out.println("Saldo da conta: ");
                    float saldo_conta=entrada.nextFloat();
                    System.out.println("Limite da conta: " );
                    float limite_conta= entrada.nextFloat();

                    System.out.println();
                    break;

                case 3:
                    c1.mostrarInfo();
                    break;
            }


        }


    }
}
