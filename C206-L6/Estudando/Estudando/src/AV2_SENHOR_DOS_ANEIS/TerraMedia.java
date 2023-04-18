package AV2_SENHOR_DOS_ANEIS;

import AV1_C206_L3.Heroi;

public class TerraMedia {

    //atributos
    Arma arma;//associacao por agregacao
    Habitante []habitantes= new Habitante[100];//associcao por composicoa

    //metodo construtor para composicoa

    //METODOS
    public void addHabitante(Habitante habitante){

        for(int i=0;i<habitantes.length;i++){
            if(habitantes[i]==null){
                habitantes[i]=habitante;
                System.out.println("Habitante adicionado");
                break;

            }

        }

    }

    public void listaHabitante(){

    }
}
