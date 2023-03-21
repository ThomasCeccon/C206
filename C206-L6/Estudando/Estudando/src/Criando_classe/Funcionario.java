package Criando_classe;

public class Funcionario {

    //atributos(caracteristicas)
    String nome;
    int cpf;
    int idade;
    float salario;

    //metodo construtor
    /*
    *b_direiro->generate->construtor->seleciona tudo->ok
    *pode ter o mesmo nome da classe,o que diferencia sao a qunatidade de parametros
    *
     */
/*
    public Funcionario() {
        System.out.println("Novo funcioanario registrado");
    }
    public Funcionario(String nome, int cpf, int idade, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

 */

    //metodos(açoes)
    public void  tirarFerias(String mes,int quantDias) {
        System.out.println("o funconario "+nome+ " vai sair de ferias em " +mes+ " por "+quantDias+ " dias");

    }
    public float calcularSalarioAnual() {
        float salarioAnual;
        salarioAnual = salario * 12;//salario pois vai ser o valor que vou definir ou entrar depois que instanciar
        return salarioAnual;
    }
    //mesmo metodo porem apresentando um parametro
    public float calcularSalarioAnual(float decimoTerceio) {
        float salarioAnual;
        salarioAnual = (salario*12)+decimoTerceio;//salario pois vai ser o valor que vou definir ou entrar depois que instanciar
        return salarioAnual;
    }

    public void mostraInfo(){
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("cpf: "+cpf);

    }

}
