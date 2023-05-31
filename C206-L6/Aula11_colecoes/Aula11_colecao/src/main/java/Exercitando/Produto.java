package Exercitando;

public class Produto implements Comparable<Produto>  {

    //atributos
    String nome;
    double preco;

    //metodo construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
         //   return Double.compare(this.preco, o.preco);
            return nome.compareTo(o.nome);

    }
}
