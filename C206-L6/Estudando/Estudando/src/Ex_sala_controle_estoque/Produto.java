package Ex_sala_controle_estoque;

public class Produto {
    //atributos
    int codigoSerie;
    String codigoProduto;
    String nome_produto;
    String categoria;
    int quantidade;

    /* metodo construtor para passsar valores diretopublic Produto(int codigoSerie, String codigoProduto, String nome_produto, String categoria, int quantidade) {
         this.codigoSerie = codigoSerie;
         this.codigoProduto = codigoProduto;
         this.nome_produto = nome_produto;
         this.categoria = categoria;
         this.quantidade = quantidade;
     }
  */
    //metodos
    void mostraInfo() {
        System.out.println(this.codigoSerie);
        System.out.println(this.codigoProduto);
        System.out.println(this.nome_produto);
        System.out.println(this.categoria);
        System.out.println(this.quantidade);


    }
}
