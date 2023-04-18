package Exercitando;

public class Funcionario {

    //atributos
    private String nome;
    private int idade;
    private float salario;

    //metodo construtor
    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario(int i) {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //classe filhas herdam esse metodo
    public void executaAcao() {
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario: "+this.salario);
    }
}
