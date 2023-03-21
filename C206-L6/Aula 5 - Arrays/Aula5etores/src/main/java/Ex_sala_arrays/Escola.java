package Ex_sala_arrays;

public class Escola {
    //atributos
    String nome;
    String email;
    int num_telefone;
    String endereco;

    //associacao por agragacao com vetores
    Estudante[] estudantes= new Estudante[300];

    //metodos
    public void addEstudante(Estudante estudante) {
        for (int i = 0; i < estudantes.length; i++) {

            if (estudantes[i] == null) {
                estudantes[i] = estudante;
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Nome da Escola: "+nome);
        System.out.println("-------------");
        for(int i=0;i<estudantes.length;i++){
            if(estudantes[i]!=null) {
                estudantes[i].mostraInfo();
            }
        }

    }
    public void QtdEstudantesPorAno(){
        int quantidade_por_ano;
        quantidade_por_ano=estudantes;

    }
}
