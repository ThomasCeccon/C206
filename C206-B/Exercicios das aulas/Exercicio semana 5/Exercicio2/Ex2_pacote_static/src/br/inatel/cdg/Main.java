package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.conversor.Conversor;
import br.inatel.cdg.jogador.Jogador;

public class Main {
    public static void main(String[] args) {

        //instancia
        Bloco bloco1=new Bloco();//numblocos 1 pois é static
        Bloco bloco2=new Bloco();//numblocos 2
        Bloco bloco3=new Bloco();//numblocos 3
        Bloco bloco4=new Bloco();//numblocos 4
        Bloco bloco5=new Bloco();//numblocos 5

        System.out.println("Blocos em jogo: "+Bloco.getNumBlocos());

        Jogador jogador1=new Jogador();
        System.out.println("Blocos em jogo: "+Bloco.getNumBlocos());
        System.out.println("Pontos do jogadro: "+jogador1.getPonto());//nao é instancia
        jogador1.destruirBloco(bloco1);

        System.out.println("Blocos em jogo: "+Bloco.getNumBlocos());
        System.out.println("Pontos do jogadro: "+jogador1.getPonto());//nao é instancia
        jogador1.destruirBloco(bloco4);

        Conversor.converter(jogador1.getPonto());

    }
}
