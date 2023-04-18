package Classe_abstrata;

public abstract class Mamifero {
    //atributos
    protected String nome;
    protected double vida;

    //metodo construtor
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //metodo abstrato
    public abstract void emitirSon();

    public void mostraInfo(){

        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida);

    }
}
