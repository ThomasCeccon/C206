package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        String componente_escolhido;


        System.out.println("Bem vindo ao almoxerifado");
        System.out.println("Escolha o Resistores | Capacitores | Leds");

        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        componente_escolhido = entrada.nextLine();

        //processamento e saida de dados
        switch (componente_escolhido) {
            case "Resistor":
                System.out.println("Resistor foi escolhido");
                break;
            case "Capacitor":
                System.out.println("Capacitor foi escolhido");
                break;
            case "Led":
                System.out.println("led foi escolhido");
                break;
            default:
                System.out.println("Invalido");

        }

    }
}