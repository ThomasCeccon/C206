package EX1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        //declarando a lista do tipo double
        ArrayList<Double> listdouble=new ArrayList<>();
        Random gera=new Random();

        //mostrando 5 valores aleatorios
        for(int i=0;i<5;i++){
            listdouble.add(gera.nextDouble(10));
        }

        //ordenar de forma decrescente
        Collections.sort(listdouble,Collections.reverseOrder());

        for(int i=0;i<5;i++){
            System.out.println(listdouble.get(i));
        }

    }
}