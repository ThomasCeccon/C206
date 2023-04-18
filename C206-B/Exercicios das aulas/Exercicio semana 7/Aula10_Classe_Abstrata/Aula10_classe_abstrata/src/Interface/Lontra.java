package Interface;

public class Lontra extends Mamifero {

    //metodo construtor
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    //metodo que passa para todas as classes
    @Override
    public void emitirSon() {
        System.out.println("ahahai");
    }
}
