import Execption.Execptiion.SaldoInsuficientException;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //aparece o erro porem o codigo continua com sua execucao
        //try tentar executar catch pegar o erro e informar e nao arrumar

        Conta conta=new Conta(100,200);

        //instanciar os clientes
        Cliente c1=new Cliente("Thales");
        Cliente c2=new Cliente("Leo");
        Cliente c3=null;

        conta.addcliente(c1);
        conta.addcliente(c2);
        conta.addcliente(c3);

        try {
            conta.Sacar(200);
        }
        catch (SaldoInsuficientException e){
            System.out.println("Erro " + e.getMessage());
        }


        conta.mostraInfo();

        System.out.println("fim");


    }
}