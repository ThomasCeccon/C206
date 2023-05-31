package Exercicio1;

public class Funcionario implements Comparable<Funcionario>{

    //atributos
    private String nome;
    private String cpf;
    private int idade;

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Funcionario o) {
        return nome.compareTo(o.nome);
    }
}
