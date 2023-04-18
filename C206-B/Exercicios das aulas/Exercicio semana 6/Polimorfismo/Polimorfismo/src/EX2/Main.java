package EX2;

public class Main {
    public static void main(String[] args) {

        //instanciar
        BrownieCafe bc=new BrownieCafe("cafezinho",20,"Cafezao");
        BrownieNutella bn=new BrownieNutella("nutelinha",30,"nutellao");
        BrownieDoceDeLeite bdl=new BrownieDoceDeLeite("Doce de leite",10,"bom d+");

        //mostrando informacoes
        bn.addCarrinhoDeCompras();
        System.out.println("===========");
        bc.addCarrinhoDeCompras();
        System.out.println("===========");
        bdl.addCarrinhoDeCompras();


    }
}