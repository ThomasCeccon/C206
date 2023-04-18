package br.inatel.cdg.bloco;

public class Bloco {
    //atributos
   private static int numBlocos=0;

    //quando nao tem modificador: como public mais dentro do pacote(nao falou nada entao private)

    //construtor
    public Bloco() {
        numBlocos++;
    }

    //get e set
    public static int getNumBlocos() {
        return numBlocos;
    }

    /* cinza significa que nao vai ser utilizado
    public static void setNumBlocos(int numBlocos) {
        Bloco.numBlocos = numBlocos;
    }
     */

    public void destruir(){
        System.out.println("Bloco sendo destruido");
        numBlocos--;
    }


}
