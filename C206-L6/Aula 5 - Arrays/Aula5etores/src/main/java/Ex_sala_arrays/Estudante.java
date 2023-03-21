package Ex_sala_arrays;

public class Estudante {
    //atributos
    String nome;
    int idade;
    String ano;

    public Estudante(String nomeEstudante, int quantEstudantes) {

    }

    //metodos
    public void mostraInfo() {
        boolean condicao = true;
        int cont1 = 0;//contador primeiro ano
        int cont2 = 0;//contador segundo ano
        int cont3 = 0;//contador terceiro ano

        if (ano == "primeiro") {
            cont1++;
            System.out.println("Alunos do primeiro ano é: "+cont1);
        } else if (ano == "segundo") {
            cont2++;
            System.out.println("Alunos do segundo ano é: "+cont2);
        } else if (ano == "terceiro") {
            cont3++;
            System.out.println("Alunos do terceiro ano é: "+cont3);
        } else {
            condicao=false;
           mostraInfo();
        }

    }
}
