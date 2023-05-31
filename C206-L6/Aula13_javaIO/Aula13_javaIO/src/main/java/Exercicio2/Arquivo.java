package Exercicio2;

import java.io.*;
import java.util.ArrayList;


//cria arquivos txt
public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Cliente clientes) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada (quarda dados da memoria e depois pega)

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Clientes.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Funcionarios ++\n");//espacamento entre um arquivo salvo
            bw.write(clientes.getNome() + "\n");
            bw.write(clientes.getCpf() + "\n");
            bw.write(clientes.getEndereco() + "\n");
            bw.write(clientes.getIdade() + "\n");

            /*
            // 1. Escrita de forma estática, ou seja, direta

            linha="Olá mundo 3";
            bw.write("Olá mundo\n");
            bw.write("Olá mundo 2");
            bw.newLine();
            bw.write(linha);

             */

            //importante fechar
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
    public ArrayList<Cliente> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList<Cliente> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("Clientes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Funcionarios ++")) {
                    // Variável auxiliar de funcionario
                    Cliente cliente = new Cliente();
                    cliente.setNome(br.readLine());
                    cliente.setCpf(Integer.parseInt(br.readLine()));
                    cliente.setEndereco(br.readLine());
                    cliente.setIdade(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(cliente);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }


        return encontreiNoArquivo;


    }
}
