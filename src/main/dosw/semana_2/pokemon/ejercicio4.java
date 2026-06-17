package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio4 {
    public static void main(String[] args) {
        Optional<String> pokemonAlfa = pokemons.stream().max(Comparator.comparing(ejercicio1.Pokemon::getLevel)).map(ejercicio1.Pokemon::getName);
        System.out.println ("el pokemon alfa es" + pokemonAlfa);
    }
}