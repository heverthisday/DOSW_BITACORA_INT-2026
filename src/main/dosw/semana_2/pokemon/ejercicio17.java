package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio17 {
    public static void main(String[] args) {

        Optional<Entrenador> mejor = entrenadores.stream()
                .max(Comparator.comparingDouble(e ->
                        e.getEquipo()
                                .stream()
                                .mapToDouble(pokemon::getPower)
                                .sum()
                ));

        String resultado = mejor
                .map(e -> {
                    double total = e.getEquipo()
                            .stream()
                            .mapToDouble(pokemon::getPower)
                            .sum();
                    return "Entrenador más poderoso: " + e.getNombre()
                            + "\nPoder acumulado del equipo: " + total;
                })
                .orElse("No hay entrenadores");

        System.out.println(resultado);
    }
}