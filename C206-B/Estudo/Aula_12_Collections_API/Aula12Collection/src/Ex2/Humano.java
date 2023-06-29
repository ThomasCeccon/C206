package Ex2;

public abstract class Humano implements Comparable<Humano> {

    //atributos
    String nomeM;
    int idade;

    //metodo construtor
    public Humano(String nomeM, int idade) {
        this.nomeM = nomeM;
        this.idade = idade;
    }

    //passando a comparacao para ordenar
    @Override
    public int compareTo(Humano o){
        return Integer.compare(this.idade,o.idade);
    }


}
