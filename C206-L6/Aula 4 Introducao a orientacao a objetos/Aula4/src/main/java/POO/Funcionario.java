package POO;

public class Funcionario {
    //declaracao das variaveis(atributos)(caracteristicas)
    int idade;//idade funcionario
    String nome;//nome do funcionario
    int cpf;//cpf do funcionario
    float salario;//salario do funcionario


   public void Funcionario(){
       System.out.println("criou um funcionario");
   }
   /*
    public Funcionario(int idade, String nome, int cpf, float salario) {
        System.out.println("criou um funcionario");
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    */

    //metodos (acoes)
    public void tirarFerias(String mes,int quantidade){

        System.out.println("O funcionario "+nome+ " tirou ferias no mes de "+mes+ " durante " +quantidade+ " dias");
    }

    public float salarioAnual(){

        float salaAnual=salario*12;
        return salaAnual;
    }

    public float salarioAnual(float decimoterceiro){

        float salaAnual=salario*12;
        return salaAnual+decimoterceiro;
    }
    public float salarioAnual(float decimoterceiro,float decimoquarto){

        float salaAnual=salario*12;
        return salaAnual+decimoterceiro+decimoquarto;
    }


}
