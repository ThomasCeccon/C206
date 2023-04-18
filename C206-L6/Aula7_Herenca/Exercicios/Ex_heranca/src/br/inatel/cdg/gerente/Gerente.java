package br.inatel.cdg.gerente;

import br.inatel.cdg.funcionario.Funcionario;

public class Gerente extends Funcionario {
    //atributos
    private int senha;

    //GET AND SET
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
