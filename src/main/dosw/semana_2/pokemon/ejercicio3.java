package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio3 {

    public static void main(String[] args) {

        int total = pokemons.stream()
                .mapToInt(ejercicio1.Pokemon::getLevel)
                .sum();

        System.out.println(total);
    }
}