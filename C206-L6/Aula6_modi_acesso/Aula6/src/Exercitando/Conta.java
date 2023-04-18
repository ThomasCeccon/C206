package Exercitando;

public class Conta {
    //atributos
     String tipo_conta;
     private float saldo;
     float limite;
    Cliente []clientes=new Cliente[100];


    //get e set de saldo
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //adicionar conta
    void addconta(Cliente cliente){

        for(int i=0;i< clientes.length;i++){
            if(clientes[i]==null){
                clientes[i]=cliente;
                System.out.println("Conta adicionada ao banco!");
                break;
            }
        }

    }
    void mostrarInfo(){
       for(int i=0;i< clientes.length;i++){
           System.out.println(clientes[i].conta.tipo_conta);
           System.out.println(clientes[i].conta.getSaldo());
           System.out.println(clientes[i].conta.limite);
           if(clientes[i]!=null){
            clientes[i].mostrainfo();
           }
       }
    }
}
