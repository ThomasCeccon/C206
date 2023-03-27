package Empresa_composicao;

public class Empresa {
    //atributos
    String nome;
    String cnpj;

    //agragacao
    Departamento dep;

    //construtor
    public Empresa(){
        this.nome=nome;
        this.cnpj=cnpj;
       this.dep=new Departamento();
    }
}
