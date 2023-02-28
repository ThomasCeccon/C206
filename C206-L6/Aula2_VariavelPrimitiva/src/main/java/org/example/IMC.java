package org.example;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        //declarao das variaveis
        float imc, peso, altura;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu peso!");
        peso = entrada.nextFloat();

        System.out.println("Entre com sua altura!");
        altura = entrada.nextFloat();

        //processamento
        imc = (float) (peso / Math.pow(altura, 2));

        //saida de dados
        System.out.println(String.format("IMC: %.2f", imc));


        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3 ou mórbida.");
        }

    }
}
