package Ex4_Zumbi;

public class Main {

    public static void main(String[] args) {

        boolean deu_passar;

        //instancia de z1 e z2
        Zumbi z1=new Zumbi();
        Zumbi z2=new Zumbi();

        //definindo valores a classe
        z1.nome="Carlos";
        z1.vida=40;
        z2.nome="Ze";
        z2.vida=10;

        //chamando os metodos
        z1.mostraVida();
        z2.mostraVida();
        //z1 passou 30 para z2
        deu_passar= z1.transfereVida(z2,30);

       if(deu_passar){
           System.out.println("transferencia concluida para: " +z2.nome+ " passou de "+z2.vida);
       }
       else{
           System.out.println("transferencia negada "+z2.vida);
       }

    }
}
