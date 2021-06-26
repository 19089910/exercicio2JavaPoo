package employee;

import com.sun.javafx.binding.StringFormatter;

public class empregado {
    public String nome;
    public double salarioBruto;
    public double roubo;

    public double salarioLiquido(){
        return salarioBruto - roubo;//perceba que em um momento seguinte apois usar a funcao aumentoDeSalario
        //o salarioBruto e modificado
    }
    public void aumentoDeSalario(double porcentagem){
         salarioBruto += salarioBruto * porcentagem / 100;// retorn tem a capacidade de modificar o salario bruto
        // assim com o return salarioBruto - roubo; e modificado na main por isso nome retorne esse valor.
    }
    public String toString(){
        //return nome + ", $ " + String.format("%.2f", salarioLiquido());
        return String.format("%s, $ %.2f", nome, salarioLiquido());
    }
}
