package EX2;

public abstract class Carro implements Comparable<Carro> {

    //atributos
    String nome;
    int preco;

    //construtor
    public Carro(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //sobrescrita de metodo
    @Override
    public int compareTo(Carro o) {
        return Integer.compare(this.preco,o.preco);
    }
}
