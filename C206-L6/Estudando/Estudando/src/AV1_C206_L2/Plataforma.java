package AV1_C206_L2;

public class Plataforma {

    //atributos
    String nome;

    //associacao de array por agregacao
    Serie[] series = new Serie[10];//array de serie com 10 posicoes

    //metodos
    void mostraInfo() {
        System.out.println("Nome da plataforma: " + this.nome);
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                series[i].mostraInfo();
            }
        }

    }
    void addSerie(Serie serie) {
        for (int i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = serie;
                System.out.println("serie adicionada!");
                break;
            }
        }
    }
    String serieMaisLongaFinalizada() {
        int mais_longa = 0;
        int qual_serie = 0;
        boolean fim = true;
        String nome_serie="";

        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                  if(this.series[i].temporada> mais_longa && this.series[i].finalizada==fim){
                      mais_longa = this.series[i].temporada;
                      qual_serie= i;

                }
            }
        }
        return this.series[qual_serie].nome;
    }

    void mediaPorcentagem() {
        double soma = 0.0;
        int quant = 0;
        double media = 0.0;

        for (int i = 0; i < this.series.length; ++i) {
            if (this.series[i].temporada >= 3) {
                soma += this.series[i].nota;
                ++quant;
            }
        }

        media = soma / (double) quant;
        System.out.println("Media das Porcentagens " + media);
    }
}
