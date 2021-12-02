package exercicios;

import javax.swing.*;
import java.lang.*;

public class QualMaiorNumero {

    public static void main(String[] args) {

        String tempNum1 = JOptionPane.showInputDialog("Informe o 1° número: ");
        int num1 = parseInt();

        System.out.println("Informe o 2° número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("Número " + num1 + " é maior!");
        } else {
            if (num2 > num1) {
                System.out.println("Número " + num2 + " é maior!");
            } else {
                System.out.println("Os números " + num1 + " e " + num2 + " são iguais!");
            }
        }
    }

}
