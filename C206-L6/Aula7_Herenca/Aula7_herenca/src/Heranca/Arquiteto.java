package Heranca;

//arquiteto recebe informacoes de funcionario
public class Arquiteto extends Funcionario {
    //atributos
    private String especialidade;

    //metodo construtor com mesmos parametros de funcionarios
    public Arquiteto(String nome_funcionario, int idade_funcionario, double salario_funcioonario, String especialidade) {
        super(nome_funcionario, idade_funcionario, salario_funcioonario);
        this.especialidade = especialidade;
    }

    //GET E SET
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //mo - sobrescerver o metodo mostra info de funcionario
    @Override
    void mostraInfo() {
        System.out.println("NFORMAÇOES DO ARQUITETO");
        super.mostraInfo();//MOSTRA INFO DA CLASSE QUE ELE HERDA
        System.out.println("Especialidade do arquiteto: " + this.especialidade);
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("o arquitwto esta planejando o predio");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;

    }
}
