package PV2;

public class Bulbassaur extends Pokemom implements AtaqueEspecial, FazerBarulho {

    //atributos
    private float luminosidadeAmbiente;

    //metodo construtor
    public Bulbassaur( String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    //get e set
    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    //sobrescrita de metodo
    @Override
    public void atacar() {
        System.out.println(this.getNome() + "esta atacando");
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO BULBASSAUR");
        super.mostraInfo();
        System.out.println("Luminosidade do Ambiente: "+this.getLuminosidadeAmbiente());
    }

    //metodos gerados pela interface
    @Override
    public void ataqueEspecial() {
        if (this.luminosidadeAmbiente > 650) {
            System.out.println("Ganhou do oponente");
        }
        else {
            System.out.println("Perdeu do oponente");
        }
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " esta fazendo barulho");
    }
}
