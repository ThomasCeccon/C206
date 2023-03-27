package Exemplo2;

import Exemplo0.Salgado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaraco das variaveis
        int i, j;
        int x, y;
        int num_aleatorio;//x
        int num_aleatorio2;//y

        //declaracao uma matriz 2x2
        int[][] matriz;
        matriz = new int[2][2];

        //gerar numero aleatorio
        Random rand = new Random();
        num_aleatorio = rand.nextInt(2);
        num_aleatorio2 = rand.nextInt(2);

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("numero1 aleatroio:" + num_aleatorio);
        System.out.println("numero2 aleatroio:" + num_aleatorio2);

        System.out.println("Entre com a posicao x (1 ou 0):");
        x = entrada.nextInt();
        System.out.println("Entre com a posicao y (1 ou 0):");
        y = entrada.nextInt();


        //criar a matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                // matriz[i][j] = i + j;
                if (x == num_aleatorio && y == num_aleatorio2) {
                    System.out.println("Caiu na bomba");
                    break;
                } else {
                    System.out.println("se livrou");
                    break;
                }

            }
            break;

        }


    }
}
