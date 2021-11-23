package exercicios;

import java.util.Scanner;

public class BoasVindas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String x = entrada.nextLine();

        System.out.println("Seja bem-vindo! " + x);

        entrada.close();
    }

}
