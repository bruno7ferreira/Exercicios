package ExerciciosOptionPane;

import javax.swing.*;
import java.util.Random;

import static java.lang.Integer.parseInt;


public class ChuteNumeroOptionPane {

    public static void main(String[] args) {

        Random sorteio = new Random();
        Integer numero = sorteio.nextInt(10);

        String palpiteTemp; //= JOptionPane.showInputDialog("Informe um número de 1 a 10: ");
        Integer palpite; //= parseInt(palpiteTemp);
        System.out.println(numero);

        //Repete enquanto o usuário não digitar um número entre 1 e 10
        do {
            palpiteTemp = JOptionPane.showInputDialog("Informe um número entre 1 a 10: ");
            palpite = parseInt(palpiteTemp);
        } while (palpite < 1 || palpite > 10);

        //lógica para validar o número
        if (palpite != numero) {
            while (palpite != numero) {
                if (palpite > numero) {
                    palpiteTemp = JOptionPane.showInputDialog("E um número abaixo de " + palpiteTemp + "\n" +
                            "Tente novamente, informe um número de 1 a 10: ");
                    palpite = parseInt(palpiteTemp);
                    System.out.println(palpite);
                } else {
                    palpiteTemp = JOptionPane.showInputDialog("E um número acima de " + palpiteTemp + "\n" +
                            "Tente novamente, informe um número de 1 a 10: ");
                    palpite = parseInt(palpiteTemp);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Parabéns você acertou! '" + numero + "'");
    }

}
