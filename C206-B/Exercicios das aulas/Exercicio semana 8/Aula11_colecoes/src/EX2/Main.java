package EX2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        //Arraylist do objeto carro
        List<Carro> carros=new ArrayList<>();

        //instanciar as classes filhas
        Escapamento e1=new Escapamento("Armtrix",500);
        Motor motor=new Motor("2JZ",50);
        Volante volante=new Volante("Sparco",1700);

        carros.add(e1);
        carros.add(motor);
        carros.add(volante);

        //ordene em ordem decrescente
        Collections.sort(carros,Collections.reverseOrder());


        for (int i=0;i< carros.size();i++){
            System.out.println(carros.get(i).nome);
            System.out.println(carros.get(i).preco);
        }



    }
}
