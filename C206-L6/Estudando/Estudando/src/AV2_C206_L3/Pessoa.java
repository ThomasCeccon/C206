package AV2_C206_L3;

public abstract class Pessoa {
    //atributos
    public static int quantPessoa=0;
    private String nome;

    //metodo construtor
    public Pessoa(String nome) {
        quantPessoa++;
        this.nome = nome;
    }

    //metodos
    public void mostraInfo(){
        System.out.println("Nome: "+this.getNome());
    }

    //metodo abstrato
    public abstract void fazmissao();

    //get e set
    public int getQuantPessoa() {
        return quantPessoa;
    }

    public void setQuantPessoa(int quantPessoa) {
        this.quantPessoa = quantPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
