package Membro_statico;

public class Main {
    public static void main(String[] args) {

        //instancia dos funcionarios
        Funcionario f1=new Funcionario("Carla");
        Funcionario f2=new Funcionario("Theu");

        //nao pode deixar publico,pois nao podemos alterar essa opcao
       // Funcionario.cont=4000;

        System.out.println("ID " + f1.id + " Nome:"+f1.nome);
        System.out.println("ID " + f2.id + " Nome:"+f2.nome);
        System.out.println("Quantidade de funcionarios: " +Funcionario.getCont());
       // System.out.println(Funcionario.cont);
    }
}