import java.util.Scanner;

public class Media_Salario {
    public static void main(String[] args) {
        //declaracao das variaveis
        double media, s1, s2, s3, s4;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o salario 1!");
        s1 = entrada.nextDouble();
        System.out.println("Entre com o salario 2!");
        s2= entrada.nextDouble();
        System.out.println("Entre com o salario 3!");
        s3 = entrada.nextDouble();
        System.out.println("Entre com o salario 4!");
        s4 = entrada.nextDouble();

        //porcessamento
        media=(s1+s2+s3+s4)/4;

        //saida de dados
        System.out.println("A media de salario dos quatro funcionarios é de: "+media);
    }
}
