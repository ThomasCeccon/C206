package PV2;

public class Pikachu extends Pokemom implements AtaqueEspecial,FazerBarulho {

    //atributos
    private  float soltarRaios;
    private float paralisiaEletrica;

    //metodo construtor
    public Pikachu( String nome, String tipo,float paralisiaEletrica ,float soltarRaios) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    //get e set
    public float getSoltarRaios() {
        return soltarRaios;
    }

    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }

    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }

    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }

    //sobrescrita de metodos
    @Override
    public void atacar() {
        System.out.println(this.getNome()+" esta atacando");
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO PIKACHU");
        super.mostraInfo();
        System.out.println("soltar raios: "+this.getSoltarRaios());
        System.out.println("Paralisia eletrica: "+this.getParalisiaEletrica());
    }

    //metodos gerados pela interface
    @Override
    public void ataqueEspecial() {
   if(this.soltarRaios>750){
       System.out.println(this.getNome()+" conseguiu ganhar do seu oponente");
   }
   else{
       System.out.println(this.getNome()+ " perdeu a batalha");
   }
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome()+" esta fazendo barulho");
    }
}
