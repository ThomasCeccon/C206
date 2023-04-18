package AV2_SENHOR_DOS_ANEIS;

public class Mago extends Habitante implements Feitico,Cura {

    //atributos
    private String cor;

    //metodo construtor
    public Mago(int id, String nome, int idade, float energia, String cor) {
        super(id, nome, idade, energia);
        this.cor = cor;
    }

    //get e set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    //metodas passados pela interface
    @Override
    public void cura() {

    }

    @Override
    public void lancaFeitico() {
    float energia_dec;
    energia_dec=this.energia-(10/100);
        System.out.println("Mago lancou feitico: "+energia_dec);
    }
}
