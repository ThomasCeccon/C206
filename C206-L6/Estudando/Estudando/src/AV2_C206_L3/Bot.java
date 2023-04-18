package AV2_C206_L3;

public class Bot extends Pessoa implements Interacao{
    //atributos
    private boolean hostil;

    //metodo construtor
    public Bot( String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    //sobrescrita de metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();

    }

    @Override
    public void fazmissao() {
    if(this.hostil==true){
        System.out.println("Atrapalhou o jogador a fazer a missao");
    }

    else {
        System.out.println("Ajudou o jogador a fazer a missao");
    }
    }

    //get and set
    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    //implementado pela interface interacao
    @Override
    public void passarMissao() {

    }
}
