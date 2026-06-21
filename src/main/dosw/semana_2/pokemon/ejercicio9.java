package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio9 {
    public static void main(String[] args) {
        List <String> poderes = pokemons.stream().filter(p ->p.getPower() > 500 ).
                map(p ->p.getName()).collect(Collectors.toList());
        System.out.println("Pokemones con poder mas de 500: " + poderes);
    }
}
