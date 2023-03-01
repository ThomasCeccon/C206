package Construtores;

public class Produto {

    //variaveis(caracteristicas do objeto)
    String nome;
    String marca;
    float valor;

    //metodo construtor(mesmo nome da classe)
    Produto() {

    }

    Produto(String nome) {
        this.nome = nome;//este nome recebe a variavel nome
    }

    Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

}
