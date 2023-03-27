package Prova1_lab;

public class Ninja {
    //atributos
    String nome;
    int idade;
    String titulo;
    String ranking;

    //metodo construtor
    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    //metodos
    void mostraInfo() {
        //mostrando informacoes do ninja
        System.out.println("Nome do ninja: " + this.nome);
        System.out.println("Idade do ninja: " + this.idade);
        System.out.println("Titulo do ninja: " + this.titulo);
        System.out.println("Ranking do Ninja: " + this.ranking);
        System.out.println("=====================");
    }
}
