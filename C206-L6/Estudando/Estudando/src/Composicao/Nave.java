package Composicao;

public class Nave {
    //atributos
    String nome;
    int velocidade;

    //associar por composicao liga se ao construtor
    Arma arma;

    public Nave(String nome, int velocidade, String nomeA_arma,int poder) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.arma = new Arma(nomeA_arma,poder);//composicao e valores para adicionar
    }
}
