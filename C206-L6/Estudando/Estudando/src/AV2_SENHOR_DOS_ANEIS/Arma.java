package AV2_SENHOR_DOS_ANEIS;

public class Arma {

    //atributos
    private String nomeArma;
    private boolean magica;

    //metodo construtor
    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    //get e set
    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }

    public void setMagica(boolean magica) {
        this.magica = magica;
    }
}
