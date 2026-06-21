package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;

public class retoMewtwo {

    public static void main(String[] args) {


        Map<String, Double> poderPorRegion =
                pokemon.pokemons.stream()


                        .filter(p -> !p.isLegendario())


                        .collect(Collectors.groupingBy(
                                pokemon::getRegion,
                                Collectors.summingDouble(pokemon::getPower)
                        ));

        System.out.println("Poder total por región (sin legendarios):");
        System.out.println(poderPorRegion);



        Optional<Map.Entry<String, Double>> regionMasFuerte =
                poderPorRegion.entrySet().stream()


                        .max(Map.Entry.comparingByValue());

        regionMasFuerte.ifPresent(e ->
                System.out.println("Región más poderosa: " + e.getKey()
                        + " con poder: " + e.getValue())
        );
    }
}