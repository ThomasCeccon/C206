package org.example;

//criando uma classe com excecao (raio)
public class SemSaldoException extends Exception{

    //construtor

    public SemSaldoException(float valor) {
        System.out.println("Sem valor disponivel, saque de "+valor +" negado");
    }
}

