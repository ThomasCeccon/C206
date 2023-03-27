public class Main {
    public static void main(String[] args) {

      //instancia
        Conta c1=new Conta();
        Conta c2=new Conta();

        c1.nome="jaum";
        c1.numero=1234;
        c2.nome="jaum";
        c2.numero=1234;

       //recebnedo os valores do endereco do ponteiro
        c1=c2;

        if(c1==c2){
            System.out.println("sao iguais");
        }
        else{
            System.out.println("Nao sao iguais");
        }

    }
}