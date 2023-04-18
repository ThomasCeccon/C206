package Exercitando;

public class Arquiteto extends Funcionario {

    //atributos
    public String ramo;
    //metodo construtor
    public Arquiteto(String nome, int idade, float salario,String ramo) {
        super(nome, idade, salario);
        this.ramo=ramo;
    }

    //sobrescrita de metodo
    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DA ARQUITETA");
        super.mostraInfo();
        System.out.println("Ramo: "+this.ramo);
    }

    //metodos da propria classe filha
    public void executaAcao(){
        System.out.println("A Arquiteta "+getNome()+ " esta projetando");
    }
}
