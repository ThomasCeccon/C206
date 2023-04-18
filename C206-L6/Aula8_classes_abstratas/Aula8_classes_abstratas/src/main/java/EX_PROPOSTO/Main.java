package EX_PROPOSTO;

public class Main {

    public static void main(String[] args) {

        //instanciar as classes filhas
        Suv suv=new Suv(20000,"Preta",2010,"boa");
        Sedan sedan=new Sedan(30000,"Branco",2012,1);
        Hatch hatch=new Hatch(40000,"Azul",2015,4);

        //mostrando info e taxa
          suv.mostrainfo();
          suv.taxa();
          sedan.mostrainfo();
          sedan.taxa();
          hatch.mostrainfo();
          hatch.taxa();

    }


}
