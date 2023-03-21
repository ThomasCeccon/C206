package Arrays_formas_instanciar;

public class Main {
    public static void main(String[] args) {

        //forma 1 de instanciar
        //criar array de conta
        Conta[] conta = new Conta[5];

        //instanciar a conta
        //forma 1 de instanciar
        Conta c1 = new Conta("Thomas", 500);
        Conta c2 = new Conta("joana", 700);
        conta[0] = c1;
        conta[1] = c2;
        //forma 2 de instanciar
        conta[2] = new Conta("Thales", 600);
       /*
        //atribuindo as contas as posicoes dos vetores
        conta[0] = c1;
        System.out.println("Nome 0: " + conta[0].nome);
        System.out.println("Saldo 0: " + conta[0].saldo);
        conta[1] = c2;
        System.out.println("Nome 1: " + conta[1].nome);
        System.out.println("Saldo 1: " + conta[1].saldo);
        //forma 2 de instanciar
        conta[2] = new Conta("Thales", 600);
        System.out.println("Nome 2: " + conta[2].nome);
        System.out.println("Saldo 2: " + conta[2].saldo);
        */

        //usando for
        for (int i = 0; i < conta.length; i++) {
            if (conta[i] != null) {
                System.out.println("Nome: " + conta[i].nome);
                System.out.println("Saldo: " + conta[i].saldo);
            }
        }

    }
}