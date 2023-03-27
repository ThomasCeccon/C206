package Arrays;

public class Main {
    public static void main(String[] args) {

        //Arrays do tipo primitivo quarda valores
        //Arrays do tipo objeto quarda referencia

        //testando classes com arrays
        Bloco bloco[]=new Bloco[5];//instanciando classes com arrays
        Bloco b1=new Bloco();
        bloco[0]=b1;
        System.out.println(bloco[0]);
        System.out.println(bloco[1]);
        System.out.println(bloco[2]);

        //declarando arrays
       // int []num;

        //inicializar um array
        int []num=new int[10];//array com 10 posicoes
        // int []valores=new int[];//nao compila
        int dados[]={10,20,30};//array que guarda em 3 posicoes valores

        //saida de dados
        System.out.println(dados[0]);
        System.out.println(dados[1]);
        System.out.println(dados[2]);

    }
}