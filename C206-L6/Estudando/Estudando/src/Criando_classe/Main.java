package Criando_classe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         *Para invocar metodos(funcao no caso salarioAnual) que retornam valores precisam ser armazenados em uma variavel
         */

        //criando variavel auxiliar (invocar metodos)
        float salarioAnual1;
        float salarioAnual2;
        float salarioAnual_decimoterceiro;



        //instanciar o objeto para definir valores na main usando construtor
        Funcionario f1 = new Funcionario();//funcionario 1
        Funcionario f2=new Funcionario();//funcionario 2

        //entrada de dados
        Scanner entrada = new Scanner(System.in);
/*
        System.out.println("Entre com seu nome");
        f1.nome=entrada.nextLine();

        System.out.println("Entre com sua idade: ");
        f1.idade= entrada.nextInt();

        System.out.println("Entre com seu cpf:");
        f1.cpf=entrada.nextInt();

        System.out.println("Entre com seu salario: ");
        f1.salario=entrada.nextFloat();

        entrada.nextLine();

        System.out.println("Mes e dia para entrar de ferias: ");
        f1.tirarFerias(entrada.nextLine(),entrada.nextInt());//entrar com mes e dia
 */

        //definir valores ao objeto funcionario 1 sem metodo construtor
        f1.nome = "tho";
        f1.idade = 19;
        f1.cpf = 1101010;
        f1.salario = 1000;

        //definir valores ao objeto funcionario 2 sem metodo construtor
        f2.nome = "tho";
        f2.idade = 19;
        f2.cpf = 1101010;
        f2.salario = 1000;

        //precisa fazer isso antes para igualar
        f1=f2;//para ficar igual: f1 recebe dados de f2

        //tipos de referencia(esta passando o endereco de memoria e nao os dados
        if(f1==f2){
            System.out.println("sao iguais!");
        }
        else{
            System.out.println("Sao diferentes");
        }

        System.out.println("----------------------------");

        //saida do funcioanrio 1
        System.out.println("Mes e dia para entrar de ferias funcionario 1: ");
        f1.tirarFerias("Maio", 10);//entrar com mes e dia

        f1.mostraInfo(); //chamar essa funcao para mostrar as informacoes pessoais

        salarioAnual1 = f1.calcularSalarioAnual(); //chamar essa funcao para mostrar as informacoes
        salarioAnual_decimoterceiro=f1.calcularSalarioAnual(20);

        System.out.println("salario anual do funcionario 1 é de: " + salarioAnual1);
        System.out.println("Salario anual + decimo terceiro do funcionaro 1 é: "+salarioAnual_decimoterceiro);

        System.out.println("--------------");

        //saida do funcionario 2
        System.out.println("Mes e dia para entrar de ferias o funcionario 2: ");
        f2.tirarFerias("junho", 10);//entrar com mes e dia

        f2.mostraInfo(); //chamar essa funcao para mostrar as informacoes pessoais

        salarioAnual2 = f2.calcularSalarioAnual(); //chamar essa funcao para mostrar as informacoes
        salarioAnual_decimoterceiro=f2.calcularSalarioAnual(10);

        System.out.println("salario anual é de: " + salarioAnual2);
        System.out.println("Salario anual + decimo terceiro: "+salarioAnual_decimoterceiro);
    }
}
