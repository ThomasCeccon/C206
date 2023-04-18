package org.example;

public class Professor extends Funcionario {
    //atributos
    private String materia;

    //metodo construtor
    public Professor(String nome_funcionario, int idade_funcionario, double salario_funcioonario, String materia) {
        super(nome_funcionario, idade_funcionario, salario_funcioonario);
        this.materia = materia;
    }

    //get e set
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
   public  void mostraInfo() {
        System.out.println("INFORMACOES DO PROFESSOR");
       // super.mostraInfo();
        System.out.println("Nome do professor: "+getNome_funcionario());
        System.out.println("idade do professor: "+getIdade_funcionario());
        System.out.println("salario do professor: "+getSalario_funcioonario());
        System.out.println("Materia do professor: " + this.materia);
    }

    @Override
    public void executa() {
        System.out.println("o professor esta dando aula");
    }

    public void corrigirProvas() {
        System.out.println("O porfessor " + this.getNome_funcionario() + " esta corrigindo prova!");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O professor " + getNome_funcionario() + " esta dando aula");
    }
}
