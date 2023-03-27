package Multiplicidade;

public class Main {
    public static void main(String[] args) {

        //instannciar e definir a quantidade de contas que sao 5
        Conta[] contas = new Conta[5];
        Cliente[] clientes = new Cliente[5];

        //definir posicao e uma nava conta
        contas[0] = new Conta();//criando na posicao 0 nova conta
        clientes[0] = new Cliente();//criando na posicao 0 novo cliente
        contas[1] = new Conta();//criando na posicao 1 nova conta
        clientes[1] = new Cliente();//criando na posicao 1 novo cliente

        //inserindo valores a conta 0
        clientes[0].nome = "Thomas";
        clientes[0].cpf = 10101001;
        contas[0].saldo = 100;

        //inserindo valores a conta 1
        clientes[1].nome = "Paula";
        clientes[1].cpf = 1030403;
        contas[1].saldo = 200;

        //saida de dados
        System.out.println("nome:" + clientes[0].nome + " cpf:" + clientes[0].cpf + " saldo:" + contas[0].saldo);
        System.out.println("nome:" + clientes[1].nome + " cpf:" + clientes[1].cpf + " saldo:" + contas[1].saldo);

    }
}
