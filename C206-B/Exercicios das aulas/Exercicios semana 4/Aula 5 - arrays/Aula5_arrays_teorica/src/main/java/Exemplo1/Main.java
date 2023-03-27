package Exemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        boolean flag = true;
        Scanner entrada = new Scanner(System.in);


        //instanciar os arrays e classes
        Banda b1 = new Banda("BEETS", "ROCK");//inatanciando a banda
        Empresario e1 = new Empresario("Jorge", 10100101);//instanciar os empresarios
        Membro[] membros = new Membro[3];//iniciar o array com 3 posicoes
        Musica[] musicas = new Musica[3];//iniciar o array com 3 posicoes

        /*
        membros[0]=new Membro();//instanciar 1 membro
        membros[1]=new Membro();//instanciar 2 membros
        membros[2]=new Membro();//instanciar 3 membros
        */

        while (flag) {

            //processamento
        }

        //saida de dados tudo na mostra info
        b1.mostraInfo();


    }
}
