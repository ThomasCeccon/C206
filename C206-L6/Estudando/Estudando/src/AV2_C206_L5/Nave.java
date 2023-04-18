package AV2_C206_L5;

public class Nave {

    //atributos
    private String nome;
    public Personagem[] personagens;//vetor por agregacao de personagem
    boolean velocidadeLuz;

    //metodos
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Personagem: "+this.personagens);
        System.out.println("Velocidade: "+this.velocidadeLuz);
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
