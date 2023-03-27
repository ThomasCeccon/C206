package Ex4_Zumbi;

public class Zumbi {

    //declaracao das variaveis
    double vida;
    String nome;

    //metodos
    double mostraVida() {
        System.out.println("A vida do zumbi eh " +vida);
        return 0;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {

        if(vida>=quantia){
            vida=vida-quantia;
            zumbiAlvo.vida+=quantia;
            return true;
        }
        else
            return false;
    }
}
