package Heranca;

public class Main {
    public static void main(String[] args) {

        //instanciar a classe mae
        Engenheiro engenheiro=new Engenheiro("Thomas",19,"Engenheiro",2000);

        System.out.println("Nome: "+engenheiro.nome);
        System.out.println("Idade: "+engenheiro.idade);
        System.out.println("Profissao: "+engenheiro.profissao);
        System.out.println("Ganho anual: "+engenheiro.recebe());


    }
}
