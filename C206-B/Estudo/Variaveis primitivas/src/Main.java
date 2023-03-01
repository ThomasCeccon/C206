import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        String nome;

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Entre com seu nome!");
       nome= entrada.nextLine();


        //saida de dados
        System.out.println("Seu nome é: "+nome);
        System.out.println("contem: "+nome.length()+ " letras");
        System.out.println("Paasar para maiuscula: " +nome.toUpperCase());

    }
}