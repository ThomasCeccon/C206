import java.util.Scanner;

public class HomemMulher {
    public static void main(String[] args) {

        //declaraco das variaveis
        int sexo;
        int qmulheres=0,qhomens=0;
        float somaH=0;
        float mediaHomem=0;
        float maior=0;
        float menor=0;
        float altura ;

        //entrada de dados
        Scanner entrada=new Scanner(System.in);

        //processamento
        for(int i=0;i<2;i++){
            System.out.println("Entre com o sexo: (1)-Mulher (2)-Homem da pessoa "+i);
            sexo=entrada.nextInt();

            System.out.println("Entre com a altura: "+i);
            altura=entrada.nextFloat();

            if(sexo==1){
                qmulheres++;
            }
            else if(sexo==2){
               qhomens++;
               somaH=somaH+altura;
            }
            else{
                System.out.println("Sexo inválido");
            }
            if(altura>maior){
                maior=altura;
            }
            else if(altura<menor){
                menor=altura;
            }
        }
        mediaHomem=somaH/qhomens;

        //saida de dados
        System.out.println("A maior altura do grupo é de: "+ maior + " m, e a menor é de: "+ menor +" m");
        System.out.println("A media de altura dos homens é de: " +mediaHomem+ " m");
        System.out.println("O numero de mulheres é: " +qmulheres);

        entrada.close();
    }
}
