package org.example;

public class Engenheiro  extends Funcionario implements Gerencia {

    //atributos
    private String ramo;

    //metodo construtor
    public Engenheiro(String nome_funcionario, int idade_funcionario, double salario_funcioonario, String ramo) {
        super(nome_funcionario, idade_funcionario, salario_funcioonario);
        this.ramo = ramo;
    }

    //get e set
    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO ENGENHEIRO");
        //super.mostraInfo();
        System.out.println("Nome do engenheiro: "+getNome_funcionario());
        System.out.println("idade do engenheiro: "+getIdade_funcionario());
        System.out.println("salario do engenheiro: "+getSalario_funcioonario());
        System.out.println("Ramo do engenheiro: " + this.ramo);
    }

    @Override
    public void executa() {
        System.out.println("o engenheiro esta codando");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O engenheiro " + getNome_funcionario() + " esta trabalhando");
    }

    @Override
    public void gerencia() {

    }

}
