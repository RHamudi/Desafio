package deasfio.java.Iniflex.Model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{
    private BigDecimal Salario;
    private String Funcao;

    public Funcionario(String nome, LocalDate dataNascimento , double salario, String funcao) {
        super(nome, dataNascimento);
        Salario = BigDecimal.valueOf(salario);
        Funcao = funcao;
    }

    public BigDecimal getSalario() {
        return Salario;
    }

    public void setSalario(BigDecimal salario) {
        Salario = salario;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String funcao) {
        Funcao = funcao;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return  "nome= " + super.getNome() +
                ", data de nascimento= " + super.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", salario= " + df.format(getSalario().doubleValue()) +
                ", cargo= " + getFuncao();
    }
}
