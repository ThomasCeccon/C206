package Prova1_lab;

import java.io.BufferedReader;

public class Aldeia {
    //atributos
    String nome;
    int quantidadeMoradores;
    String regiao;

    //associando por agregacao com arrays e com 100 posicoes
    Ninja[] ninjas = new Ninja[100];

    //metodos
    void adicionarNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {//nulo para ser preenchido(adicionado)
                ninjas[i] = ninja;
                System.out.println("Ninja adicionado!");
                break;
            }
        }
    }

    void mostraInfo() {
        System.out.println("Nome da aldeia: " + this.nome);
        System.out.println("Qunatidade de moradores: " + this.quantidadeMoradores);
        System.out.println("Região: " + this.regiao);
        System.out.println("====================");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                ninjas[i].mostraInfo();
            }
        }
    }

    void rankingS() {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                if (ninjas[i].ranking.equals("S")) {
                    System.out.println("Nome do ninja classificado no ranking S é: " + this.ninjas[i].nome);
                }
            }
        }

    }

    void quantidadeTitulos() {
        //declaracao das variaveis
        int contGennin = 0;
        int contChunnin = 0;
        int contANBU = 0;

        //quantidade de titulos
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                if (ninjas[i].titulo.equals("Gennin")) {
                    contGennin++;
                }
                if (ninjas[i].titulo.equals("Chunnin")) {
                    contChunnin++;
                }
                if (ninjas[i].titulo.equals("ANBU")) {
                    contANBU++;
                }
            }
        }
        //saida de dados
        System.out.println("Quantidade de ninjas Gennin: " + contGennin);
        System.out.println("Quantidade de ninjas Chunnin: " + contChunnin);
        System.out.println("Quantidade de ninjas ANBU: " + contANBU);
    }
}
