package br.inatel.cdg;

import br.inatel.cdg.brownie.Brownie;
import br.inatel.cdg.brownie.BrownieCafe;
import br.inatel.cdg.brownie.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        br.inatel.cdg.brownie.BrownieNutella bn=new br.inatel.cdg.brownie.BrownieNutella("Paulo",200,"Nutella");
        br.inatel.cdg.brownie.BrownieCafe bc=new  br.inatel.cdg.brownie.BrownieCafe("Carla",300,"Cafe");

        bc.addmaiscafe();
    }
}
