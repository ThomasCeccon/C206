package EX2;

public class BrownieCafe extends Brownie {
    //metodo construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public  void adicionaCafe(){
        System.out.println("Adicioanar mais cafe!");
    }

    //sobrescrita de metodo (que esta na classe mae)
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Cafe adicionado no carrinho de compras");
    }
}
