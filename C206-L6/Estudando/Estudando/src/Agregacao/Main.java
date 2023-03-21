package Agregacao;

public class Main {
    public static void main(String[] args) {

        /*
        *OBSERVACOES:
        * Nao é usado new na classe todo
        * Composição: A existência do objeto depende da existência do outro objeto.
        Ex.: Para a existência da Arma, precisa existir um objeto Nave. Quando instancia-se
        uma Nave, instancia-se, também, uma Arma (a instância é feita dentro do construtor da Nave.
        * Agregação: A exstência do objeto NÃO depende da existência do outro objeto.
        Ex.: Para a existência (objeto) da Arma, NÃO precisa existir um objeto Nave. Nesse caso,
        adicionamos pelo construtor ou um método adicionarArma, passando a referência da Arma como
        parâmetro.
         */

        //instanciando uma nave
        Nave n1 = new Nave("Pogue", 100, false, "Fogo", 40);

        //instanciando uma arma
        Arma a1 = new Arma("Espingarda", 300);

        //se nao tivesse o construtor entraria assim
        /*
        n1.arma=a1;

        //definir valores a nave n1
        n1.nome="ferrari";
        n1.velocidade=100;
        n1.velocidadeDaLUz=false;

        //definir valores a arma a1
        a1.nome="espingarda";
        a1.poder=30;
        //n1.arma.nome="espingarda";
        //n1.arma.poder=30;
*/


        //metodo para adicionar uma arma por meio da Agragacao
        n1.addArma(a1);

        //mostrar informacoes
        n1.mostraInfo();


    }
}
