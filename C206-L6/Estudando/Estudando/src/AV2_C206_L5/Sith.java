package AV2_C206_L5;

public class Sith extends Personagem implements Forca {

    //atributos
    private boolean darth;
    private Sabre sabre;

    //metodo construtor de personagem
    public Sith(String nome, int id, int poder) {
        super(nome, id, poder);
    }

    //metodo
    public void crromperJedi(){

    }

    //metodos da interface
    @Override
    public void usarForca() {

    }

    @Override
    public void TrocarSabre() {

    }
}
