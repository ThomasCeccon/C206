package AV2_SENHOR_DOS_ANEIS;

public class Elfo extends Habitante implements Cura{

    //atributos
    private  String tribo;

    //metodo construtor
    public Elfo(int id, String nome, int idade, float energia, String tribo) {
        super(id, nome, idade, energia);
        this.tribo = tribo;
    }

    //metodo da propria classe
    public void viajar(){
        System.out.println("O elfo esta viajando");
    }

    //sobrescrita de metodo

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    //metodo passado pela interface
    @Override
    public void cura() {

    }
}
