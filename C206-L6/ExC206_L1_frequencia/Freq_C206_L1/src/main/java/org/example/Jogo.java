package org.example;

public class Jogo implements  Comparable<Jogo> {
    //atributos
    private String nome;
    private double preco;
    private String genero;

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //ajustar a ordem de acorodo com o preco do jogo
    @Override
    public int compareTo(Jogo o) {
       return Double.compare(this.preco,o.preco);
    }
}
