package Time_Atleta;

public class Main {
    public static void main(String[] args) {
        //instanciar
        Time t1=new Time();
        Atleta a1=new Atleta();

        //igualar as informacoes
        t1.atleta=a1;

        //colocar valores a inatancia t1
        t1.nome="Corinthians";
        t1.nomeDoTecnico="tite";

        //aproveitar a associacao t1 com a1
        t1.atleta.nome="Liedson";
        t1.atleta.idade=28;
        t1.atleta.posicao="Atacante";

        //saida de dados
        System.out.println("nome do atleta: " +t1.nome);
        System.out.println("nome do tecnico: "+t1.nomeDoTecnico);
        System.out.println("nome do atleta: "+t1.atleta.nome);
        System.out.println("idade do atleta: "+t1.atleta.idade);
        System.out.println("posicao do atleta: "+t1.atleta.posicao);





    }
}