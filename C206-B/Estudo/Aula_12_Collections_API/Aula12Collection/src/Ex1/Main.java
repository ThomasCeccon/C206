package Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //criando uma lista do tipo double
        ArrayList<Double> valores=new ArrayList<>();

        //add valores
        valores.add(1.2);
        valores.add(1.5);
        valores.add(1.7);
        valores.add(1.8);
        valores.add(1.9);

        //ordena-los de forma decrescente
        Collections.sort(valores,Collections.reverseOrder());

        //percorrendo e mostrando os valores em ordem decrescente
        for (int i=0;i< valores.size();i++){
            System.out.println(valores.get(i));
        }
    }
}
