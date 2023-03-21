package Relacionamento_classes;

public class Nave {

    //atributos
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;

    Arma arma;

    //metodo

//agregacao nao precida dos dados da arma
    public Nave(String nome, int velocidade, boolean velocidadeDaLuz,String tipo,int forca) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;

        //agragacao
        //this.arma=arma;

        //composicao
        this.arma=new Arma(tipo,forca);
    }

    public void MostraInfo() {
        System.out.println("nome da nave " +this.nome);
        System.out.println("Velocidsde da nave " +this.velocidade);

       if(this.arma==null){
           System.out.println("nao tem arma adicionada");
       }
       else{
           System.out.println("tipo da arma: "+this.arma.tipo);
           System.out.println("forca da arma: "+this.arma.forca);
       }

    }
    public void viajarvelocidadedaluz(){
        if(this.velocidadeDaLuz==true){
            System.out.println(" viaja em velocidade da luz");
        }
        else{
            System.out.println("nao viaja em velocidade da luz");
        }
    }

    public void addArma(Arma arma) {
        System.out.println("arma criada");
        System.out.println("Arma foi acionada");
        this.arma=arma;
    }
}
