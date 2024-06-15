package deasfio.java.Iniflex.Services;

import deasfio.java.Iniflex.Model.Funcionario;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Inserir {
    public void InserirTodosFuncionarios(List<Funcionario> db) {
        var funcionario = new Funcionario("Maria", LocalDate.of(2000, 10, 18), 2009.44, "Operador");
        var funcionario1 = new Funcionario("João", LocalDate.of(1990, 5, 12), 2284.38, "Operador");
        var funcionario2 = new Funcionario("Caio", LocalDate.of(1961, 5, 2), 9836.14, "Coordenador");
        var funcionario3 = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), 19119.88, "Diretor");
        var funcionario4 = new Funcionario("Alice", LocalDate.of(1995, 1, 5), 2234.68, "Recepcionista");
        var funcionario5 = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), 1582.72, "Operador");
        var funcionario6 = new Funcionario("Arthur", LocalDate.of(1993, 3, 31), 4071.84, "Contador");
        var funcionario7 = new Funcionario("Laura", LocalDate.of(1994, 7, 8), 3017.45, "Gerente");
        var funcionario8 = new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), 1606.8544, "Eletricista");
        var funcionario9 = new Funcionario("Helena", LocalDate.of(1996, 9, 2), 2799.93, "Gerente");
        db.addAll(Arrays.asList(funcionario, funcionario1, funcionario2, funcionario3, funcionario4, funcionario5, funcionario6, funcionario7,funcionario8,funcionario9));
    }
}
