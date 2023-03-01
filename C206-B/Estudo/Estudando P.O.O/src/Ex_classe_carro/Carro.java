package Ex_classe_carro;

public class Carro {

    //variaveis
    String nome;
    String marca;
    int ano;
    float velocidade;

    //metodos
   public void Acelerar(int aceleracao){
        //o que vai fazer
        velocidade=velocidade+aceleracao;
    }

    public void Freiar(int reduzir) {
       velocidade=velocidade-reduzir;
    }

    public void Buzinar() {
        System.out.println("bibibi");
    }
}
