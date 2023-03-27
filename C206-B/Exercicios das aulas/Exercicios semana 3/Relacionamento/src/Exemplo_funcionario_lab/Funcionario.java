package Exemplo_funcionario_lab;

public class Funcionario {
    //atributos
    int idade;
    int cpf;
    double salario;
    String nome;

    //metodos
    public void tirarFerias(String mes){

        System.out.println("ferias só em " +mes+ " !");
    }
    public double calcularSalarioAnual(){
        double valor;
        valor=12*salario;
        return valor;
    }
}
