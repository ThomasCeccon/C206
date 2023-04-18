package EX1;

public class Main {
    public static void main(String[] args) {

        //instanciar
        BrownieCafe bc=new BrownieCafe("cafezinho",20,"Cafezao");
        BrownieNutella bn=new BrownieNutella("nutelinha",30,"nutellao");
        BrownieDoceDeLeite bdl=new BrownieDoceDeLeite("Doce de leite",10,"bom d+");

        //mostrando informacoes
        bn.addCarrinhoDeCompras();
        bn.mostraInfo();
        System.out.println("===========");
        bc.addCarrinhoDeCompras();
        bc.mostraInfo();
        System.out.println("===========");
        bdl.addCarrinhoDeCompras();
        bdl.mostraInfo();

    }
}