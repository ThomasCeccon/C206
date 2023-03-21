package Agregacao;

public class Arma {
    //atribuicao
    String nome;
    int poder;

    //contrutor para arma

    public Arma(String nome, int poder) {
        System.out.println("Arma criada!");
        this.nome = nome;
        this.poder = poder;
    }
}
