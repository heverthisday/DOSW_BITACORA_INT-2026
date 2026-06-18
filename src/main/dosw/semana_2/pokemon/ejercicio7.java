package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio7 {

    public static void main(String[] args) {
        List <String> orden = pokemons.stream().map(p -> p.getName()).sorted().collect(Collectors.toList());
        System.out.println(orden);
    }

}
