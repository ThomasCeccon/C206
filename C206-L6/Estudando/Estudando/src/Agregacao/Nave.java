package Agregacao;

public class Nave {
    //atribuicao
    String nome;
    int velocidade;
    boolean velocidadeDaLUz;

    //associacao por agregacao
    Arma arma = null;


    //criar um construtor para colocar as informacoes
    public Nave(String nome, int velocidade, boolean velocidadeDaLUz, String tipoarma, int forcaarma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLUz = velocidadeDaLUz;

        //agregacao
        this.arma = arma;

        //composicao
        //  this.arma=new Arma(tipoarma,forcaarma);
    }


    //metodos
    void mostraInfo() {
        System.out.println("nome da nave: " + this.nome);
        System.out.println("Velocidade da nave: " + this.velocidade);
        if(this.arma==null){
            System.out.println("nao tem arma adicionado");
        }
        else{
            System.out.println("nome da arma: " + this.arma.nome);
            System.out.println("dano da arma: " + this.arma.poder);
        }


    }

    void viajarVelocidadeLuz() {
        if (this.velocidadeDaLUz == true) {
            System.out.println("Viajou na velocidade da luz");
        } else {
            System.out.println("nao viajo na velocidade da luz");
        }
    }

    void addArma(Arma arma) {
        System.out.println("Arma adicionada! ");
        this.arma = arma;
    }
}

