package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio8 {

    public static void main(String[] args) {
        List<String> evoluciones = pokemons.stream().filter(p -> p.getEvolucion() == true).map(p -> p.getName())
                .collect(Collectors.toList());

        System.out.println(evoluciones);
    }
}
