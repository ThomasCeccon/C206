package POO;

public class Main {
    public static void main(String[] args) {
        //classe:caracteristicas e acoes

       // Funcionario f1 = new Funcionario(19,"Vitor",111111,500);//instancia f1
        Funcionario f1=new Funcionario();
        Funcionario f2=new Funcionario();


        //definindo valores as classes f1
        f1.salario = 500;
        f1.cpf = 111111111;
        f1.nome = "Victor";
        f1.idade = 21;

        //definindo valores as classes f2
        f2.salario = 400;
        f2.cpf = 234242;
        f2.nome = "yves";
        f2.idade = 20;

        f1=f2;//iqualando os ponteiros

        if(f1==f2){
            System.out.println("sao os mesmod objetos");
        }
        else {
            System.out.println("sao objetos diferentes");
        }


        System.out.println("o salario anual do vitor eh: ");
        System.out.println(f1.salarioAnual(300));
       // System.out.println(f1.salarioAnual(100,100));

        f1.tirarFerias("junho", 27);


    }
}