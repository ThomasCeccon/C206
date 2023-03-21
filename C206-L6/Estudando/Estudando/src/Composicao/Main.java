package Composicao;

public class Main {
    public static void main(String[] args) {

        //instanciar so a nave objeto(todo) pois o objeto parte esta ligado
        Nave n1=new Nave("Pogue",100,"espingarda",20);

        //saida de dados
        System.out.println("nome da nave: " +n1.nome);
        System.out.println("velocidade da nave: " +n1.velocidade);
        System.out.println("nome da arma: " +n1.arma.nome);
        System.out.println("poder da arma: " +n1.arma.poder);

    }
}
