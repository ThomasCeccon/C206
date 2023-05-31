package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracao das variaveis
        boolean flag = true;
        int op;

        //instanciar as classes
        Exercicio2.Cliente cliente = new Exercicio2.Cliente();
        Exercicio2.Arquivo arq = new Exercicio2.Arquivo();

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        while (flag) {

            System.out.println("Menu");
            System.out.println("1-Cadastrar os clientes");
            System.out.println("2-Listar os clientes");

            op = entrada.nextInt();

            switch (op) {


                case 1:
                    entrada.nextLine();

                    System.out.println("Cadastrar funcionario");
                    cliente.setNome(entrada.nextLine());
                    cliente.setCpf(entrada.nextInt());
                    entrada.nextLine();
                    cliente.setEndereco(entrada.nextLine());
                    cliente.setIdade(entrada.nextInt());

                    arq.escrever(cliente);
                    break;
                case 2:
                    ArrayList<Cliente> clientes = arq.ler();
                    //  Collections.sort(funcs);
                    Collections.reverse(clientes);
                    // ArrayList<Funcionario> funcs =new ArrayList<>();

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Informacoes do funcionario");
                        System.out.println(clientes.get(i).getNome());
                        System.out.println(clientes.get(i).getCpf());
                        System.out.println(clientes.get(i).getEndereco());
                        System.out.println(clientes.get(i).getIdade());
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
