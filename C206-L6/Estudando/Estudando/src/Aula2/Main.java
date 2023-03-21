package Aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao de variaveis
        String profissao;
        boolean flag = true;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        while (flag) {
            System.out.println("Entre com sua profissao!");
            profissao = entrada.nextLine();

            //processamento
            if (profissao.equals("Engenheiro")) {
                System.out.println("isso");
                flag = false;
            }
            else {
                System.out.println("Entre com outra profissao!");
                profissao = entrada.nextLine();
            }
        }


    }
}