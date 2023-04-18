package Heranca;

public class Main {
    public static void main(String[] args) {
        //polimorfismo:podemos alterar ou acrescentar caracteristicas a classe
        //heranca: passa informacoes e caracteristicas para outra classe

        Funcionario[] funcionario = new Funcionario[5];

        Arquiteto a1 = new Arquiteto("Anna", 10, 500, "Predial");//instancia de arquiteto
        /*
        a1.setNome_funcionario("Anna");
        a1.setIdade_funcionario(19);
        a1.setSalario_funcioonario(500);
        a1.setEspecialidade("Predial");
        a1.mostraInfo();
        a1.executaAcao();
        System.out.println( a1.salarioBonus());
         */

        Engenheiro e1 = new Engenheiro("Victor", 29, 1000, "computacao");//instancia de engenheiro
        /*
        e1.setNome_funcionario("victor");
        e1.setIdade_funcionario(20);
        e1.setSalario_funcioonario(700);
        e1.setRamo("computacao");
        e1.mostraInfo();
        a1.executaAcao();
         */

        Professor p1 = new Professor("Crhis", 29, 3000, "POO");//instancia de professor
        /*
        p1.setNome_funcionario("chris");
        p1.setIdade_funcionario(29);
        p1.setSalario_funcioonario(3000);
        p1.setMateria("POO");
        p1.mostraInfo();
        p1.corrigirProvas();
        p1.executaAcao();
         */

        funcionario[0] = a1;
        funcionario[1] = e1;
        funcionario[2] = p1;

        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i] != null) {
                if (funcionario[i] instanceof Engenheiro) { //verifica se a posicao é instancia de engenheiro
                    Engenheiro e = (Engenheiro) funcionario[i];//catch mudando de funcionario pra engenheiro
                    e.mostraInfo();
                } else if (funcionario[i] instanceof Professor) {
                    Professor p = (Professor) funcionario[i];
                    p.mostraInfo();
                } else if (funcionario[i] instanceof Arquiteto) {
                    Arquiteto a = (Arquiteto) funcionario[i];
                    a.mostraInfo();
                }
            }

        }
    }
}