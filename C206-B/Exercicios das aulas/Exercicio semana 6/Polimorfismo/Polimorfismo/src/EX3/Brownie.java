package EX3;

public class Brownie {
    //atributos
    protected String nome;
    protected double preco;
    protected String sabor;

    //metodo construtor
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    //get
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }

    //metodos
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado ao carrinho de compras: "+this.nome);
    }

    public void calcularValorTotalCompra(){

        System.out.println("calculando valor total da compra "+this.preco);
    }

    public void mostraInfo(){
        System.out.println("Nome do brownie: "+nome);
        System.out.println("Preco do brownie: "+preco);
        System.out.println("Sabor do brownie: "+sabor);

    }
}
