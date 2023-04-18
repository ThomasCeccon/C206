package Heranca;

public class Funcionario {

    //atributos
    String nome;
    int idade;
    double salario;

    //metodo construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //metodo
    public void mostraInfo(){
        System.out.println("Nome do Funcionario: "+this.nome);
        System.out.println("Idade do funcionario: "+this.idade);
        System.out.println("Salario do funcionario: "+this.salario);
    }
}
