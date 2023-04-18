package br.inatel.cdg.brownie;

public class BrownieCafe extends Brownie{

    //metodo construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public void addmaiscafe(){
        System.out.println("Adicionar cafe para "+this.nome+" com sabor de "+this.sabor);
    }
}
