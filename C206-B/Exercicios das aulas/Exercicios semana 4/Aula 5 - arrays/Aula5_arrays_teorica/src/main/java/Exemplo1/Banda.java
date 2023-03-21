package Exemplo1;

public class Bnada {
    //atributos
    String nome_banda;
    String genero_banda;

    //associcao por agreagacao de empresario
    Empresario empresarios;

    //associcao por agreagacao de membros
    Membro[] membros = new Membro[10];

    //associcao por agreagacao de musica
    Musica[] musicas = new Musica[10];

    //metodo construtor
    public Bnada(String nome_banda, String genero_banda) {
        this.nome_banda = nome_banda;
        this.genero_banda = genero_banda;
    }

    //metodos
    public void addMusicanova(Musica musica) {


    }

    public void addMembronovo(Membro membro) {

    }

    public void mostraInfo() {


    }
}
