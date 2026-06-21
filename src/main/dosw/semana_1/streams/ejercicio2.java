package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio2 {
    static void numero2(){
        List<String> palabras = List.of("java","stream","api","funional","code","git");
        List<String> resultado = palabras.stream().filter(s -> s.length() == 4).map(String::toUpperCase)
                .sorted().collect(Collectors.toList());
  System.out.println(resultado);

    }
static void main() {
    numero2();
    }
}
