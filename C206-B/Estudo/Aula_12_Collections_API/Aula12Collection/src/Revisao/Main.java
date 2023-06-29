package Revisao;

import java.util.*;

public class Main {
    public static void main(String[] args) {

      /*/////////////////////////array list////////////////////////
      *List:Interface que utiliza da classe ArrayList
      * classe são os tipos primitivos como Integer(int),Double(double)...
      *listar elementos de forma homogenia ou heterogenia(usar casting)
      * Mostra o que foi duplicado
       */
        ArrayList<String> nomes=new ArrayList<>();//instanciando o objeto nomes

        //adicionar
        nomes.add("Tho");
        nomes.add("Beatriz");
        nomes.add("Tho");
        nomes.add("Luana");

           Collections.sort(nomes); //ordenar crescente
        // Collections.reverse(nomes);//ordem decrescente
        // Collections.sort(nomes,Collections.reverseOrder());//ordem decrescente

        //for tradicional
        System.out.println("Nomes em ordem alfabetica sem criar classe usando ArrayList");
        for(int i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }

        /*
        //buscar nomes com forEach
        for(String n:nomes){
            System.out.println(n);
        }
         */

/////////////////////////////////////////////usando outra classe para comparable/////////////////////////////
        ArrayList<Nome_teste> nomes_testadando=new ArrayList<>();//array do proprio objeto
        Nome_teste n1=new Nome_teste("Alice",22);
        Nome_teste n2=new Nome_teste("Thomas",20);

        //adicionando
        nomes_testadando.add(n1);
        nomes_testadando.add(n2);

        Collections.sort(nomes_testadando);//ordenando crescente

        System.out.println("Nome de cada objeto em ordem alfabetica criando uma classe para ordenar usando ArrayList");
        for(int i=0;i<nomes_testadando.size();i++){
            System.out.println(nomes_testadando.get(i).nome);
        }


      /*/////////////////////////////hashset/////////////////////////////////////
      *Melhor desempenho na busca e para guardar elementos
      * Nao pode haver duplicacao
       */
        HashSet<Integer> numeros=new HashSet<Integer>();//array para add valores numericos
        numeros.add(10);
        numeros.add(20);
        numeros.add(4);
        numeros.add(15);
        numeros.add(22);
        numeros.add(22);//nao pode haver duplicacao,ele nao mostra a repeticao

        //remover algum elemento
        System.out.println(numeros.remove(22));//removendo o valor 22

        //ordenar um hashSet

        System.out.println("Mostrando os numeros usanso HashSet");
        for (int Valores: numeros){
            System.out.println(Valores);
        }



      /*///////////////////linkedhashset////////////////////////////////////////
      *Nao possui tanto desempenho comparado com o hashset
      * Ordena de acordo com o que for inserido primeiro
      * Nao mostra o que for duplicado
       */
        LinkedHashSet<String> elemento =new LinkedHashSet<>();

        //add ordena de acordo com a insercao
        elemento.add("Ana");
        elemento.add("Brenda");
        elemento.add("Carla");
        elemento.add("Ana");

        System.out.println("Mostrando o nome usando LinkedHashSet");
       for(String nome : elemento){
           System.out.println(nome);
       }




      /*/////////////////////hash map///////////////////////////////////////////
      *Possui formato de dicionario
      *Mapeia valares tendo uma chave(Achar a informacao) e valor para (mostrar o que esta na chave)
      * HashMap Lista=new HashMap<>();
      * Salvar: Lista.put(chave,valor);
      * double valor=Lista.get(chave);
      * buscar: Lista.get(valor);
       */
        HashMap<String,Double> conjunto=new HashMap<>();//chave:String  valor:Double
        //salvando dados (valores)
        conjunto.put("Camisa",20.00);
        conjunto.put("Short",15.00);
        conjunto.put("Meias",10.00);

        //encontrar algo a partir da chave
        System.out.println("Mostrando o que tem na chave usando HashMap");
        if(conjunto.get("Meias")!=null){
            System.out.println(conjunto.get("Meias"));
        }
        //passar novo valor (sobrescrita)
        conjunto.put("Meias",12.00);
        System.out.println("Sobrescrevendo um novo valor para meias: "+conjunto.get("Meias"));
        System.out.println(conjunto.get("Camisa"));//se encontrar mostra o valor, se nao mostra null
        System.out.println(conjunto.get("Calça"));//nao tem calca entao é null

    }
}