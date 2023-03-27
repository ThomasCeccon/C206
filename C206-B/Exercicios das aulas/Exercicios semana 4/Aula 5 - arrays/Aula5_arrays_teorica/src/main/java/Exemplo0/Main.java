package Exemplo0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        String entrada_salgado;
        String nome;

        //scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);

        //inicializar o vetor
        Salgado[] s1 = new Salgado[3];

        //instanciar os arrays
       // s1[0] = new Salgado();
       // s1[1] = new Salgado();// s1[2] = new Salgado();

        //chamar
        //s1[0].nome="coxinha";
        //s1[1].nome="PAO";
        //s1[2].nome="Empada";

        //instanciar a classe cantina
        Cantina c1 = new Cantina();

        //nome da cantina
        c1.nome = "Cantina do Inatel";

        //entrada de salgados
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite 3 salgados que deseja comer: ");
            entrada_salgado = entrada.nextLine();
            Salgado nSalgado = new Salgado(entrada_salgado);
            c1.addSalgado(nSalgado);
        }

        c1.mostrarInfo();


      /* //definir os salgados a cada posicao
        s1[0].nome="pao de queijo";
        s1[0].nome="Rosca";
        s1[0].nome="Empada";
       */


    }
}