package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        int n3=0;

        try {
            int n1=entrada.nextInt();
            int n2=entrada.nextInt();

            n3=n1/n2;
        }  catch (ArithmeticException e){
           // System.out.println(e);
            System.out.println("Nao pode dividir numero por 0");
        } catch (InputMismatchException e){
           // System.out.println(e);
            System.out.println("nao pode colocar float num tipo int");
        }finally {//ocorre se tem ou nao execao
            System.out.println(n3);
        }
         */
        Conta[] contas = new Conta[100];

        //instanciando os objetos conta
        Conta c1 = new Conta(100, "chris");
        Conta c2 = new Conta(20, "anna");
        Conta c3 = new Conta(100, "victor");

        //alocacao
        contas[0] = c1;
        contas[1] = c2;
        contas[10] = c3;

        //c1.Sacar(120);

        try {
            c1.Sacar(120);
        }catch (SemSaldoException e){
            System.out.println(e);
        }

        /*
        try {//tentar
            //alocacao
            contas[0] = c1;
            contas[1] = c2;
            contas[10] = c3;

        } catch (Exception e) {//se nao der (EXCEPTION:IDENTIFICA TODAS AS EXECOES)
            System.out.println("posicao inexistente");
            System.out.println(e);
            System.out.println(e.fillInStackTrace());//mostra todos os detalhes da execao
        }
         */

        /*
        //quando der erro nullpointerexception
        try {//tentar
            for (int i=0;i<contas.length;i++) {
                System.out.println("Dono da conta: " + contas[i].getDono());
                System.out.println("Saldo da conta: " + contas[i].getSaldo());
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
        }


        //se tirar o try e catch
        System.out.println("tem tres contas");

 */


    }
}