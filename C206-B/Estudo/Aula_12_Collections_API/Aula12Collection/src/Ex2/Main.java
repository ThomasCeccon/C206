package Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



        //criando listas de acrodo com cada objeto
        ArrayList<Humano> humanos=new ArrayList<>();

        //instanciar os objetos filhos
        Luiza luizas=new Luiza("Perez",25);
        Thomas thomas=new Thomas("Ceccon",20);
        Carla carla=new Carla("Silva",30);

        //add
        humanos.add(luizas);
        humanos.add(thomas);
        humanos.add(carla);

        //ordem decrescente
        Collections.sort(humanos,Collections.reverseOrder());

        //percorrendo
        for(int i=0;i< humanos.size();i++){
            System.out.println("Nome do meio: " + humanos.get(i).nomeM);
            System.out.println("Idade: " + humanos.get(i).idade);
        }







    }
}
