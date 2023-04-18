package Modificadores;

public class Nave {
    //atributos
    private String nome;
    private double vida;
    private String tipoTiro;


    //metodo construtor
    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }


    //metodos
    public void atirar(Asteroide ast){
        System.out.println("Voce atirou");
    }
    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
}
