package org.example;

public class Conta implements Comparable<Conta> {

    //atributos
    String dono;
    int saldo;

    /*
    *ordenar conta
    * 1 implementar na classe Comparable<Conta>
    * 2-criar metodo overide

     */


    //metodo construtor
    public Conta(String dono, int saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    //metodo construtor
    @Override
    public int compareTo(Conta o) {
        //saldo c1,
       // return Integer.compare(this.saldo,o.saldo);
        return dono.compareTo(o.dono);
    }
}
