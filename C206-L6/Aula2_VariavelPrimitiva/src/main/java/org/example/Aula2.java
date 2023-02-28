package org.example;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {

        //declaraco das variaveis
        double saldo_da_conta; //anderline
        int num_alunos=18; //constantes
        /*
        String nome="victor";//string classe

        double numDouble=1.54;
        float numfloat;

        numfloat=(float) numDouble;
        System.out.println(numfloat);

        */
        //entrada de dados
        Scanner entrada =new Scanner(System.in);
        System.out.println("Entre com um numero double");
        double numDouble=entrada.nextDouble();


        System.out.println("Entre com um numero inteiro");
        int numint=entrada.nextInt();

        System.out.println("Entre com um numero float");
       float numfloat=entrada.nextFloat();

       entrada.nextLine();//para entrar com a String

        System.out.println("Entre com seu nome");
       String seunome=entrada.nextLine();
    }
}
