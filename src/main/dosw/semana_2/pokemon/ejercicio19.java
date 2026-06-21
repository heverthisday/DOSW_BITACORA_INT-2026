package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio19 {

    public static void main(String[] args) {

        int[] index = {1};

        List<String> ranking = entrenadores.stream()
                .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                        .thenComparingDouble(e -> e.getEquipo()
                                .stream()
                                .mapToDouble(pokemon::getPower)
                                .sum()
                        ).reversed()
                        .thenComparing(Entrenador::getNombre)
                )
                .limit(3)
                .map(e -> {
                    double total = e.getEquipo()
                            .stream()
                            .mapToDouble(pokemon::getPower)
                            .sum();
                    return "#" + index[0]++ + " " + e.getNombre()
                            + "  - " + e.getMedallas() + " medallas, PC: " + (int) total;
                })
                .collect(Collectors.toList());

        ranking.forEach(System.out::println);
    }
}