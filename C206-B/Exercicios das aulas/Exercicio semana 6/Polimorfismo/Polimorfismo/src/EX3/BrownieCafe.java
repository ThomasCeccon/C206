package EX3;

public class BrownieCafe extends Brownie {
    //metodo construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public  void adicionaCafe(){
        System.out.println("Adicioanar mais cafe!");
    }
}
