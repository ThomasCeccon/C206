package AV1_C206_L2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaraco das variaveis
        boolean flag=true;
        int opcao;

        //instanciar o objeto todo
        Plataforma plataforma=new Plataforma();
        plataforma.nome="Netflix";

        //iniciar o array serie
        Serie []series=new Serie[10];

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Entrar no menu: ");
        System.out.println("================");

        while (flag){

            System.out.println("1- Adicionar uma serie na plataforma: ");
            System.out.println("2- Mostrar as informacoes da plataforma e suas series: ");
            System.out.println("3- Mostrar o nome da serie com maior numero de temporadas que ja foi finalizada: ");
            System.out.println("4- A porcentagem do numero de series e a media aritmetica de notas que a serie possui 3 ou mais temporadas: ");

            opcao=entrada.nextInt();

            switch (opcao) {

                case 1:
                    entrada.nextLine();

                    System.out.println("Nome da serie: ");
                    String nome_serie= entrada.nextLine();

                    System.out.println("Nota da serie: ");
                    double nota_serie=entrada.nextDouble();

                    System.out.println("Temporadas: ");
                    int quant_temporada= entrada.nextInt();

                    System.out.println("Foi finalizada: ");
                    Boolean foi_finalizada=entrada.nextBoolean();

                    entrada.nextLine();

                    System.out.println("Nome do diretor: ");
                    String nome_diretor= entrada.nextLine();

                    Serie serie=new Serie(nome_serie,nota_serie,quant_temporada,foi_finalizada,nome_diretor);  //instanciar o array de series

                    plataforma.addSerie(serie);//adicionando as informacoes em adicionar serie
                    break;

                case 2:
                    plataforma.mostraInfo();
                    break;

                case 3:
                    plataforma.serieMaisLongaFinalizada();
                    break;

                case 4:
                    plataforma.mediaPorcentagem();

                case 5:
                    flag=false;
                    System.out.println("Sair do menu!");

                default:
                    break;




            }


        }
    }
}
