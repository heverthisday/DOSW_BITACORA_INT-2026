package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static class Pokemon{
        String name;
        String type;
        int level;

        public Pokemon(String name, String type, int level) {
            this.name=name;
            this.type=type;
            this.level=level;
        }
        public String getName(){return name;}
        public String getType(){return type;}
        public int getLevel(){return level;}
    }

    public static List<Pokemon> pokemons = List.of(
            new Pokemon("Pikachu","Electrico",45),
            new Pokemon("Charmarder","Fuego",62),
            new Pokemon("Squirtle","Agua",38),
            new Pokemon("Vulpix","Fuego",71),
            new Pokemon("Bulbasaur","Planta",55),
            new Pokemon("Flareon","Fuego",29)
    );

    public static void main(String[] args){

        List<String> tipoFuego = pokemons.stream().filter(p ->p.getType().equals("Fuego")).map(Pokemon::getName).collect(Collectors.toList());

        System.out.println(tipoFuego);
    }

}
