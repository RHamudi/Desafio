package deasfio.java.Iniflex.Services;

import deasfio.java.Iniflex.Model.Funcionario;

import java.util.List;

public class Remover {
    public void RemoverPorNome(String nomeFuncionario, List<Funcionario> db){
        db.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nomeFuncionario));
    }
}
