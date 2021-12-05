package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioChuteNumero {

    public static void main(String[] args) {

        Random sorteio = new Random();
        int numero = sorteio.nextInt(10);

        Scanner entrada = new Scanner(System.in);


        System.out.println(numero);
        int numeroAlvo = numero;

        if (true) {
            System.out.println("Chute um número de 0 a 10: ");
            int chute = entrada.nextInt();

            if (chute >= 0 && chute <= 10) {

                while (chute != numeroAlvo) {
                    if (chute > numeroAlvo) {
                        System.out.println("Você chutou acima do alvo");
                    } else if (chute < numeroAlvo) {
                        System.out.println("Você chutou abaixo do alvo");
                    }
                    System.out.println("Não é o número " + chute + ", Tente outro número: ");
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
