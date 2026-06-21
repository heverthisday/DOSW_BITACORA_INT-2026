package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio14 {
    public static void main(String[] args) {

        Map<String, List<pokemon>> agrupados = pokemon.pokemons.stream()
                .collect(Collectors.groupingBy(pokemon::getRegion));

        agrupados.forEach((region, lista) -> {
            List<String> nombres = lista.stream()
                    .map(pokemon::getName)
                    .collect(Collectors.toList());

            System.out.println(region + ": " + nombres);
        });
    }
}
