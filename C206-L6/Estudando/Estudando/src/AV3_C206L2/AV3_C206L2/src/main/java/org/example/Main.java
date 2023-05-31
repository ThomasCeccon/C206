package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        int op;
        boolean flag = true;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //instanciando as classes
        Arquivo a = new Arquivo();
        Livro livro = new Livro();

        while (flag) {

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar livros em arquivo txt");
            System.out.println("2-Mostrar informações");
            System.out.println("3-Sair do menu");

            op = entrada.nextInt();

            switch (op) {

                case 1:
                    entrada.nextLine();

                    System.out.println("Nome do livro");
                    livro.setNome(entrada.nextLine());

                    System.out.println("Nome do(a) autor");
                    livro.setAutor(entrada.nextLine());

                    System.out.println("Noma do(a) editora");
                    String editora_o = entrada.nextLine();
                    try {
                        if (!(editora_o.equals("Leya") || editora_o.equals("Arqueiro") || editora_o.equals("Rocco"))) {
                            throw new InfoInvalideException("Nao pode ser de outro(a) editora");
                        }
                    } catch (InfoInvalideException e) {
                        System.out.println(e);
                    }

                    livro.setEditora(editora_o);


                    System.out.println("Quantidade de paginas");
                    int qtdpaginas = entrada.nextInt();

                    try {
                        if (qtdpaginas <= 0) {
                            throw new InfoInvalideException("Nao pode ter quantidade de pagina menor que zero");
                        }
                    } catch (InfoInvalideException e) {
                        System.out.println("Erro " + e);
                    }
                    livro.setQtdPaginas(qtdpaginas);

                    //passando para arquivo as informaçoes de livro que foram escritas
                    a.escrever(livro);


                    break;

                case 2:
                    //passando para o arquivo as informaçoes que foram lidas
                    a.ler();
                    livro.mostraInfo();
                    break;

                case 3:
                    flag = false;
                    System.out.println("Sair do menu!");
                    break;
            }


        }
    }
}