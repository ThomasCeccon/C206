import java.util.Random;
import java.util.Scanner;

public class Ex5_adivinhar {

    public static void main(String[] args) {

        //declaracao das variaveis
        int numero_gerado;
        int adivinhar;
        Scanner entrada = new Scanner(System.in);

        //entrada de dados

        Random rand = new Random();
        numero_gerado = rand.nextInt(10) + 1;

        //processamento
        for (int i = 1; i <= 10; i++) {

            //saida de dados
            System.out.println("Adivinhe o numero: " + numero_gerado);
            adivinhar = entrada.nextInt();

            if (adivinhar == numero_gerado) {
                System.out.println("voce encontrou!");
                break;
            }
            else{
                System.out.println("Errou");
            }

        }
    }
}
