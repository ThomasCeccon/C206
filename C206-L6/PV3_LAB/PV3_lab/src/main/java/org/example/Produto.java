package org.example;

public class Produto implements Comparable<Produto> {
    //atributos
    private String nome;
    private double preco;
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //sobrescrita de metodo para ordenar
    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.preco,o.preco);
    }
}
