package AV2_SENHOR_DOS_ANEIS;

public class Anao extends Habitante implements Mineracao{

    //atributos
    private float altura;
    private String reino;

    //metodo construtor
    public Anao(int id, String nome, int idade, float energia, float altura, String reino) {
        super(id, nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
    }

    //get e set
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
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

    //metodo passado pela inteface
    @Override
    public void minerar() {
        System.out.println("O Anao esta minerando");
    }
}
