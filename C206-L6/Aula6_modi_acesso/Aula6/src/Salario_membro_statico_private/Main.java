package Salario_membro_statico_private;

public class Main {
    public static void main(String[] args) {
        //instanciar o objeto funcionario
        Funcionario f1=new Funcionario("Ana",100);
        Funcionario f2=new Funcionario("Gabriel",1000);

        f1.mostraInfo();
        f2.mostraInfo();

        f1.getSalario();
        f2.getSalario();

        //set-> mudar   get-> mostrar

        //mostrar salario
        f1.setSalario(150);//mudar
        System.out.println("A Ana ganha "+f1.getSalario());
        System.out.println("O Gabriel ganha " +f2.getSalario());

        //Funcionario.cont=100;
        // Funcionario.getCont(); //acessando a variavel private


        //System.out.println("temos " +Funcionario.cont+ " funcionario na empresa");
        //acessando a variavel cont que esta private
        System.out.println("Temos " +Funcionario.getCont()+ " funcionario na empresa");//mostrar
        Funcionario.setCont(3);//mudar
        System.out.println("Temos " +Funcionario.getCont()+ " funcionario na empresa");
    }
}
