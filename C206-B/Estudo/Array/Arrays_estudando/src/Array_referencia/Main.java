package Array_referencia;

public class Main {
    public static void main(String[] args) {

        //forma 1 array por referencia
        Conta[] contas = new Conta[5];//instancia com vetor de 5 posicoes
        Conta c1 = new Conta();//c1 recebe os dados
        c1.deposita(10);//
        contas[0]=c1;//posicao 0 de conta recebe c1
        System.out.println("Forma 1: "+contas[0].saldo);

        //forma 2
        Conta[] contas2=new Conta[5];//instanciar conta2
        contas2[0]=new Conta();//posicao 0 recebe nova conta
        contas2[0].deposita(1000);//posicao 0 com quantia de 10000
        System.out.println("Forma 2: "+contas2[0].saldo);//saida de dados

    }
}