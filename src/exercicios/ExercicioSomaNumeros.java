package exercicios;

import java.util.stream.IntStream;

public class ExercicioSomaNumeros {

    public static void main(String[] args) {

        int[] numeros = {15, 46, 75, 34, 23};
        int sum = IntStream.of(numeros).sum();
        System.out.println("A soma dos números é: " + sum);

    }

}
