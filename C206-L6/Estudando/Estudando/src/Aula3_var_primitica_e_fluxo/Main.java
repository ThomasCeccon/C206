package Aula3_var_primitica_e_fluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exercicio imc

        //declaraco das variaveis
        double IMC, peso, altura;
        String nome;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        nome = entrada.nextLine();

        System.out.println("entre com seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Entre com sua altura: ");
        altura = entrada.nextDouble();

        //processamento
        IMC = (peso / Math.pow(altura, 2));

        //saida de dados

        if (IMC < 18.5) {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta com peso normal");

        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta com sobrepeso");

        } else if (IMC >= 30 && IMC < 34.9) {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta com obesidade grau 1");

        } else if (IMC >= 35 && IMC < 39.9) {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta com obesidade grau 2");

        } else {
            System.out.println("O " + nome + " esta com IMC de: " + IMC + " e esta com obesidade grau 3 ou mórbita");

        }
        /*
        //variavel primitiva:nomes associados a um espaco de memoria(guarda valores)
        int valor;
        double pi=3.14159;

        //variavel de referencia(ponteiro que guarda o endereco de memoria)


        //Casting
        double numDouble;
        float numFloat;
        int numInteiro;
        String nome;

        numDouble=1.54984;
        numFloat=(float)numDouble;
        System.out.println("Casting de double para float : "+numFloat);

        System.out.println("-----------------");
        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Entre com inteiro");
        numInteiro=entrada.nextInt();

        System.out.println("entre com float");
        numFloat= entrada.nextFloat();

        System.out.println("entre com double");
        numDouble=entrada.nextDouble();

        //sempre que entrar com numeros primeiro e depois nome deve-se pular uma linha
        entrada.nextLine();

        System.out.println("Entre com seu nome");
        nome=entrada.nextLine();

        System.out.println("----------------");

        //controle de fluxo
        /*
        *==,<=,>=,>>,<<
        * &&,||


        //estrutura de repeticao while
        int contador=0;
        while (contador<30){
            System.out.println("contador: "+contador);
            contador++;
        }
        //estrutura de repeticao for
        for (int i=0;i<30;i++){
            if(i%2==0) {
                System.out.println("valores pares: " + i);
                      }
            else {
                System.out.println("valores impares: "+i);
            }
        }

*/


    }
}