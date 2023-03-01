package Classe;

public class Pessoa {
    //variaveis
    String nome;
    String sexo;
    int idade;

    //metodos (funcoes que mostram as acoes da classe)
    public void Nome(String nome_pessoa){
        if(nome_pessoa=="Carlos"){
            System.out.println("Esse é meu nome");
        }
        else{
            System.out.println("Esse nao é meu nome");
        }
    }

    public void Idade(int idade_pessoa) {
      if(idade_pessoa>=18){
          System.out.println("maior de idade");
      }
      else {
          System.out.println("menor de idade");
      }

    }
}
