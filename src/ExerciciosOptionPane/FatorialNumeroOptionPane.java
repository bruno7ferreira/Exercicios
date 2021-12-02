package ExerciciosOptionPane;

import javax.swing.*;

public class FatorialNumeroOptionPane {

    public static void main(String[] args) {

        int numero, fatorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número? "));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Não tem fatorial de número negativo");
        } else {
            while (numero > 1) {
                fatorial *= numero;
                numero--;
            }
            JOptionPane.showMessageDialog(null, "Respota: " + fatorial);
        }


    }

}
