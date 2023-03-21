package Relacionamento_classes;

public class Main {
    public static void main(String[] args) {

        Arma a1 =new Arma("fogo",300);
        Nave n1=new Nave("Falcon",500,false,"fogo",200);

        n1.addArma(a1);
        n1.MostraInfo();


    }
}
