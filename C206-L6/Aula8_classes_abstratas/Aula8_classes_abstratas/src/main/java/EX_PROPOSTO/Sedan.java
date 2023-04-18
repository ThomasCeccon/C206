package EX_PROPOSTO;

public class Sedan extends Carro {
    //atributos
   private int portaMalas;

   //metodo construtor da classe mae
    public Sedan(double valor, String cor, int ano,int portaMalas) {
        super(valor, cor, ano);
        this.portaMalas=portaMalas;
    }

    //get e set
    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    @Override
    public void mostrainfo() {
        System.out.println("INFOMACOES DO Sedan");
        super.mostrainfo();
        System.out.println("Porta malas: "+this.getPortaMalas());
    }


}
