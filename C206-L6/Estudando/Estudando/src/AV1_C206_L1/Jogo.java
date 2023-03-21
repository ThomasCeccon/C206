package AV1_C206_L1;

public class Jogo {
    //atributos
    String nome_jogo;
    String genero;
    double preco;
    boolean dlc;

    //metodo construtor

    public Jogo(String nome_jogo, String genero, double preco, boolean dlc) {
        this.nome_jogo = nome_jogo;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    //metodos
    void mostraInfo(){
        System.out.println("informacoes do jogo: ");
        System.out.println("nome do jogo: "+this.nome_jogo);
        System.out.println("Genero do jogo: "+this.genero);
        System.out.println("preco do jogo: "+this.preco);
        System.out.println("dlc do jogo: "+this.dlc);
    }

}
