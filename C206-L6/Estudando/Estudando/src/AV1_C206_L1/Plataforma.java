package AV1_C206_L1;

public class Plataforma {

    //atributos
    String nome_plataforma;
    String criador;

    //associcao por agregacao de jogo
    Jogo jogos[] = new Jogo[10];

    //metodos
    void mostrainfo() {
        System.out.println("informacoes plataforma: ");
        System.out.println("nome da plataforma: " + this.nome_plataforma);
        System.out.println("nome do criador: " + this.criador);
        System.out.println("==============================");
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                jogos[i].mostraInfo();
            }
        }
    }

    void adicionarJogo(Jogo jogo) {

        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                System.out.println("Jogo adicionado!");
                break;
            }
        }
    }
    void mostraMaisCaroBarato() {
        double menor =+199999;
        double maior =-199999 ;

        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {

                if(jogos[i].preco >maior) {
                    maior=jogos[i].preco;
                    System.out.println("Jogo mais caro é:" + jogos[i].nome_jogo);
                    break;
                }
                else {
                    menor=jogos[i].preco;
                    System.out.println("Jogo mais barato é:" + jogos[i].nome_jogo);
                    break;
                }


            }
        }
    }

    void calculoDlc() {
        int contador=0;
        for(int i=0;i< jogos.length;i++){

            if(jogos[i]!=null){
                if(jogos[i].dlc==true){
                    contador++;
                }
            }
        }
        System.out.println("Jogos com dlc sao: "+ contador);
    }
}
