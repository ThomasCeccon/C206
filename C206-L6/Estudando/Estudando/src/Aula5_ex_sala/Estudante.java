package Aula5_ex_sala;

public class Estudante {

    //atributos
    String nome;
    int idade;
    String ano;

    //metodo construtor
    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    //metodos
    void mostraInfo(){
        System.out.println("Nome do estudante: "+this.nome);
        System.out.println("Idade do estudante: "+this.idade);
        System.out.println("Ano do estudante: "+this.ano);

    }
}
