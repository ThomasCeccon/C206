import java.util.Scanner;

public class Ex2_media_lanche {

    public static void main(String[] args) {
        int lanche1;
        int lanche2;
        int lanche3;
        int media;
        int soma_lanches;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Lanche 1");
        lanche1 = entrada.nextInt();

        System.out.println("Lanche 2");
        lanche2 = entrada.nextInt();

        System.out.println("Lanche 3");
        lanche3 = entrada.nextInt();

        //finalizando as entradas
        entrada.close();

        //processamento
        soma_lanches = lanche1 + lanche2 + lanche3;

        media = soma_lanches / 3;

        //saida de dados
        System.out.println("Soma dos lanches é de " + soma_lanches);
        System.out.println("Com média de " + media);
    }
}
