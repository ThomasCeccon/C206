import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracao das variaveis
        int lanche1;
        int lanche2;
        int lanche3;
        int soma_lanches;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Lanche 1");
        lanche1=entrada.nextInt();

        System.out.println("Lanche 2");
        lanche2=entrada.nextInt();

        System.out.println("Lanche 3");
        lanche3=entrada.nextInt();

        //processamento
        soma_lanches=lanche1+lanche2+lanche3;

        //saida de dados
        System.out.println("Lanches pedidos " +soma_lanches+ " vezes");





    }
}