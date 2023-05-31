package Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /*
       *

        */

        ArrayList<Double> listaDouble=new ArrayList<>();

       for(int i=0;i<=5;i++){
           listaDouble.add(new Random().nextDouble()*100);

       }

        System.out.println("Antes da ordenacao");
       for(Double doubles_nao_ordenado : listaDouble){
           System.out.println(doubles_nao_ordenado);
       }

       //ordem descrescente
        Collections.sort(listaDouble,Collections.reverseOrder());


        System.out.println("Depois da ordenacao");
        for(Double doubles_ordenado : listaDouble){
            System.out.println(doubles_ordenado);
        }
    }
}