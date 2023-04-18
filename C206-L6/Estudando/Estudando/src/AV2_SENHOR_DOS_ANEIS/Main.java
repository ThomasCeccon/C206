package AV2_SENHOR_DOS_ANEIS;

public class Main {
    public static void main(String[] args) {

       Habitante []habitante=new Habitante[5]; //vetor de habitante com 5 posicoes
       TerraMedia tm=new TerraMedia();

       //instanciar as classes filhas
       Anao a1=new Anao(1,"Theu",20,60,1,"Golai");
       Elfo e1=new Elfo(2,"Pedro",18,40,"wacard");
       Mago m1=new Mago(3,"luc",22,70,"Branco");

       //referencia
        habitante[0]=a1;
        habitante[1]=e1;
        habitante[2]=m1;

        System.out.println(Habitante.contador);

        //percorrer
        for(int i=0;i<habitante.length;i++){
            if(habitante[i]!=null){
                if(habitante[i] instanceof Anao){
                    Anao anao=(Anao) habitante[i];
                    tm.addHabitante(anao);
                }
                else if(habitante[i] instanceof Elfo){
                    Elfo elfo=(Elfo) habitante[i];
                    tm.addHabitante(elfo);

                }
                else{
                    Mago mago=(Mago) habitante[i];
                    tm.addHabitante(mago);
                }
            }
        }



    }
}
