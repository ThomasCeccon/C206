import java.util.Scanner;

public class Ex3_estudante {
    public static void main(String[] args) {
            //declaracao das variaveis
            float npa;
            float soma;
            float media;
            float np3;

            //entrada de dados
            Scanner entrada = new Scanner(System.in);

            System.out.println("Entre com a NPA");
            npa = entrada.nextFloat();

            //processamento e saida de dados
            if (npa >= 60) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Entre com a NP3");
                np3 = entrada.nextFloat();
                soma = np3 + npa;
                media = soma / 2;
                if (media >= 50) {
                    System.out.println("Aluno Aprovado");
                } else {
                    System.out.println("Aluno reprovado");
                }

            }
            entrada.close();

        }
}
