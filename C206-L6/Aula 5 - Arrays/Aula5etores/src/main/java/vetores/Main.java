package vetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //if(nome.equals("victor"));
        //vetor que quarda varios valores

        //declaracao das variaveis
        // int [] arrayInt ={10,20,30,40,50,60,70,80,90,100};
        //System.out.println("valor que saiu na posicao 2 "+arrayInt[2]);

        //criar array de livros
        Scanner entrada = new Scanner(System.in);

        Livro[] livros = new Livro[10];
        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilac Pinto";

        boolean flag = true;

        while (flag) {
            System.out.println("bem vindo ao menu da bilbioteca: " + b1.nome);
            System.out.println("1- cadastrar novo livro");
            System.out.println("2- Mostrar informações dos livros");
            System.out.println("3- sair do menu");

            int operacao;

            operacao = entrada.nextInt();

            switch (operacao) {

                case 1:
                    System.out.println("cadastre um nome do livro");
                    entrada.nextLine();
                    System.out.println("entre com o nome do livro: ");
                    String nome_livro = entrada.nextLine();

                    System.out.println("entre com a quantidade de paginas do livro: ");
                    int quantPaginas = entrada.nextInt();

                    //instanciar nome e quantidade de livros
                    Livro l = new Livro(nome_livro, quantPaginas);

                    b1.addLivro(l);

                    System.out.println("livro adicionado!");
                    break;

                case 2:
                    b1.mostraInfo();
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("entre com um numero valido");
            }

        }

        Livro l1 = new Livro("Diario de um banana", 300);
        livros[0] = l1;

        livros[1] = new Livro("Jogos vorazes", 400);

       /* for(int i=0;i<livros.length;i++){

            if(livros[i]!=null) {
                System.out.println(livros[i].nome);
                System.out.println(livros[i].numPage);
            }
        }
*/
        for (int i = 0; i < livros.length; i++) {

            if (livros[i] != null) {
                livros[i].mostraInfo();
            }
        }


    }
}