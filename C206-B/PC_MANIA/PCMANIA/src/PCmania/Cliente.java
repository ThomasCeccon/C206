package PCmania;

public class Cliente {
    //atributos
    String nome;
    long cpf;

    //associacao por agregacao para clientes
    Computador[]computadors=new Computador[100];

    //metodo construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //metodos
    float calculaTotalCompra(){

        return 1;
    }




}
