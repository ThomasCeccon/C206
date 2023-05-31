package org.example;

import java.time.temporal.ValueRange;

public class Conta {

    //atributos
    private double saldo;
    private String dono;

    //metodo construtor
    public Conta(double saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    //get
    public double getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    //metodo
        public void Sacar(float valorSaque) throws SemSaldoException {
        /*
        try {
            if (valorSaque > this.saldo) {
                throw new SemSaldoException(valorSaque);
               // System.out.println("Saldo insuficiente");
            } else {
                System.out.println("Valor disponivel " + (this.saldo - valorSaque));
            }
        }catch (SemSaldoException e){
            System.out.println(e);
            System.out.println("Sem saldo dispoinivel");

        }
         */
            if (valorSaque > this.saldo) {
                throw new SemSaldoException(valorSaque);
                // System.out.println("Saldo insuficiente");
            } else {
                System.out.println("Valor disponivel " + (this.saldo - valorSaque));
            }

    }


}
