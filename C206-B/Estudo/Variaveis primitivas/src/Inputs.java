import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        //declaracao das variaveis
        String nome;
        int idade;

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Entre com seu nome!");
        nome=entrada.nextLine();

        System.out.println("Entre com sua idade!");
        idade=entrada.nextInt();

        if(idade>=18){
            System.out.println("Adulto");
        }
        else if(idade>=14&&idade<18){
            System.out.println("O " +nome+ " é Adolescente");
        }
        else {
            System.out.println("O " +nome+ " é criança ");
        }
    }
}
