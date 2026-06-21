package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio12 {

    public static void main(String[] args) {
    Optional<String> pokemon_poderoso = pokemons.stream().max(Comparator.comparing(pokemon::getName)).
            map(pokemon -> pokemon.getName() + ":" + pokemon.getPower());
    System.out.println(pokemon_poderoso);
    }
}
