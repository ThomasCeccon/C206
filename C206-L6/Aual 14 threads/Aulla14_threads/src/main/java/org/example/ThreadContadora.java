package org.example;

//threads com implments ou enxtends
public class ThreadContadora extends Thread {

    //atributos
    String nome;
    int velocidade;

    //metodo construtor
    public ThreadContadora(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    //como rodar a thread
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(this.nome+" - "+i);
            System.out.println(i*10+"% carregado");
            try {
               Thread.sleep(this.velocidade);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
