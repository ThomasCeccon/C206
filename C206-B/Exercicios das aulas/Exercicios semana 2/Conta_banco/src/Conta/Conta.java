public class Conta {

    //declaracao das variaveis
    int numero;
    String nomeDono;
    float saldo;
    float limite;


    //metodos
    void Sacar(float dinheiro){
        float novo_saldo;
        novo_saldo=saldo-dinheiro;
        saldo=novo_saldo;
    }
    void Depositar(float dinheiro){
        saldo=saldo+dinheiro;
    }

    void verficar_saldo(){
        System.out.println("Mostrar saldo: "+saldo);
    }
}
