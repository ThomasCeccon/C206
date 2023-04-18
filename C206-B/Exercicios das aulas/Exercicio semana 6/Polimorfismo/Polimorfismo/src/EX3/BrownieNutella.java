package EX3;

public class BrownieNutella extends Brownie {
    //metodo construtor
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public void adiconaNutella(){
        System.out.println("Adicionar mais nutella!");
    }

}
