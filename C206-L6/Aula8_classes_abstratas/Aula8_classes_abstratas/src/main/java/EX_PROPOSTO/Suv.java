package EX_PROPOSTO;

import java.sql.SQLOutput;

public class Suv extends Carro {

    //atributos
    private String tracao;

    //metodo construtor da classe mae
    public Suv(double valor, String cor, int ano,String tracao) {
        super(valor, cor, ano);
        this.tracao=tracao;
    }

    //get e set
    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public void mostrainfo() {
        System.out.println("INFORMACOES DO SUV");
        super.mostrainfo();
        System.out.println("Tracao: "+this.getTracao());
    }

}
