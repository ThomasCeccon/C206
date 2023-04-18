package Modificadores;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag=true;
        int opcao;

        //instanciar as classes
        Nave nave=new Nave("G14",100,"FOGO");
        Asteroide asteroide=new Asteroide("P17","PEDRA");



        System.out.println("Dados da nave: ");
        System.out.println("Nome da nave:"+nave.getNome());
        System.out.println("vida da nave:"+nave.getVida());
        System.out.println("Tipo do tiro da nave:"+nave.getTipoTiro());
        nave.atirar(asteroide);
        System.out.println("========================================");
        System.out.println("Dados do asteroide: ");
        System.out.println("Nome do asteroide:"+asteroide.getNome());
        System.out.println("Tipo do asteroide:"+asteroide.getTipoAsteroide());
        asteroide.destruir();

    }
}