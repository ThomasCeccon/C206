package Heranca;

public class Engenheiro extends Funcionario {

    public Engenheiro(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    //metodos
    public void mostraInfo(){
        System.out.println("Nome do Engenheiro: "+this.nome);
        System.out.println("Idade do Engenheiro: "+this.idade);
        System.out.println("Salario do Engenheiro: "+this.salario);
    }

    private
}
