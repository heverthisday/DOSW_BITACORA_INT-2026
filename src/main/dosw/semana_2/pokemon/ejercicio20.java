package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;

public class ejercicio20 {

    public static void main(String[] args) {


        Map<String, Long> porTipo =
                pokemon.pokemons.stream()
                        .collect(Collectors.groupingBy(
                                pokemon::getType,
                                Collectors.counting()
                        ));


        Map<String, Long> porRegion =
                pokemon.pokemons.stream()
                        .collect(Collectors.groupingBy(
                                pokemon::getRegion,
                                Collectors.counting()
                        ));


        long legendarios =
                pokemon.pokemons.stream()
                        .filter(p -> p.isLegendario())
                        .count();


        double promedioNivel =
                pokemon.pokemons.stream()
                        .collect(Collectors.averagingInt(pokemon::getLevel));


        Optional<pokemon> masFuerte =
                pokemon.pokemons.stream()
                        .max(Comparator.comparingDouble(pokemon::getPower));


        System.out.println("Por tipo: " + porTipo);
        System.out.println("Por región: " + porRegion);
        System.out.println("Legendarios: " + legendarios);
        System.out.println("Promedio nivel: " + promedioNivel);

        masFuerte.ifPresent(p ->
                System.out.println("Más fuerte: " + p.getName() + " (PC: " + p.getPower() + ")")
        );
    }
}