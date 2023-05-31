package org.example;

public class Livro {

    //atributos
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    //metodo mostra info
    public void mostraInfo(){
        System.out.println("Nome do livro");
        System.out.println(this.getNome());

        System.out.println("Nome do(a) autor");
        System.out.println(this.getAutor());

        System.out.println("Noma do(a) editora");
        System.out.println(this.getEditora());

        System.out.println("Quantidade de paginas");
        System.out.println(this.getQtdPaginas());
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
}
