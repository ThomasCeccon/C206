package Aula5_Arrays;

public class Main {
    public static void main(String[] args) {

        //array do tipo int con valores definidos
        int numeros[]={10,20,30};

        //saida de dados
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        System.out.println("================");

        //percorrendo esses numeros com for
        for(int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }

        System.out.println("================");

        System.out.println("com for-each");
        for (int numero:numeros){
            System.out.println(numero);

        }

        System.out.println("================");

        System.out.println("Array de referencia");

       //criando um array de contas e defininndo quantos objetos seram instanciados
        Conta[] c1=new Conta[2];
        Conta[] c2=new Conta[1];

        //intanciar os objeto array
        c1[0]=new Conta("Thales",1000);
        c1[1]=new Conta("Pedro",200);

        c2[0]=new Conta("thomas",700);

        //saida de dados
        System.out.println("nome da conta 1: " +c1[0].nome);
        System.out.println("saldo da conta 1: " +c1[0].saldo);
        System.out.println("nome da conta 2: " +c1[1].nome);
        System.out.println("nome da conta 2: " +c1[1].saldo);
        System.out.println("nome da conta 3: " +c2[0].nome);
        System.out.println("nome da conta 3: " +c2[0].saldo);

        System.out.println("================");

        System.out.println("Array de referencia com loop");
        //conta 1 e 2
        for (int i=0;i< c1.length;i++){
           if (c1[i]!=null){
               System.out.println("nome da conta " +i+" : " +c1[i].nome);
               System.out.println("saldo da conta "+i+ " : " +c1[i].saldo);
           }
        }
        for (int i=0;i< c2.length;i++){
            System.out.println("nome da conta " +i+" : " +c2[i].nome);
            System.out.println("saldo da conta "+i+ " : " +c2[i].saldo);
        }

        //teste caso erro nullpointerexeption
        System.out.println("resolver erro nullpointerexeption");
        for (int i=0;i< c1.length;i++){
            if (c1[i]!=null){//1° solucao arrays sendo diferente de null
                System.out.println("nome da conta " +i+" : " +c1[i].nome);
                System.out.println("saldo da conta "+i+ " : " +c1[i].saldo);
            }
        }
        for (int i=0;i< c2.length;i++){
            // c2[i]=new Conta(); 2° solucao instanciar todos os obejtos com o tipo conta assim nenhuma posicao nul
            System.out.println("nome da conta " +i+" : " +c2[i].nome);
            System.out.println("saldo da conta "+i+ " : " +c2[i].saldo);
        }





    }
}
