package system;

import employee.empregado;
import java.util.Locale;
import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        empregado empregado = new empregado();

        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        empregado.roubo = sc.nextDouble();

        System.out.printf("\nEmpregado: " + empregado);
        System.out.println("\nQual porcentagem aumentar o salário: ");

        double porcentagem = sc.nextDouble();
        empregado.aumentoDeSalario(porcentagem);
        System.out.println("\nDados atualizados: " + empregado);

    }
}
