import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //declaracao das variaveis
        float C, K = 0, F = 0;//celsius,kelvin,fahrenheit
        float calculo_C, calculo_F, calculo_K;
        float resF, resK; //resultado em kelvin,fahrenheit


        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Graus Celsius:");
        C = entrada.nextFloat();

        //processamento
        calculo_C = (C / 5);
       // calculo_F = ((F - 32) / 9);
        //calculo_K = ((K - 273) / 5);

        resF=calculo_C*9 +32;
        resK=calculo_C*5+273;


        //saida de dados
        System.out.println("De Graus celsius para Fahrenheit é: "+resF+ "F");
        System.out.println("De Graus celsius para Kelvin é: "+resK+ "F");
    }
}
