package Ex_classe_carro;

public class Main {
    public static void main(String[] args) {

        //instanciar o carro 1
        Carro c1=new Carro();

        //definir valores as classes
        c1.nome="Uno";
        c1.marca="Fiat";
        c1.ano=2012;
        c1.velocidade=60;

        //sair com os dados
        System.out.println("Modelo do carro: "+c1.nome);
        System.out.println("Marca do carro: "+c1.marca);
        System.out.println("Ano do carro: "+c1.ano);

        //chamar os metodos
        c1.Acelerar(10);
        System.out.println("velocidade: "+c1.velocidade+" km/h");

        c1.Freiar(30);
        System.out.println("Freiar: "+c1.velocidade+ " km/h");

        c1.Buzinar();
    }
}
