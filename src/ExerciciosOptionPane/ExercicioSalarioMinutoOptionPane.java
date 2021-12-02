package ExerciciosOptionPane;


import javax.swing.*;

import static java.lang.Integer.parseInt;

public class ExercicioSalarioMinutoOptionPane {

    public static void main(String[] args) {

        String tempSalario = JOptionPane.showInputDialog("Informe o seu salário: ");
        int salario = parseInt(tempSalario);

        String tempHoras = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no mês: ");
        int horas = parseInt(tempHoras);

        double resultado = salario / horas;
        JOptionPane.showMessageDialog(null, "Sua hora trabalhada custa: " + resultado);
    }

}
