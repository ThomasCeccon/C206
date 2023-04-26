package PV2;

public class Treinador {

    //atributos
    private String nome;

    //associacao por composicao
    Pokemom[] pokemoms = new Pokemom[10]; //vetor pokemom com 5 posicoes

    //metodo construtor
    public Treinador(String nome) {
        this.nome = nome;

    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    //metodos
    public void addPokemon(Pokemom p) {
        for (int i = 0; i < pokemoms.length; i++) {
            if (pokemoms[i] == null) {
                pokemoms[i] = p;
                System.out.println("Pokemom adicionado!");
                break;
            }

        }

    }

    public void mostraInfo() {
        System.out.println("Nome do treinador: " + this.getNome());
        for (int i = 0; i < pokemoms.length; i++) {


            if (pokemoms[i] != null) {
                if (pokemoms[i] instanceof Squirtle) {
                    Squirtle squirtle1 = (Squirtle) pokemoms[i];//passa dados de squirtle para pokemom
                    //saida
                    squirtle1.mostraInfo();
                    squirtle1.atacar();
                    squirtle1.fazerBarulho();
                    System.out.println("-------------------");

                } else if (pokemoms[i] instanceof Bulbassaur) {
                    Bulbassaur bulbassaur1 = (Bulbassaur) pokemoms[i];//passa dados de sbulbassaur para pokemom
                    //saida
                    bulbassaur1.mostraInfo();
                    bulbassaur1.atacar();
                    bulbassaur1.fazerBarulho();
                    System.out.println("-----------------");
                } else {
                    Pikachu pikachu1 = (Pikachu) pokemoms[i];//passa dados de pikachu para pokemom
                    //saida
                    pikachu1.mostraInfo();
                    pikachu1.atacar();
                    pikachu1.fazerBarulho();
                    System.out.println("-------------------");
                }
               // System.out.println(Pokemom.qtdPokemom);
            }

        }
    }
}