package array_com_loop;

public class Main {

    public static void main(String[] args) {
        //declarando um vetor
        int [] codigos={100,200,300,400,500};

        //percorrendo o array com loop for
        for(int i=0;i< codigos.length;i++){
            System.out.println("Mostrar os valores contidos em cada posicao do vetor: "+codigos[i]);
        }
    }
}
