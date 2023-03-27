package Empresa_composicao;

public class Main {
    public static void main(String[] args) {

        //instanciar
        Empresa e1=new Empresa();
        Departamento d1=new Departamento();

       //definindo valores as classes
        e1.nome="Werk";
        e1.cnpj="nao temos ainda";
        e1.dep.nome_departamento="Financeiro";
        e1.dep.num_funcionarios=3;

        //igualar as associacoes para uma melhor saida
       // e1.dep=d1;     porque nao pode com composicao?

        //saida de dados
        System.out.println("nome da empresa: "+e1.nome);
        System.out.println("cnpj da empresa: "+e1.cnpj);
        System.out.println("nome do departamento: "+e1.dep.nome_departamento);
        System.out.println("numero de funcionarios: "+e1.dep.num_funcionarios);


    }
}
