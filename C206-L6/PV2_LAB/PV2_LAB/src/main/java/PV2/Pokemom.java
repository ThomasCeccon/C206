package PV2;

public abstract class Pokemom {

    //atributos
    public static int qtdPokemom=0;
    private String nome;
    private String tipo;
    Heldltem heldItem = null; //associacao por agregacao

     //METODO CONSTURTOR
    public Pokemom(String nome, String tipo) {
        qtdPokemom++;
        this.qtdPokemom=qtdPokemom;
        this.nome = nome;
        this.tipo = tipo;
        this.heldItem= heldItem;
    }

    //metodos
    public void mostraInfo(){
        System.out.println("Informacoes do pokemom");
        System.out.println("ID do pokemom: "+this.qtdPokemom);
        System.out.println("Nome do pokemom: "+this.nome);
        System.out.println("Tipo do pokemom: "+this.tipo);
        if(this.heldItem!=null) {
            System.out.println("Tipo de heldltem: " + this.heldItem.tipo);
        }
        else {
            System.out.println("Nao tem helditem");
        }

    }

    //metodo abstrato
    public abstract void atacar();

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
