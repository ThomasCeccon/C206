package Aula5_ex_sala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag=true;
        int opcao;

        //instanciar o objeto todo
        Escola escola=new Escola();

        //iniciar o array com 10 posicoes
        Estudante []estudante=new Estudante[300];

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        //processamento
        System.out.println("Entre no menu!");
        System.out.println("==============");

        while (flag){

            System.out.println("1- Cadastrar estudantes :");
            System.out.println("2- Mostrar as informaçoes dos estudantes: ");
            System.out.println("3- Mostrar a quantidade de alunos em cada ano,sendo 1°,2° e 3° ano: ");
            System.out.println("4- Sair do menu: ");

            opcao=entrada.nextInt();

            switch (opcao){

                case 1:
                    entrada.nextLine();

                    System.out.println("Nome do estudante: ");
                    String nome_estudante= entrada.nextLine();

                    System.out.println("Idade do estudante: ");
                    int idade=entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Ano do estudante: ");
                    String ano_estudante=entrada.nextLine();

                    Estudante estudante1=new Estudante(nome_estudante,idade,ano_estudante);//instanciando o array com dados

                    escola.addEstudante(estudante1);//adicionando estudantes
                    break;

                case 2:
                    escola.mostraInfo();
                    break;

                case 3:
                    escola.quantidadeEstudantesPorAno();

                case 4:
                    flag=false;
                    System.out.println("sair");

                default:
                    break;

            }
        }
    }
}
