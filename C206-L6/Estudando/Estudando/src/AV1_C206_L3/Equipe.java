package AV1_C206_L3;

public class Equipe {

    //atributos
    String capitao;
    Heroi[] herois = new Heroi[10];//10 posicoes

    //metodos
    void adicionarHeroi(Heroi heroi) {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null) {
                herois[i] = heroi;
                System.out.println("Heroi adicionado");
                break;
            }
        }

    }

    void mostrarInfo() {
        System.out.println("Capitao da equipe: " + this.capitao);
        for (int i = 0; i < herois.length; i++) {

            if (herois[i] != null) {
                System.out.println("Nome do Heroi: " + herois[i].nome);
                System.out.println("Poder do heroi: " + herois[i].poder);
                System.out.println("pode voar: " + herois[i].podeVoar);
                //se tivesse mostrainfo em heroi seria herois[i].mostrainfo(sout..sout...sout...);
            }
        }
    }

    void mostrarMaisForte() {
        float mais_forte=0;
       // mais_forte=herois[0].poder;
        String nome_mais_forte="";

        for (int i = 0; i < herois.length; i++) {
            if (herois[i] != null) {
                if (herois[i].poder > mais_forte) {
                    mais_forte = herois[i].poder;
                    nome_mais_forte=herois[i].nome;
                }
            }
        }
        System.out.println("heroi mais forte é: " +nome_mais_forte+ " com forca de " + mais_forte);
    }


    void calcularVoadores() {
        boolean voadores = true;
        float calculo_voar = 0;
        float quant_voadores = 0;

        for (int i = 0; i < herois.length; i++) {
            if (herois[i] != null) {

                if (herois[i].podeVoar == voadores) {
                    quant_voadores++;
                    calculo_voar = quant_voadores / 100;
                }
            }
        }
        System.out.println("poder voar: " + calculo_voar + " %");
    }
}
