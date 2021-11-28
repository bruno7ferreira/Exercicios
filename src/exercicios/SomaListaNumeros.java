package exercicios;

import java.util.ArrayList;
import java.util.List;

public class SomaListaNumeros {

    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(15);
        listaNumeros.add(46);
        listaNumeros.add(75);
        listaNumeros.add(34);
        listaNumeros.add(23);

        for (Integer cont : listaNumeros) {
            System.out.println("idades: " + cont);
        }

    }

}
