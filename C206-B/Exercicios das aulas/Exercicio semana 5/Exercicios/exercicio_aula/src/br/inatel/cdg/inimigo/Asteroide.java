package br.inatel.cdg.inimigo;

public class Asteroide {
    //atributos
    private String nome;
    private String tipoAsteroide;

    //metodo construtor
    public  Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    //criando get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    //metodo
    public void destruir(){
        System.out.println("MORREU");
    }

}
