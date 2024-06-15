package deasfio.java.Iniflex.Services;

import deasfio.java.Iniflex.Model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class Aumento {
    public void Aplicar10porcento(List<Funcionario> db){
        for (var item : db){
            item.setSalario(item.getSalario().add(item.getSalario().multiply(BigDecimal.valueOf(0.10))));
        }
    }
}
