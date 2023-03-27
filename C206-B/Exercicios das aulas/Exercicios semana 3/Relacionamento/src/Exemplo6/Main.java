
package Exemplo6;

public class Main {
    public static void main(String[] args) {

        //instanciar
        Kart k1=new Kart();
        Kart k2=new Kart();

        Piloto piloto1=new Piloto();
        Piloto piloto2=new Piloto();

        //definir valores a classe

        k1.nome="Ferrari";
        k2.nome="suzuki";

        piloto1.nome="joao";
        piloto2.nome="Carlos";

        //associar
        k1.motor.cilindradas=50;
        k2.motor.cilindradas=100;
        k1.motor.velocidadeMaxima=100f;
        k2.motor.velocidadeMaxima=200f;

        k1.piloto=piloto1;
        k2.piloto=piloto2;

        //mostrar cilindradas do kart 1 e kart 2
        k1.motor.mostrarinfo();
        k2.motor.mostrarinfo();

        


        System.out.println("Nome do carro: " +k1.nome);
        System.out.println("Nome do piloto: " +piloto1.nome);
        k1.motor.mostrarinfo();


    }
}
