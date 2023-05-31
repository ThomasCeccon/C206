package org.example;

public class Main {
    public static void main(String[] args)
    {
        ThreadContadora t1=new ThreadContadora("Thread 1",1000);
        ThreadContadora t2=new ThreadContadora("Thread 2",3000);
        ThreadContadora t3=new ThreadContadora("Thread 3",4000);

        //metodo para comecar

       // usando extends
        t1.start();
        t2.start();
        t3.start();

        /* colocar se for interface
        Thread tc1=new Thread(t1);
        Thread tc2=new Thread(t2);
        Thread tc3=new Thread(t3);

        tc1.start();
        tc2.start();
        tc3.start();
       */


    }
}