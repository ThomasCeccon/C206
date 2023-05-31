import Execption.Execptiion.SaldoInsuficientException;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Conta{
        //declaracao das variaveis
        float saldo;
        float limite;

    //HashSet para armazenar informacoes do cliente
    Set<Cliente> LlistaCliente =new HashSet<>();

    Cliente clientes;

    //metodo construtor
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    //addcliente
    public void addcliente(Cliente cliente){

        LlistaCliente.add(cliente);
    }

    //metodos
        void Sacar(float quantia) throws SaldoInsuficientException {
        if(quantia<=saldo){
            saldo-=quantia;
            System.out.println("permitido");
        }
        else {
            throw new SaldoInsuficientException("Saldo ultrapassou");
        }

        }
        void Depositar(float dinheiro){
            saldo=saldo+dinheiro;
        }

        void verficar_saldo(){
            System.out.println("Mostrar saldo: "+saldo);
        }

        //mostrar informacoes do cliente
        public void mostraInfo(){
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Limite: "+this.limite);

            for(int i=0;i<LlistaCliente.size();i++){
                try {
                    System.out.println("Nome do cliente: "+clientes.nome);
                }catch (NullPointerException e){
                    System.out.println("Erro: "+e);
                }

            }



        }
}
