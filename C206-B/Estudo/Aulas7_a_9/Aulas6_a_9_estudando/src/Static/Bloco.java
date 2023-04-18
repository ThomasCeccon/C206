package Static;

public class Bloco {

    private static int numblocos=0;

    //metodo construtor faz a contagem de cada Bloco criando na main
    public Bloco() {
        numblocos++;
    }

    //get(mostrar)
    public static int getNumblocos() {
        return numblocos;
    }
}
