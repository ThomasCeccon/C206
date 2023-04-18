package Membro_statico;

public class Funcionario {

    //atributos
    public String nome;
    public int id;
    public static int cont;//contador agora é privado

    //criar get para mostrar e set para acrescentar(escrever algo)
    public static int getCont() {

        return cont;
    }

    public static void setCont(int cont) {

        Funcionario.cont = cont;
    }

    //metodo construtor
    public Funcionario(String nome) {
        this.nome = nome;
        cont++;
        this.id = cont;

    }
}
