package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;


public class Jogador {

    //atributos
    private int ponto=0;//nao static pois caso tivesse + de 1 jogador a pontuacao seria a mesma

    //get e set
    public int getPonto() {
        return ponto;
    }
/*
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
*/
    //metodos
    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto++;
    }
}
