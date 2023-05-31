package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag = true;

        Exercicio1.Arquivo arq = new Exercicio1.Arquivo();
        Exercicio1.Funcionario f1 = new Exercicio1.Funcionario();

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        while (flag) {

            System.out.println("Bem vindo ao menu");
            System.out.println("1-Cadastrar funcionario");
            System.out.println("2-Listar funcionario");
            System.out.println("3-Sair");

            int op = entrada.nextInt();

            switch (op) {
                case 1:
                    entrada.nextLine();

                    System.out.println("Cadastrar funcionario");
                    f1.setNome(entrada.nextLine());
                    f1.setCpf(entrada.nextLine());
                    f1.setIdade(entrada.nextInt());

                    arq.escrever(f1);
                    break;

                case 2:
                    ArrayList<Funcionario> funcs = arq.ler();
                    //  Collections.sort(funcs);
                    Collections.reverse(funcs);
                    // ArrayList<Funcionario> funcs =new ArrayList<>();

                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("Informacoes do funcionario");
                        System.out.println(funcs.get(i).getNome());
                        System.out.println(funcs.get(i).getCpf());
                        System.out.println(funcs.get(i).getIdade());
                    }
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    break;

            }

        }


    }
}