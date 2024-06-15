package deasfio.java.Iniflex.Services;

import deasfio.java.Iniflex.Model.Funcionario;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Agrupar {
    public void Funcao(List<Funcionario> db) {
        Map<String, List<Funcionario>> FuncionariosOrdenados = new HashMap<>();

        for (Funcionario funcionario : db){
            String funcao = funcionario.getFuncao();
            if(!FuncionariosOrdenados.containsKey(funcao)){
                FuncionariosOrdenados.put(funcao, new ArrayList<>());
            }
            FuncionariosOrdenados.get(funcao).add(funcionario);
        }

        System.out.println("\nImprimindo funcionarios por função\n");
        for(Map.Entry<String, List<Funcionario>> entry : FuncionariosOrdenados.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void Mes(List<Funcionario> db) {
        System.out.println("\nFuncionarios que fazem aniverasio no mês 10 ou 12\n");
        db.stream()
                .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
                .forEach(System.out::println);
    }

    public void MaiorIdade(List<Funcionario> db){

        var filtroIdade = db.stream()
                .min((f1, f2) -> f1.getDataNascimento().compareTo(f2.getDataNascimento()));
        if(filtroIdade.isPresent()){
            var FuncMaiorIdade = filtroIdade.get();
            System.out.println("\nFuncionario mais velho: " + FuncMaiorIdade.getNome() + " com "
                    + Period.between(FuncMaiorIdade.getDataNascimento(), LocalDate.now()).getYears());
        }
    }

    public void OrdemAlfabetica(List<Funcionario> db) {
        System.out.println("\nImprimindo funcionarios por ordem alfabetica\n");
        db.stream()
                .sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
                .forEach(System.out::println);
    }

    public void TotalSalarios(List<Funcionario> db) {
        BigDecimal salarioTotal = BigDecimal.ZERO;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        for (Funcionario func : db){
            salarioTotal = salarioTotal.add(func.getSalario());
        }

        System.out.println("\nSalario somado de todos os funcionarios: " + df.format(salarioTotal.doubleValue()) + "\n");
    }

    public void SalariosMinimos(List<Funcionario> db){
        for(Funcionario func : db){
            System.out.println(func.getNome() + " Recebe " +
                    func.getSalario().divide(BigDecimal.valueOf(1212.00), 2, BigDecimal.ROUND_HALF_UP)
                    + " Salarios minimos"
            );
        }

    }
}
