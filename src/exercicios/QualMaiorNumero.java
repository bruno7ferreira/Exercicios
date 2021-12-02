package exercicios;

import javax.swing.*;
import java.lang.*;

import static java.lang.Integer.parseInt;

public class QualMaiorNumero {

    public static void main(String[] args) {

        String tempNum1 = JOptionPane.showInputDialog("Informe o 1° número: ");
        int num1 = parseInt(tempNum1);

        String tempNum2 = JOptionPane.showInputDialog("Informe o 2° número: ");
        int num2 = parseInt(tempNum2);

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Número " + num1 + " é maior!");
        } else {
            if (num2 > num1) {
                JOptionPane.showMessageDialog(null, "Número " + num2 + " é maior!");
            } else {
                JOptionPane.showMessageDialog(null, "Os números " + num1 + " e " + num2 + " são iguais!");
            }
        }
    }
}
