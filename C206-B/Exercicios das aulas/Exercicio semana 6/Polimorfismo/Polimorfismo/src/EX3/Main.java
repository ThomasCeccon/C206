package EX3;

public class Main {
    public static void main(String[] args) {

        //instanciar
        BrownieCafe bc=new BrownieCafe("cafezinho",20,"Cafezao");
        BrownieNutella bn=new BrownieNutella("nutella",30,"nutellao");
        BrownieDoceDeLeite bdl=new BrownieDoceDeLeite("Doce de leite",10,"Doce de leite");
        Comprador c=new Comprador("Thales",40);

        //mostrar informacoes do comprador
        System.out.println("Nome: "+c.getNome());
        System.out.println("Saldo: "+c.getSaldo());

        //comprador comprou nutela
        c.efetuarCompra(bn);

        //mostrando informacoes do produto
        bn.addCarrinhoDeCompras();
        bn.mostraInfo();
        System.out.println("===========");
        bc.addCarrinhoDeCompras();
        bc.mostraInfo();
        System.out.println("===========");
        bdl.addCarrinhoDeCompras();
        bdl.mostraInfo();

        //invocando o metodo

    }
}