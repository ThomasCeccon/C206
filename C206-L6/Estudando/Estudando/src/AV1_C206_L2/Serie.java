package AV1_C206_L2;

public class Serie {
    //atributos
    String nome;
    double nota;
    int temporada;
    boolean finalizada;

    //associcao por composicao entre serie e diretor
    Diretor diretor;

    //metodo construtor (lembrar de colocar as caracteristicas do diretor na funcao)
    public Serie(String nome, double nota, int temporada, boolean finalizada,String nome_diretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporada = temporada;
        this.finalizada = finalizada;
        this.diretor = new Diretor(nome_diretor); //composicao
    }

    //metodo
    void mostraInfo(){
        System.out.println("Nome da serie: "+this.nome);
        System.out.println("Nota da serie: "+this.nota);
        System.out.println("Temporadas: "+this.temporada);
        System.out.println("Foi finalizada: "+this.finalizada);
        System.out.println("Nome do diretor: "+this.diretor.nome);

    }
}
