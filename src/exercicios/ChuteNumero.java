package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ChuteNumero {

    public static void main(String[] args) {

        Random sorteio = new Random();
        Integer numero = sorteio.nextInt(10);

        Scanner entrada = new Scanner(System.in);

        Integer palpite;
        System.out.println(numero);

        do {
            System.out.println("Informe um número de 1 a 10: ");
            palpite = entrada.nextInt();
        } while (palpite < 1 || palpite > 10);

        //laço de 1 a 10 ok

        if(palpite!=numero){
            while (palpite!=numero){
                if (palpite>numero){
                    System.out.println("Você chutou um número acima...");
                    System.out.println("Tente novamente, informe um número de 1 a 10: ");
                    palpite = entrada.nextInt();
                }else {
                    System.out.println("Você chutou um número abaixo...");
                    System.out.println("Tente novamente, informe um número de 1 a 10: ");
                    palpite = entrada.nextInt();
                }
            }
        }
        System.out.println("Parabéns você acertou! '" + numero + "'");


        entrada.close();
    }

}
