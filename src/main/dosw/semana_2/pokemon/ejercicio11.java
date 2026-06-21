package main.dosw.semana_2.pokemon;

import java.util.*;

import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio11 {
    static void main() {
        OptionalDouble promedio_poder = pokemons.stream().mapToDouble(pokemon::getPower).average();
        System.out.println("promedio_poder : " + promedio_poder);
    }
}
