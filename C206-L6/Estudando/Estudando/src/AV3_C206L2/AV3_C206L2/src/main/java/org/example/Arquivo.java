package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Livro l) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Livros.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Jogo
            bw.write("++ Jogo ++\n");
            bw.write(l.getNome() + "\n");
            bw.write(l.getAutor() + "\n");
            bw.write(l.getEditora() + "\n");
            bw.write(l.getQtdPaginas() + "\n");

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Livro> ler() {

        // ArrayList auxiliar para salvar jogos encontrados no arquivo
        ArrayList<Livro> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("Livros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Livros ++")) {
                    // Variável auxiliar de jogos
                    Livro j1 = new Livro();
                    j1.setNome(br.readLine());
                    j1.setAutor(br.readLine());
                    j1.setEditora(br.readLine());
                    j1.setQtdPaginas(Integer.parseInt(br.readLine()));

                    // Adicionando o jogo no array
                    encontreiNoArquivo.add(j1);
                }
                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }

        return encontreiNoArquivo;
    }
}