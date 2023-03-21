package vetores;

public class Livro {
    //atributos
    String nome;
    int numPage;

    //construtor
    public Livro(String nome, int numPage) {
        this.nome = nome;
        this.numPage = numPage;
    }

    //metodo
    public void mostraInfo(){
        System.out.println("nome do livro: " +this.nome);
        System.out.println("numero de paginas: "+this.numPage);
    }
}
