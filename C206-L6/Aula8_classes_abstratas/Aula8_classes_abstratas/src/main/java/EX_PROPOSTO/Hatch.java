package EX_PROPOSTO;

public class Hatch extends Carro {
    //atributos
    private int portas;

    //metodo construtor da classe mae
    public Hatch(double valor, String cor, int ano,int portas) {
        super(valor, cor, ano);
        this.portas=portas;
    }

    //get e set
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void mostrainfo() {
        System.out.println("INFOMACOES DO Hatch");
        super.mostrainfo();
        System.out.println("Numero de portas: "+this.getPortas());
    }


}
