package Interface;

public class Main {
    public static void main(String[] args) {
        /*
        Classe abstrata
        *UML em italico declarar como abstract
        *toda classe abstrata é uma superclasse(mae)
        *Claseabstrata: Deve ser usada como referencia para permiter polimorfismo
        * Nao pode ser instanciada
        *
        * Metodo abstrato: Sem implementacao super classe: public abstratic void teste(); / classe filha: depois sobrescrever o metodo

        Interface
        * só metodos
        * Uma interface: abstrai apanas comportamnetos
        *
        *
         */

        //instanciar a classe
        Lontra lontra=new Lontra("Josefina",40);
        Cachorro cachorro=new Cachorro("Nina",50);
        Boi boi=new Boi("Soberano",60);

        System.out.println("Dados da Lontra");
        lontra.mostraInfo();
        lontra.emitirSon();
        System.out.println("+===================");
        System.out.println("Dados do cachorro");
        cachorro.mostraInfo();
        cachorro.emitirSon();
        System.out.println("+===================");
        System.out.println("Dados do Boi");
        boi.mostraInfo();
        boi.emitirSon();
        System.out.println("+===================");






    }
}