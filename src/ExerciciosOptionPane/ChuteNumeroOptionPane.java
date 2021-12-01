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

        //Repete enquanto o usuário não digitar um número entre 1 e 10
        do {
            palpiteTemp = JOptionPane.showInputDialog("Informe um número de 1 a 10: ");
            palpite = parseInt(palpiteTemp);
        } while (palpite < 1 || palpite > 10);







    }

}
