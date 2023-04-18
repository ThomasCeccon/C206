package AV2_C206_L3;

public class Skin {

    //atributos
    private String nome;
    private String raridade;

  //metodo construtor
    public Skin(String nome, String raridade) {
        this.nome = nome;
        this.raridade = raridade;
    }

    public void mostraInfo(){
        System.out.println("Nome da Skin: "+this.nome);
        System.out.println("Raridade da skin nivel: "+this.raridade);
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}
