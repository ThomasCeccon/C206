package Ex_sala_arrays;

import vetores.Biblioteca;
import vetores.Livro;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag = true;
        int operador = 0;
        String nome_estudante;
        int quant_estudantes;

        //instanciar a classe estudante
        Estudante[] estudantes = new Estudante[50];

        //instanciar a classe escola
        Escola escola = new Escola();

        //entrada de dados
        Scanner entrada = new Scanner(System.in);


        escola.nome = "Coronel";

        while (flag) {

            //processamento
            System.out.println("1- Cadastrar estudantes");
            System.out.println("2- Mostrar as informaçoes dos estudantes");
            System.out.println("3- Mostrar quantidade de alunos em cada ano");

            //entre com a operacao
            operador = entrada.nextInt();

            switch (operador) {
                case 1:
                    System.out.println("Cadastre um novo estudante! ");
                    entrada.nextLine();
                    System.out.println("Entre com o nome do estudante!");
                    nome_estudante = entrada.nextLine();

                    System.out.println("entre com a quantidade de estudantes: ");
                    quant_estudantes = entrada.nextInt();

                    //instanciar nome e quantidade de estudantes
                    Estudante estudante = new Estudante(nome_estudante, quant_estudantes);
                    escola.addEstudante(estudante);

                    System.out.println("estudantes adicionados!");
                    break;

                case 2:
                    escola.mostraInfo();
                    break;

                case 3:
                    System.out.println("Mostrar a quantidade de alunos de cada ano!");
                    System.out.println("primeiro(1)|segundo(2)|terceiro(3) ano");
                    estudante.mostraInfo();
                    break;

                default:
                    flag = false;
                    System.out.println("numero invalido");
                    break;


            }


        }


    }
}
