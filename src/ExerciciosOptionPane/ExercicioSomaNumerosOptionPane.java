package ExerciciosOptionPane;

import javax.swing.*;
import java.util.stream.IntStream;
import java.lang.*;

public class ExercicioSomaNumerosOptionPane {

    public static void main(String[] args) {

        int[] numeros = {15, 46, 75, 34, 23};
        int sum = IntStream.of(numeros).sum();
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + sum);


    }

}
