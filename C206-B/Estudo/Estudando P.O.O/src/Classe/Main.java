package Classe;

public class Main {
    public static void main(String[] args) {
        //instancia de objeto
        Pessoa p = new Pessoa();

        //definir valores
        p.nome="Carlos";
        p.sexo = "M";
        p.idade=19;

        //saida das informacoes passadas
        System.out.println("Nome: "+p.nome);
        System.out.println("Sexo: "+p.sexo);
        System.out.println("Idade: "+p.idade);

        //chamar as funcoes e imprimir elas
        p.Nome("Carlos");
        p.Idade(19);





    }
}