package exercicios;

import java.util.Scanner;

public class ExercicioSalarioMinuto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        Double salario = entrada.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        Integer horas = entrada.nextInt();

        Double resultado = salario / horas;
        System.out.println("Sua hora trabalhada custa: " + resultado);

        entrada.close();
    }

}
