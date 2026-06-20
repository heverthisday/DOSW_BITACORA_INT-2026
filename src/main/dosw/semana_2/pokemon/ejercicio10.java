package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio10 {
    public static void main(String[] args) {
        List <String> pokemones = pokemons.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(pokemones);
    }

}
