package Aula5_ex_sala;

public class Escola {

    //atributos
    String nome;
    String email;
    int numTelefone;
    String endereco;

    //associcao por agregacao
    Estudante[] estudantes = new Estudante[300];//array com 10 posicoes

    void addEstudante(Estudante estudante) {
        for (int i = 0; i < estudantes.length; i++) {
           if(estudantes[i]==null){
               estudantes[i]=estudante;
               System.out.println("Estudante adicionado!");
               break;
           }
        }
    }
    void mostraInfo() {
        for (int i=0;i< estudantes.length;i++){
            if(estudantes[i]!=null){
                estudantes[i].mostraInfo();
            }
        }

    }

    void quantidadeEstudantesPorAno() {
        int quantidade_primeiro=0;
        int quantidade_segundo=0;
        int quantidade_terceiro=0;


        for (int i=0;i< estudantes.length;i++){
            if(estudantes[i]!=null){
                if(estudantes[i].ano.equals("primeiro")){
                    quantidade_primeiro++;
                }
                else if(estudantes[i].ano.equals("segundo")){
                    quantidade_segundo++;
                }
                else if(estudantes[i].ano.equals("terceiro")){
                    quantidade_terceiro++;
                }
                else {
                    System.out.println("Alunos que nao sao do 1°,2°,3° ano");
                }

            }

        }
        System.out.println("Quantidade de alunos do primeiro ano: "+quantidade_primeiro);
        System.out.println("Quantidade de alunos do segundo ano: "+quantidade_segundo);
        System.out.println("Quantidade de alunos do terceiro ano: "+quantidade_terceiro);

    }

}
