package Encapsulamento;

public class Faculdade {
    public String nome;
    private Professor professor;

    public void darAula() {
    professor.darAulas();//professor recebe a funcao criada em professores
    }
}
