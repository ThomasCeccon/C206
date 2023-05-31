package Exercitando;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos=new ArrayList<>();

        //instancia de produtos
        Produto produto1=new Produto("Leite",18);
        Produto produto2=new Produto("Ovo",6);
        Produto produto3=new Produto("Carne",12);

        //adicionar cada produto ao vetor
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        //ordenar a partir do preco
        System.out.println("=========================");
        System.out.println("Orednando a partir do preco");
        Collections.sort(produtos);//ordem crescente preco

        //percorre cada posicao do objeto conta
        for(int i=0;i<produtos.size();i++){
            System.out.println("Nome do produto: "+produtos.get(i).nome);
            System.out.println("Preco do produto: "+produtos.get(i).preco);
        }


        //ordenar a partir do alfabeto
        System.out.println("=========================");
        System.out.println("Orednando a partir do alfabeto");
        Collections.sort(produtos);// //ordenar a partir do alfabeto

        //percorre cada posicao do objeto conta
        for(int i=0;i<produtos.size();i++){
            System.out.println("Nome do produto: "+produtos.get(i).nome);
            System.out.println("Preco do produto: "+produtos.get(i).preco);
        }
        System.out.println("=========================");


        //ordenar a partir do preco descrecente
        System.out.println("Orednando a partir do preco na ordem descrecente");
        Collections.reverse(produtos);//ordem crescente preco

        //percorre cada posicao do objeto conta
        for(int i=0;i<produtos.size();i++){
            System.out.println("Nome do produto: "+produtos.get(i).nome);
            System.out.println("Preco do produto: "+produtos.get(i).preco);
        }
        System.out.println("=========================");

    }


}
