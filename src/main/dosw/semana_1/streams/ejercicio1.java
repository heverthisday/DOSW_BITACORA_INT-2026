package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static void numero1() {
        List<Integer> numeros = List.of(3, 8, 10, 12, 15, 18, 20);
        List<Integer> mayoresPar = numeros.stream().filter(n -> n > 10 && n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(mayoresPar);
    }

    static void main() {
        numero1();
    }


}
