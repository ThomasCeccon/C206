package br.inatel.cdg;


public class Main {
    public static void main(String[] args) {
        //instancia de pacoetes
        br.inatel.cdg.jogador.Nave nave1 = new br.inatel.cdg.jogador.Nave("boi", 100, "Fogo");
        br.inatel.cdg.inimigo.Asteroide a1 = new br.inatel.cdg.inimigo.Asteroide("thaigo_cana_braba","pedra do ceu");


        //saida de dados
        System.out.println("Nome da nave: "+nave1.getNome());
        System.out.println("Vida da nave: "+nave1.getVida());
        System.out.println("Tipo do tiro: "+nave1.getTipoTiro());

        System.out.println("Nome do asteroide: "+a1.getNome());
        System.out.println("Tipo de asteroide: "+a1.getTipoAsteroide());

        //atirou
        nave1.atirar(a1);

        //morreu
        a1.destruir();
    }
}
