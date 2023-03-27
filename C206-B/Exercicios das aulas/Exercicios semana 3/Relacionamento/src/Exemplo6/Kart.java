package Exemplo6;

public class Kart {

    //atributos
    String nome;

    //agregacao e composicao
    Piloto piloto;//agregacao
    Motor motor;//composicao

    //construtor
    public Kart(){

        motor=new Motor();//instancia de motor
    }

    void pular(){
        System.out.println("pulo baixo");
    }
    void soltarTurbo(){
        System.out.println("turbo");
    }
    void fazerDrift(){
        System.out.println("drift");
    }
}
