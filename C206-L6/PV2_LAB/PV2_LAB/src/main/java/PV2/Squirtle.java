package PV2;

public class Squirtle extends Pokemom implements FazerBarulho {

    //atributos
    private float multiplicadorAgua;

    //metodo construtor
    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    //get e set
    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }

    public void setMultiplicadorAgua(float multiplicadorAgua) {
        this.multiplicadorAgua = multiplicadorAgua;
    }

    //sobrescrita de metodos
    @Override
    public void atacar() {
        System.out.println(this.getNome()+"esta atacando");
    }

    @Override
    public void mostraInfo() {
        System.out.println("IINFORMACOES DO SQUIRTLE");
        super.mostraInfo();
        System.out.println("Multiplicador de agua: "+this.getMultiplicadorAgua());
    }

    //metodo gerado pela inteface
    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome()+" esta fazendo barulho");
    }
}
