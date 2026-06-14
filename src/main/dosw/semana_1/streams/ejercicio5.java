package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio5 {

    static class Trasaction {
        String id;
        double amount;
        boolean approved;

        public Trasaction(String id, double amount, boolean approved) {
            this.id = id;
            this.amount = amount;
            this.approved = approved;
        }
    }
    public boolean isAproved (Trasaction trasaction) {
        return trasaction.approved;
    }
    public static List<Trasaction> trasactions = List.of(
            new Trasaction("s12",2365.5, true),
            new Trasaction("s45",25468.5, true),
            new Trasaction("s78",54684.5, true),
            new Trasaction("s89",54654204.2 , true)

    );
    public static  void main (String[] args) {
        boolean existeNoAprobada = trasactions.stream()
                .peek(System.out::println)
                .anyMatch(t -> !t.approved);

        System.out.println(existeNoAprobada);
    }
}
