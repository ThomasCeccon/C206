package Classe_abstrata;

public class Cachorro extends Mamifero {

    //Mmetodo construtor
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    //metodo que passa para todas as classes
    @Override
    public void emitirSon() {
        System.out.println("auau");
    }
}
