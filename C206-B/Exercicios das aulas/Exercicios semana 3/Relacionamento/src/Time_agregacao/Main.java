package Time_agregacao;

public class Main {
    public static void main(String[] args) {

        //instancia
        Time t1=new Time();
        Atleta a1=new Atleta();

        //definiar valores as classes
        t1.nome_do_time="Corinthians";
        t1.nome_do_tecnico="tite";

        a1.nome_do_atleta="Guerreiro";
        a1.posicao="meia";
        a1.idade=22;

        //Igualar os valoes
        t1.atleta=a1;


        //saida de dados
        System.out.println("nome do time: "+t1.nome_do_time);
        System.out.println("nome do tecnico: "+t1.nome_do_tecnico);
        //assim
        System.out.println("nome do atleta: "+t1.atleta.nome_do_atleta);
        //ou assim
       // System.out.println("nome do atleta: "+a1.nome_do_atleta);
        System.out.println("Posicao do atleta: "+t1.atleta.posicao);
        System.out.println("Idade do atleta: "+t1.atleta.idade);






    }
}
