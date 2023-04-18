package Exercitando;

public class Engenheiro extends Funcionario{

    //atributo proprio da classe
    public String ramo;

    //metodo construtor
    public Engenheiro(String nome, int idade, float salario,String ramo) {
        super(nome, idade, salario);
        this.ramo=ramo;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O Engenheiro "+getNome()+ " esta codando");
    }

    //sobrescrita de metodo
    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO ENGENHEIRO: ");
        super.mostraInfo();
        System.out.println("Ramo: "+this.ramo);
    }


}
