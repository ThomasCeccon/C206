package Exemplo_funcionario_lab;

public class Main {
    public static void main(String[] args) {

        //instanciar
        Funcionario f1=new Funcionario();

        //definir valores ao funcionario f1 (entrada de dados)
        f1.nome="Joao";
        f1.idade=19;
        f1.cpf=1010110;
        f1.salario=600;

        //saida de dados
        System.out.println("Nome "+f1.nome);
        System.out.println("Idade "+f1.idade);
        System.out.println("CPF "+f1.cpf);

        //chamar a funcao calcular
        f1.calcularSalarioAnual();
        System.out.println("voce vai receber! "+f1.calcularSalarioAnual()+ " reais");

        //chamar a funcao ferias e definir valores
        f1.tirarFerias("Maio");



    }
}
