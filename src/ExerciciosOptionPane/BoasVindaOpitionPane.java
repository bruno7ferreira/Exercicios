package ExerciciosOptionPane;

import javax.swing.*;

public class BoasVindaOpitionPane {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");

        JOptionPane.showMessageDialog(null, " Seja bem-vindo! " + nome);

    }
}
