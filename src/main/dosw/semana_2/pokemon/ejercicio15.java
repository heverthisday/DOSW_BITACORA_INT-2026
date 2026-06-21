package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio15 {

    public static void main(String[] args) {

        Optional<String> mejores;
        mejores = entrenadores.stream().max(Comparator.comparing(Entrenador::getNombre)).
                map(entrenadores -> entrenadores.getNombre() + ":" + entrenadores.getMedallas());
        System.out.println(mejores);
    }
}
