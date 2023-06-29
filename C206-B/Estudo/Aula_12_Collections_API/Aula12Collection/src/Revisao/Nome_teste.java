package Revisao;

public class Nome_teste implements Comparable<Nome_teste>{

    //atributos
    String nome;
    int idade;

    //construtor
    public Nome_teste(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //sobrescrita para ordenar de acordo com a idade
    @Override
    public int compareTo(Nome_teste o) {
        return Integer.compare(o.idade,this.idade);
    }



}
