package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        int op;
        double preco;
        String genero;
        boolean flag = true;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //instanciando o objeto arquivo e jogo
        Arquivo a = new Arquivo();
        Jogo j = new Jogo();

        while (flag) {

            System.out.println("1-Salvar informacoes de jogo no arquivo txt");
            System.out.println("2-Mostrar as informacoes de jogos salvos no arquivo");
            System.out.println("3-Ordenar os jogos em ordem crescente de preco");
            System.out.println("4-Ordenar os jogos em ordem decrescente de preco");
            System.out.println("5-Sair do programa");

            op = entrada.nextInt();

            switch (op) {
                //salvando info de jogo
                case 1:
                    entrada.nextLine();
                    System.out.println("Nome do jogo");
                    j.setNome(entrada.nextLine());
                    System.out.println("Preco do jogo");
                    preco = entrada.nextDouble();
                    try {
                        if (preco < 0) {
                            throw new PrecoNegativoException("Não pode ser negativo!");
                        }
                    } catch (PrecoNegativoException p) {
                        System.out.println(p);
                        break;
                    }
                    j.setPreco(preco);
                    entrada.nextLine();
                    System.out.println("Genero do jogo");
                    j.setGenero(entrada.nextLine());

                    //escrever informacoes do jogo
                    a.escrever(j);
                    break;

                //mostrando info de jogo
                case 2:
                    ArrayList<Jogo> jogos = a.ler();
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println("Informacoes do jogo");
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;

                case 3:
                    ArrayList<Jogo> jog = a.ler();

                    //ordem crescente
                    Collections.sort(jog);

                    for (int i = 0; i < jog.size(); i++) {
                        System.out.println("Informacoes do jogo");
                        System.out.println(jog.get(i).getNome());
                        System.out.println(jog.get(i).getPreco());
                        System.out.println(jog.get(i).getGenero());
                    }
                    break;
                case 4:
                    ArrayList<Jogo> jogos1 = a.ler();

                    //ordem decrescente
                    Collections.reverse(jogos1);

                    for (int i = 0; i < jogos1.size(); i++) {
                        System.out.println("Informacoes do jogo");
                        System.out.println(jogos1.get(i).getNome());
                        System.out.println(jogos1.get(i).getPreco());
                        System.out.println(jogos1.get(i).getGenero());
                    }
                    break;

                case 5:
                    flag=false;
                    System.out.println("Saindo do programa");
                    break;
            }
        }


    }
}