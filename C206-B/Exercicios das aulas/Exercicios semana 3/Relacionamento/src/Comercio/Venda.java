package Comercio;

public class Venda {
    //atributos


    //agragacao
    Produto p;
    Vendedor v;
    Comprador c;

    //metodos
    public void concretizaVenda(){
        System.out.println("Venda efetuada");
        c.venda -=p.preco;
        v.comissao=v.comissao+ p.preco*0.1f;
        p.vendedor();
    }

    public void cancelaVenda(){
        System.out.println("venda cancelada");

    }
}
