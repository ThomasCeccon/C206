package Exercitando;

public class Cliente {
    //atributos
    String nome_cliente;
    private long cpf;//identificador
    int idade;
    String sexo;
    Conta conta;

    //metodo construtor
    public Cliente(String nome_cliente, long cpf, int idade, String sexo) {
        this.nome_cliente = nome_cliente;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    //get e set de cliente
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    void mostrainfo(){
        System.out.println("Nome cliente: "+this.nome_cliente);
        System.out.println("cpf cliente: "+this.getCpf());
        System.out.println("Idade cliente: "+this.idade);
        System.out.println("Sexo cliente: "+this.sexo);
    }

}
