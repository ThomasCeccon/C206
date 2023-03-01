public class Zumbi {

    //declarao das variaveis
    String nome;
    double vida=50;
    boolean alimentado =true;

    //metodo
    public void Alimentar(double vida){
        if(alimentado){
            System.out.println("Ja estou alimentado");
        }
        else{
            System.out.println("Cheiro de sangue,vou comer");
            this.vida++;//incrementa da variavel criada pela clsse
            System.out.println("Acabei de alimentar estou com "+vida+ " de vida");
            System.out.println("Agora estou com : "+this.vida+ " pontos de vida");
            if(this.vida>=100){
                alimentado=true;
            }
        }

    }

    public void perdervida(double vida) {
        this.vida--;
        if (this.vida<100){
            alimentado=false;
        }
    }
}
