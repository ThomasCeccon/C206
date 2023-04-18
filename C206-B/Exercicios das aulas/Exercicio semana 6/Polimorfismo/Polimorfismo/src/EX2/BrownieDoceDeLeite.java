package EX2;

public class BrownieDoceDeLeite extends Brownie {
    //metodo construtor
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public void adicionaDoceDeLeite(){
        System.out.println("Adiconar mais doce de leite!");
    }

    //sobrescrita de metodo (que esta na classe mae)
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Doce de leite adicionado no carrinho de compras");
    }
}
