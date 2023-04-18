package AV2_C206_L5;

public class Jedi extends Personagem implements Treinamento,Forca {

    //atributos
    private boolean mestre;
    private Sabre sabre; //agregacao

    //get and set
    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(boolean mestre) {
        this.mestre = mestre;
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }


    //metodo construtor de personagem
    public Jedi(String nome, int id, int poder) {
        super(nome, id, poder);
    }

    //metodos da interface
    @Override
    public void TreinarPadawan() {

    }

    @Override
    public void usarForca() {

    }

    @Override
    public void TrocarSabre() {

    }

    //sobrescrita de metodo
    @Override
    public void travarBatalha() {

    }
}
