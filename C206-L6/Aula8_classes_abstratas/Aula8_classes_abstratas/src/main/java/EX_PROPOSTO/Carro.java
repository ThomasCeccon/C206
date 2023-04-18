package EX_PROPOSTO;

import javax.swing.*;

public abstract class Carro implements Controle {

    //atributos
    private double valor;
    private String cor;
    private int ano;

    //get e set
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //metodo construtor
    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public void taxa() {
        System.out.println("Taxa do carro: "+valor*0.05);
    }

    @Override
    public void mostrainfo() {
        System.out.println("Valor do carro: "+this.valor);
        System.out.println("Cor do carro: "+this.cor);
        System.out.println("Ano do carro: "+this.ano);
    }
    // public abstract void mostrainfo() ;
}
