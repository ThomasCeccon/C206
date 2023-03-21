public class Personagem {
    //atributos
    String nome;
    int pontos;//vida

    //agragacao
    Arma arma;


    //metodos
    void usarArma(){
    arma.resistencia= arma.resistencia-2;
    }
    void tomarDano(){
    pontos=pontos-5;
    }
}
