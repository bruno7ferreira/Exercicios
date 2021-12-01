package ExerciciosOptionPane;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class ChuteNumeroOptionPane {

    public static void main(String[] args) {

        Random sorteio = new Random();
        Integer numero = sorteio.nextInt(10);

        Scanner entrada = new Scanner(System.in);


        String palpiteTemp = JOptionPane.showInputDialog("Informe um número de 1 a 10: ");
        Integer palpite = parseInt(palpiteTemp);

        do {
            palpiteTemp = JOptionPane.showInputDialog("Informe um número de 1 a 10: ");
            palpite = parseInt(palpiteTemp);
        } while (palpite < 1 || palpite > 10);




        //laço de 1 a 10 ok


    }

}
