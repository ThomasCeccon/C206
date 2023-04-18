package Heranca;

public class Engenheiro extends Funcionario {

    //atributo
    float valor_mes;

    //metodo construtor
    public Engenheiro(String nome, int idade, String profissao,float valor_mes) {
        super(nome, idade, profissao);
        this.valor_mes=valor_mes;
    }

    //metodo
    public float recebe() {
        float quantia=valor_mes*12;
        return quantia;
    }
}
