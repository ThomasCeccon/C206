package Ex3_Zumbi;

public class Main {
    public static void main(String[] args) {

        //instancia de z1 e z2
        Zumbi z1=new Zumbi();
        Zumbi z2=new Zumbi();

        //definindo as classes de z1 e z2
        z1.vida=100;
        z2.vida=200;

        //ponteiro que recebe o endereco da memoria ja alocada
         z1=z2;

       z1.vida=300;
       z2.vida=500;

        //chamada das funcoes
        z1.mostraVida();
        z2.mostraVida();

    }
}
