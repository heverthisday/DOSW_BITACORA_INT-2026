package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio18 {

    public static void main(String[] args) {

        int[] index = {1};

        List<String> pokemones_fuertes = pokemons.stream()
                .sorted(Comparator.comparingDouble(pokemon::getPower).reversed())
                .limit(5)
                .map(p -> "#" + index[0]++ + " " + p.getName()
                        + "    - PC: " + (int) p.getPower())
                .collect(Collectors.toList());

        pokemones_fuertes.forEach(System.out::println);
    }
}