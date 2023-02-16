import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracao das variaveis
        int numero_alunos;
        Scanner entrada=new Scanner(System.in);


        //entrada de dados
        System.out.println("Entre com o numero de alunos");
        numero_alunos=entrada.nextInt();

        //processamento
        switch (numero_alunos){
            case 10 :
            case 20 :
                System.out.println("Pode ser na sala L-16");
                break;

            case 30:
                System.out.println("Pode ser na sala L-22");
                break;

            default:
                System.out.println("Não a salas disponiveis");

        }


    }
}