package Salario_membro_statico_private;

public class Funcionario {
    //atributos
    String nome;
    int id;

    //modificadores de acesso
    private static int cont=0;
    private int salario;

    //metodo construtor
    public Funcionario(String nome,int salario) {
        this.nome = nome;
        cont++;
        this.id=cont;
        this.salario=salario;
    }
    //criar getter(pegar,acessar)
    public static int getCont() {

        return cont;
    }
    //mudar a variavel cont
    public static void setCont(int cont) {

        Funcionario.cont = cont;
    }

    //getter and set salario
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {

        this.salario = salario;
    }

    //metodo
    void mostraInfo(){
        System.out.println("nome funcionario: "+this.nome);
        System.out.println("id: "+this.id);

    }
}
