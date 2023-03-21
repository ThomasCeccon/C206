package E_Sport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instanciar
        Time_sport t1 = new Time_sport();
        Atleta a1 = new Atleta();

        //definir valores as claesses
        Scanner entrada = new Scanner(System.in);
        //igualar as classes para facilitae na saida,
        t1.atleta = a1;

        //entrada de dados
        System.out.println("Entre com o nome do time: ");
        t1.nome_do_time = entrada.nextLine();
        System.out.println("Entre com o nome do tecnico: ");
        t1.nome_do_tecnico = entrada.nextLine();
        System.out.println("Entre com o nome do atleta: ");
        t1.atleta.nome_atleta = entrada.nextLine();
        System.out.println("Entre com o numero do atleta: ");
        t1.atleta.numero = entrada.nextInt();

        //saida de dados
        System.out.println("Entre com o nome do time: " + t1.nome_do_time);
        System.out.println("Entre com o nome do tecnico: " + t1.nome_do_tecnico);
        System.out.println("Entre com o nome do atleta: " + t1.atleta.nome_atleta);
        System.out.println("Entre com o numero do atleta: " + t1.atleta.numero);


    }
}
