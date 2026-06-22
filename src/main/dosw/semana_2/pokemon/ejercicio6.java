package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio6 {
    public static void main(String[] args) {
        List<String> nombres = pokemons.stream()
                .map(ejercicio1.Pokemon::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nombres);
    }
}
