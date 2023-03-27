package Exemplo5;

import Exemplo5.Arma;

public class Main {
    public static void main(String[] args) {

        //instanciar
        Personagem p1 = new Personagem();
        Arma a1=new Arma();

        p1.nome="tho";
        p1.pontos=100;

        a1.descricao="arma do tho";
        a1.resistencia=100;
        a1.poder=1000;

        //asscociacao (agregacao)
        p1.arma=a1;

        //saida de dados
        System.out.println("vida do personagem: "+p1.pontos);
        p1.tomarDano();
        System.out.println("vida do personagem: "+p1.pontos);

        System.out.println("informacoes da arma: ");
        //a1.mostrarInfoArma();
        p1.arma.mostrarInfoArma();
        a1.mostrarInfoArma();
        p1.usarArma();
        a1.mostrarInfoArma();



    }
}