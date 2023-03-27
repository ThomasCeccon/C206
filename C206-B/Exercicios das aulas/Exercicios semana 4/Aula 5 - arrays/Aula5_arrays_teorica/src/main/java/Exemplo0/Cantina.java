package Exemplo0;

public class Cantina {
    //atributos
    String nome;

    //associacao por agregacao de array
    Salgado[] salgado = new Salgado[3];

    //metoddos
    void addSalgado(Salgado novoSalgado) {

        for(int i=0;i< salgado.length;i++) {
            if (salgado[i] == null) {
                salgado[i]=novoSalgado;
                break;

            }
        }
    }

    void mostrarInfo() {
        System.out.println("Salgados adicionados");
        System.out.println("A cantina: " +nome + "possui os sequintes salgados: ");
        for(int i=0;i<salgado.length;i++) {
            if (salgado != null) {
                System.out.println(salgado[i].nome);

            }
        }

    }

}
