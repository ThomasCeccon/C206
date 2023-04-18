package EX3;

public class Comprador {

    //atributos
    private String nome;
    private double saldo;

    //metodo construtor
    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    //get
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    //metodo
    public void efetuarCompra(Brownie brownie){
        System.out.println(this.nome+" Comprou brownie de: "+brownie.nome);
    }
}
