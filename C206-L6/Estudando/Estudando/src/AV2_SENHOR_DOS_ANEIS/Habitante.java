package AV2_SENHOR_DOS_ANEIS;

public abstract class Habitante {

    //atributos
    public static int contador=0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    //metodo construtor
    public Habitante(int id, String nome, int idade, float energia) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
    }

    //metodos
    public void atacar(){

    }
    public  void mostraInfo(){

    }
}
