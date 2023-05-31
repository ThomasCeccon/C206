package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        int op;
        boolean flag = true;
        int contc=0;//contador comida;
        int conth=0;//contador higiene
        int contd=0; //contador decoracao

        //criando um arquivo
        Arquivo a = new Arquivo();

        //criando funcionarios
        Produto produto = new Produto();

        //variavel para escanear
        Scanner entrada = new Scanner(System.in);

        while (flag) {
            System.out.println("================");
            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Produtos!");
            System.out.println("2-Listar Produtos");
            System.out.println("3-Ordenar o produto em ordem decrescente em relacao ao preco");
            System.out.println("4-Mostrar a quantidade de produtos existentes na loja de cada tipo");
            System.out.println("5-Sair do menu");
            System.out.println("================");

            op = entrada.nextInt();


            entrada.nextLine();

            switch (op) {

                case 1:
                    System.out.println("Nome do Produto");
                    produto.setNome(entrada.nextLine());

                    System.out.println("Preco do Produto");
                    double preco=entrada.nextDouble();

                    try {
                        if(preco<=0){
                            throw new InfoInvalidaException("Preço não pode ser negativo ou zero");
                        }
                    }
                    catch (InfoInvalidaException e){
                        System.out.println(e);
                        break;//nao ira salvar no arquivo caso entrar com valores !=
                    }
                    produto.setPreco(preco);

                    entrada.nextLine();

                    System.out.println("Tipo de produto");
                    String tipos= entrada.nextLine();
                    try {
                        if(!(tipos.equals("Comida")|| tipos.equals("Higiene") || tipos.equals("Decoração"))){
                            throw new InfoInvalidaException("Esse tipo é diferente");
                        }
                    }catch (InfoInvalidaException e){
                        System.out.println(e);
                        break;//nao ira salvar no arquivo caso entrar com valores !=
                    }
                    produto.setTipo(tipos);

                    a.escrever(produto);

                    break;

                case 2:
                    //armazena o retorno do medoto de leitura
                   ArrayList<Produto> produtoArrayList= a.ler();

                    for (int i = 0; i < produtoArrayList.size(); i++) {
                        System.out.println("INFORMACOES DO PRODUTO");
                        System.out.println(produtoArrayList.get(i).getNome());
                        System.out.println(produtoArrayList.get(i).getPreco());
                        System.out.println(produtoArrayList.get(i).getTipo());
                    }

                    break;

                case 3:
                    //armazena o retorno do medoto de leitura
                    produtoArrayList = a.ler();

                    Collections.sort(produtoArrayList);

                    //ordenando de forma decrescente
                    Collections.reverse(produtoArrayList);

                    for (int i = 0; i < produtoArrayList.size(); i++) {
                        System.out.println("INFORMACOES DO FUNCIONARIO");
                        System.out.println(produtoArrayList.get(i).getNome());
                        System.out.println(produtoArrayList.get(i).getPreco());
                        System.out.println(produtoArrayList.get(i).getTipo());
                    }
                    break;

                case 4:
                    ArrayList<Produto>produtoArrayList1=new ArrayList<>();
                    produtoArrayList1=a.ler();

                       for(int i=0;i< produtoArrayList1.size();i++){
                           if(produtoArrayList1.get(i).getTipo().equals("Comida"))
                           {
                               contc++;
                           }
                           else if(produtoArrayList1.get(i).getTipo().equals("Higiene")){
                               conth++;
                           }
                           else if(produtoArrayList1.get(i).getTipo().equals("Decoração")){
                               contd++;
                           }
                       }
                    System.out.println("Tipos Comida: " +contc);
                    System.out.println("Tipos Higiene: " +conth);
                    System.out.println("Tipos Decoração: " +contd);

                    break;

                case 5:
                    flag = false;
                    System.out.println("Saindo do menu!");
                    break;

            }

        }
    }
}