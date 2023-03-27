package Transferir_dinheiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instancia
        Conta c1 =new Conta();
        Conta c2 =new Conta();

        //definindo valores a classe
        c1.nome="thayane";
        c2.nome="thayane";
        c1.numero_conta=1010;
        c2.numero_conta=1010;
        c1.saldo=2000;
        c2.saldo=2000;

        //fazer a transferencia de conta 1 para conta 2 100 reais
        c1.transferir(c2,100);
        //fazer a transferencia de conta 2 para conta 1

        System.out.println("Saldo de Conta 1: "+c1.saldo);
        System.out.println("Saldo de Conta 2: "+c2.saldo);


        //colocar o endereco que aponta para os valores do ponteiro
         c1=c2;
        //processamento
        if(c1==c2){
            System.out.println("sao iguais");
        }
        else{
            System.out.println("sao diferentes");
        }
    }
}