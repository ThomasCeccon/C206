package AV2_C206_L3;

public class Main {
    public static void main(String[] args) {

        //declaraco das variaveis
        int quantidade=0;

        Pessoa[] pessoa=new Pessoa[5];//array pessoa com 5 posicoes

        //instancia de jogador e bot
        Jogador j1=new Jogador("Thals",12,true,50,70,"Abelha","muito rara","muito tambem");
        Bot b1=new Bot("A12",true);

        //referencia
        pessoa[0]=j1;
        pessoa[1]=b1;

        //preencher os atributos
        for (int i=0;i<pessoa.length;i++){
            if(pessoa[i]!=null){
                if(pessoa[i]instanceof Jogador){
                    Jogador jogador=(Jogador) pessoa[i];//passando informacoes de JOGADOR para PESSOA
                    //MOSTRAR INFORMACOES DE JOGADOR
                    jogador.mostraInfo();
                    jogador.skin.mostraInfo();
                    jogador.fazmissao();
                    jogador.getNivel();
                    jogador.RecuperarVida();
                    System.out.println("=======================");
                    quantidade++;
                }
                else if(pessoa[i] instanceof Bot) {
                    Bot bot = (Bot) pessoa[i];//passando informacoes de BOT para PESSOA
                    //MOSTRAR INFORMACOES DE BOT
                    bot.mostraInfo();
                    bot.fazmissao();


                    System.out.println("=======================");
                    quantidade++;
                }
            }
        }
        System.out.println("foram criado um total de: "+quantidade);
    }
}
