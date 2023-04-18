package AV2_C206_L3;

public class Jogador extends Pessoa implements Recuperar,Loja {

    //atributos
    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;

    //associacao por agregacao
     Skin skin;//agregacao
     Mochila mochila;

     //metodo construtor
    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo, String nome_skin,String rairidade_skin, String raridade_mochila) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
        this.skin = new Skin(nome_skin,rairidade_skin);
        this.mochila=new Mochila(raridade_mochila);
    }

    //sobrescrita de metodos

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Nivel: "+this.nivel);
        System.out.println("Passe batalha: "+this.passeBatalha);
        System.out.println("Vida: "+this.vida);
        System.out.println("Escudo: "+this.escudo);
        System.out.println("Raridade da Mochila: "+this.mochila.getRaridade());

        if(this.skin.getNome()==null){
            System.out.println("O jogador nao tem Skin");
        }
        else {
            this.skin.mostraInfo();
        }

    }

    //implementado pela interface recuperar e loja
    @Override
    public void gastarVbucks() {

    }

    @Override
    public void comprarVbucks() {

    }

    @Override
    public void RecuperarVida() {
        if(this.vida<100){
            this.vida=this.vida+15;
        }
        else{
            this.vida=100;
        }

        System.out.println("A nova vida do jogador é : "+this.vida);
    }

    @Override
    public void RecuperarEscudo() {

    }

    @Override
    public void fazmissao() {
        System.out.println(getNome()+" completou uma missao");
        int novo_nivel=this.nivel+1;
        System.out.println("Novo nivel é de: "+novo_nivel);
    }

    //get e set
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isPasseBatalha() {
        return passeBatalha;
    }

    public void setPasseBatalha(boolean passeBatalha) {
        this.passeBatalha = passeBatalha;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
