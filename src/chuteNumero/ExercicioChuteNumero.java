package chuteNumero;

import java.util.Random;
import java.util.Scanner;

public class ExercicioChuteNumero {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int numero = aleatorio.nextInt(10);
        System.out.println(numero);
        int numeroAlvo = numero;


        if (true) {
            System.out.println("Chute um número de 0 a 10: ");
            int chute = entrada.nextInt();

            if (chute >= 0 && chute <= 10) {

                while (chute != numeroAlvo) {
                    System.out.println("Não é o número " + chute + " Tente outro número: ");
                    chute = entrada.nextInt();
                }
                System.out.println("Você acertou! era o número: " + numeroAlvo);
            } else {
                System.out.println("Você escolheu um número um número fora da faixa 0 a 10");
            }

        }

        entrada.close();
    }
}
