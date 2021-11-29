package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ChuteNumero {

    public static void main(String[] args) {

        Random sorteio = new Random();
        Integer numero = sorteio.nextInt(10);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 10: ");
        Integer palpite = entrada.nextInt();

        if (palpite < 1 || palpite > 10) {
            if (palpite < 1) {
                System.out.println("ERRO! Você informou um valor abaixo de 1");
            } else {
                System.out.println("ERRO! Você informou um valor acima de 10");
            }
        } else {
            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou era o número: " + numero);
            } else {
                if (palpite > numero) {
                    System.out.println("errou kkkk, é um número mais baixo!");
                } else {
                    System.out.println("errou kkkk, é um número mais alto");
                }
            }
        }


        entrada.close();
    }

}
