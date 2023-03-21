public class Main {
    public static void main(String[] args) {

        //instancia da classe conta
        Conta c1=new Conta();

        //definir valores para as classes
        c1.nomeDono="Pedro";
        c1.saldo=1000;

        System.out.println("Nome: "+c1.nomeDono+ " e tem saldo de: "+c1.saldo);

        //chamar as funcoes e imprimir elas
        c1.Sacar(100);
        System.out.println("saldo de: "+c1.saldo);
        c1.Depositar(100);
        System.out.println("saldo de: "+c1.saldo);
        c1.verficar_saldo();

    }
}