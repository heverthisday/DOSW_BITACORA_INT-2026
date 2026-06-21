package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static class Pokemon{
        String name;
        String type;
        int level;
        boolean evolucion;

        public Pokemon(String name, String type, int level, boolean evolucion) {
            this.name=name;
            this.type=type;
            this.level=level;
            this.evolucion = evolucion;
        }
        public String getName(){return name;}
        public String getType(){return type;}
        public int getLevel(){return level;}
        public boolean getEvolucion(){return evolucion;}
    }

    public static List<Pokemon> pokemons = List.of(
            new Pokemon("Pikachu","Electrico",45,true),
            new Pokemon("Charmarder","Fuego",62,true),
            new Pokemon("Squirtle","Agua",38,true),
            new Pokemon("Vulpix","Fuego",81,true),
            new Pokemon("Bulbasaur","Planta",55,true),
            new Pokemon("Flareon","Fuego",29,true)
    );

    public static void main(String[] args){

        List<String> tipoFuego = pokemons.stream().filter(p ->p.getType().equals("Fuego")).map(Pokemon::getName).collect(Collectors.toList());

        System.out.println(tipoFuego);
    }

}
