package Exercitando;

public class Main {
    public static void main(String[] args) {

        //array de funcionarios (classe mae)
        Funcionario[] f1=new Funcionario[5];

        //instanciar a classe filha
        Engenheiro e1=new Engenheiro("Thomas",19,1000,"Comp");
        Arquiteto a1=new Arquiteto("Clara",22,2000,"predio");

        //guardar objetos das classes filhas
        f1[0]=e1;
        f1[1]=a1;

        for(int i=0;i<f1.length;i++){
            if(f1[i]!=null){
                //verifica a instancia de Engenheiro (podendo acessar seus atributos e metodo)
               if(f1[i] instanceof Engenheiro){
                   Engenheiro e =(Engenheiro) f1[i];//passando dados de engenheiro para funcionario
                   e.mostraInfo();
                   e.executaAcao();
               }
               else {
                   Arquiteto a =(Arquiteto) f1[i];//passando dados de arquiteto para funcionario
                   a.mostraInfo();
                   a.executaAcao();
               }
            }
        }
        /*
        //saida de dados
        e1.setNome("Thomas");
        e1.setIdade(19);
        e1.setSalario(1000);
        e1.ramo="Comp";
         */
    }
}
