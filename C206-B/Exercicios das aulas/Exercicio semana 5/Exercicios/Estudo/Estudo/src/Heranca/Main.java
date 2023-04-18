package Heranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instanciar a classe
        Funcionario f1=new Funcionario("Thales",23,1000);
        Engenheiro e1=new Engenheiro("Thomas",19,800);

        f1.mostraInfo();
        e1.mostraInfo();

        /*
        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Nome do Funcionario");
        f1.nome=entrada.nextLine();

        System.out.println("Idade do funcionario");
        f1.idade= entrada.nextInt();

        System.out.println("Salario do funcionario");
        f1.salario= entrada.nextDouble();

        f1.mostraInfo();

        System.out.println("======================");

        entrada.nextLine();

        System.out.println("Nome do Engenheiro");
        e1.nome=entrada.nextLine();

        System.out.println("Idade do Engenheiro");
        e1.idade= entrada.nextInt();

        System.out.println("Salario do Engenheiro");
        e1.salario= entrada.nextDouble();

        e1.mostraInfo();
         */

    }
}
