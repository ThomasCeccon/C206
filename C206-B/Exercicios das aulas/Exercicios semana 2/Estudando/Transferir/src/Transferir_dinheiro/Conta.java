package Transferir_dinheiro;

public class Conta {

    //variaveis
    String nome;
    float saldo,limite;
    int numero_conta;

    //metodos
    void transferir(Conta contaDestino,float quantia){
        saldo=saldo-quantia;//conta que vai passar a quantia
        contaDestino.saldo=contaDestino.saldo+quantia;//conta que vai receber a quantia
    }
}
