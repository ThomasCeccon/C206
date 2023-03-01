import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //instancia ao objeto
        Zumbi z = new Zumbi();

        //definindo valores
        z.nome = "Leo";
        z.alimentado=false;
      //saida dos valores definidos
        System.out.println(z.nome);

        //chamando e saindo com a funcao
       z.Alimentar(20);
       z.perdervida(10);


    }
}