package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;

public class ejercicio3 {

    static void niveles () {

        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);
        int suma = niveles.stream().reduce(0, Integer::sum);
        System.out.println( " suma total de niveles " + suma);

    }


    public static void main(String[] args) {
        niveles();
    }
}
