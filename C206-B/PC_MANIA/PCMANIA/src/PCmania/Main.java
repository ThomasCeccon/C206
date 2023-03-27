package PCmania;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //instancair o obejto todo
       Computador []computador=new Computador[100];

       computador[0]=new Computador();//positivo
        computador[1]=new Computador();//acer
        computador[2]=new Computador();//vaio


        //instanciar a memoriaUSB
        MemoriaUSB memoriaUSB=new MemoriaUSB();

        //instanciar o objeto Cliente
        Cliente []clientes=new Cliente[100];

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        boolean flag = true;
        String opcao;
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo a melhor loja de Pcs da região, PC MANIA!!!");
        Thread.sleep(500);
        System.out.println("Estamos com algumas promoções, para agilizar o seu atendimento procure pelo nome de alguma das marcas!");
        Thread.sleep(500);
        System.out.println("As marcas disponíveis são: Acer, Vaio, Positivo");
        Thread.sleep(500);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        while(flag == true){
            System.out.println("Digite e aguarde: ");
            opcao = entrada.nextLine();
            //animacao pesquisando
            System.out.print("pesquisando.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            switch (opcao){

                case "Promocção 1":
                    System.out.println("Encontrado");

                    break;

                case "Promocção 2":
                    System.out.println("Encontrado");
                    break;

                case "Promocção 3":
                    System.out.println("Encontrado");
                    break;

                case "0":
                    flag = false;
                    System.out.print("Saindo da PC MANIA.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);
            }
        }
    }
}