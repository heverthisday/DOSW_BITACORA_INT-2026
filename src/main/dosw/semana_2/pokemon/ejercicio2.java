package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio2 {

    public static void main(String[] args) {

        List<String> mayusculas = pokemons.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(mayusculas);
    }
}