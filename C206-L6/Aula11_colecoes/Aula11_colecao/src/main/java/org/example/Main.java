package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*
         *ArrayList:nao precisa definir o tamanho, ele é dianmico
         * metodos proprios do arraylist
         */

        /*
        //declarando arraylist sem tipo
        ArrayList array=new ArrayList();
         */

        //declarando arraylist com tipo
        ArrayList <Conta> contas=new ArrayList<>();

        //instancia da classe conta
        Conta c1=new Conta("ZE",100);
        Conta c2=new Conta("Ivana",1000);
        Conta c3=new Conta("ZA",1000);
        Conta c4=new Conta("Joao",5);

        //adicionar conta
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        //ordenando pelo saldo
        //ordenar contas (criar metodo para pegar o parametro e comparar)
        Collections.sort(contas);

        //ordena em ordem decrescente
      //  Collections.reverse(contas);

        /*
        //adicionar informacoes na lista de vetores
        arrayInteiro.add(10);
        arrayInteiro.add(100);
        arrayInteiro.add(8);
        arrayInteiro.add(5);

        //remove pode tirar 0BJETO e INDEX
        arrayInteiro.remove(0);//remove algo do arraylist
        //1 index tira que esta na posicao 1 (0,1,2,3)

        //ordenar o array por ordem crescente
        Collections.sort(arrayInteiro);

        //ordenar o array de forma decrescente
        Collections.reverse(arrayInteiro);

        //limpar lista toda
       // arrayInteiro.clear();

        //verificar se esta vazio
        System.out.println(arrayInteiro.isEmpty());
         */

        //varrer o arraylist nao precisa fazer a decisao para testar se é null
        for(int i=0;i<contas.size();i++){
            System.out.println(contas.get(i).dono);
            System.out.println(contas.get(i).saldo);

        }
    }
}