package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        *ArrayList:Pode ser heterogenio e pode ser ordenado
         *HashSet: Garante que nao havera duplicidade e nao realiza ordenacao
         * HashMap: melhor desempenho quandp realiza a procura
         *
         */
        //declarao das variaves
        int aux = 100000;
        long TI;//tempo inicial
        long TF;//tempo final
        long TT;//tempo total

        //tempo de processamento de cada array
        ArrayList<Integer> listArray = new ArrayList<>(aux);
        Set<Integer> listSet = new HashSet<>(aux);
        Map<Integer, Integer> listamap = new HashMap<>(aux);

        System.out.println("Inserindo");

        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listArray.add(i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo total usando ArrayList: " + TT + " ms");

        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listSet.add(i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo total usando HashSet: " + TT + " ms");

        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listamap.put(i, i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo total usando HashMap: " + TT + " ms");

        System.out.println("Buscando");


        //buscando array list
        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listArray.contains(i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo para busca usando ArryaList: " + TT + " ms");

        //buscando COM HASHSET
        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listSet.contains(i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo para busca usando HashSet: " + TT + " ms");

        //buscando com HashMap
        TI = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listamap.containsKey(i);
        }
        TF = System.currentTimeMillis();

        //TEMPO TOTAL COM ARRAY LIST
        TT = TF - TI;

        System.out.println("Tempo para busca usando HashMap: " + TT + " ms");

    }

}
