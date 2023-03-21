package AV1_C206_L5;

public class Deck {
    //atributos
    String dono;

    //associacao por agregacao de array
    Carta[] carta = new Carta[10];//array com 10 posicoes

    //metodos
    void adicionarCarta(Carta carta1) {
        for (int i = 0; i < carta.length; i++) {
            if (carta[i] == null) {
                carta[i] = carta1;
                System.out.println("Carta adicionada!");
                break;
            }
        }

    }

    void mostraInfo() {
        System.out.println("Dono do deck é: " + this.dono);
        for (int i = 0; i < carta.length; i++) {
            if (carta[i] != null) {
                System.out.println("Nome da carta: " + this.carta[i].nome);
                System.out.println("Poder da carta: " + this.carta[i].poder);
                System.out.println("Classificacao da carta: " + this.carta[i].classificacao);
            }
        }
    }

    void CalculaPoderMedio() {
        float poder_total = 0;
        float media = 0;
        int quant = 0;

        for (int i = 0; i < carta.length; i++) {
            quant++;
            if (carta[i] != null) {
                poder_total += carta[i].poder;
                media = poder_total / quant;
            }

        }
        System.out.println("Poder total do deck é de: " + poder_total);
        System.out.println("Media aritmetica do deck é de: " + media);
    }

    void calculaClassificacao() {
        int cont_soldados = 0;
        int cont_arqueiros = 0;
        int cont_pesados = 0;

        for (int i = 0; i < carta.length; i++) {
            if (carta[i] != null) {
                if (carta[i].classificacao.equals("soldado")) {
                    cont_soldados++;
                }
                else if (carta[i].classificacao.equals("arqueiro")) {
                    cont_arqueiros++;

                } else {
                    cont_pesados++;

                }
            }
        }
        System.out.println("Quantidade de Soldados: " + cont_soldados);
        System.out.println("Quantidade de arqueiros: " + cont_arqueiros);
        System.out.println("Quantidade de pesados: " + cont_pesados);

    }
}
