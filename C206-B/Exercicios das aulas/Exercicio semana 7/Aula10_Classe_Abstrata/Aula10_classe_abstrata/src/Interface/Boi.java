package Interface;

public class Boi extends Mamifero {

    //metodo construtor
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    //metodo que passa para todas as classes
    @Override
    public void emitirSon() {
        System.out.println("muuu");
    }
}
