package PV2;

public class Main {
    public static void main(String[] args)
    {
        //isntancia da classe associada por composicao
        Treinador treinador=new Treinador("Thomas");
        treinador.setNome("Carlos");


        //instanciando as classes filhas
        Squirtle squirtle=new Squirtle("Pedro","agua",500);
        Bulbassaur bulbassaur=new Bulbassaur("Leu","fogo",600);
        Pikachu pikachu=new Pikachu("Thales","voa",200,700);
        Heldltem h1 = new Heldltem();

        h1.tipo= "Oculos de visibilidade";
        squirtle.heldItem = h1;

        //adicionando pokemons
        treinador.addPokemon(squirtle);
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        //saida de dados
        treinador.mostraInfo();

    }
}