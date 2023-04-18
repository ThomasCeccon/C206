package AV2_C206_L5;

public abstract class  Personagem {

    //atributos
    public static int cont=0;//atributo estatico
    private String nome;
    private int id;
    private int poder;

    //METODO CONSTRUTOR
    public Personagem(String nome, int id, int poder) {
        cont++;//contador
        this.nome = nome;
        this.id = cont;
        this.poder = poder;
    }

    //metodos
    public void mostraInfo(){


    }
    public void travarBatalha(){

    }

    //GET AND SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
