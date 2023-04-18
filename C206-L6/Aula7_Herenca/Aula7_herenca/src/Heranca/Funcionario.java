package Heranca;

public class Funcionario {

    //atributos
    private String nome_funcionario;
    private int idade_funcionario;
    private double salario_funcioonario;

    //metodo construtor
    public Funcionario(String nome_funcionario, int idade_funcionario, double salario_funcioonario) {

        this.nome_funcionario = nome_funcionario;
        this.idade_funcionario = idade_funcionario;
        this.salario_funcioonario = salario_funcioonario;

    }

    //get e set
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public int getIdade_funcionario() {
        return idade_funcionario;
    }

    public void setIdade_funcionario(int idade_funcionario) {
        this.idade_funcionario = idade_funcionario;
    }

    public double getSalario_funcioonario() {
        return salario_funcioonario;
    }

    public void setSalario_funcioonario(double salario_funcioonario) {
        this.salario_funcioonario = salario_funcioonario;
    }

    //metodo mostra info
    void mostraInfo() {
        System.out.println("Nome do funcionario: " + this.nome_funcionario);
        System.out.println("Idade do funcionario: " + this.idade_funcionario);
        System.out.println("Salario do funcionario: " + this.salario_funcioonario);
    }

    //classes filhas herda esse metodo
    public void executaAcao() {
    }

    public double salarioBonus() {

        return salario_funcioonario;
    }


}
