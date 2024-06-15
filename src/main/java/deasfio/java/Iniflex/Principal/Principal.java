package deasfio.java.Iniflex.Principal;

import deasfio.java.Iniflex.Model.Funcionario;
import deasfio.java.Iniflex.Services.Agrupar;
import deasfio.java.Iniflex.Services.Aumento;
import deasfio.java.Iniflex.Services.Inserir;
import deasfio.java.Iniflex.Services.Remover;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    List<Funcionario> BancoDados = new ArrayList<>();

    private final Inserir inserir = new Inserir();
    private final Remover remover = new Remover();
    private final Aumento aumento = new Aumento();
    private final Agrupar agrupar = new Agrupar();

    public void Executar (){
        //3.1 Inserindo todos os funcionarios
        inserir.InserirTodosFuncionarios(BancoDados);
        //3.2 Removendo Funcionario por nome
        remover.RemoverPorNome("joão", BancoDados);
        //3.3 imprimindo todos os funcionarios
        System.out.println("\nImprimindo Todos os funcionarios");
        BancoDados.forEach(System.out::println);
        System.out.println("\n");
        //3.4 Aplicando Aumento
        aumento.Aplicar10porcento(BancoDados);
        //3.5 & 3.6 Agrupar os funcionarios por função
        agrupar.Funcao(BancoDados);
        //3.8 Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        agrupar.Mes(BancoDados);
        //3.9 Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
        agrupar.MaiorIdade(BancoDados);
        //3.10  Imprimir a lista de funcionários por ordem alfabética.
        agrupar.OrdemAlfabetica(BancoDados);
        //3.11 Imprimir o total dos salários dos funcionários.
        agrupar.TotalSalarios(BancoDados);
        //3.12  Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
        agrupar.SalariosMinimos(BancoDados);
    }
}
