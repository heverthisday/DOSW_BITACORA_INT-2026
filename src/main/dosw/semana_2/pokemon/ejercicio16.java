package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio16 {
    public static void main(String[] args) {
        List <String> mejores = entrenadores.stream().filter(e-> e.getMedallas() > 5).

                map(e-> e.getNombre()).collect(Collectors.toList());

        System.out.println(mejores);

    }
}
