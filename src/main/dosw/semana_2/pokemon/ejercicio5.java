package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio5 {
    public static void main(String[] args) {

        long cantidad = pokemons.stream()
                .filter(p -> p.getLevel() > 80)
                .count();
        String pokemones = pokemons.stream().filter(p -> p.getLevel() > 80).collect(Collectors.toList()).get(0).getName();

        System.out.println("pokemones de  elite: " + cantidad + " son: " +  pokemones);
    }
}