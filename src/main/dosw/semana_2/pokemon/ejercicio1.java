package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static class Pokemon{
        String name;
        String type;

        public Pokemon(String name, String type){
            this.name=name;
            this.type=type;
        }
        public String getName(){return name;}
        public String getType(){return type;}
    }

    public static List<Pokemon> pokemons = List.of(
            new Pokemon("Pikachu","Electrico"),
            new Pokemon("Charmarder","Fuego"),
            new Pokemon("Squirtle","Agua"),
            new Pokemon("Vulpix","Fuego"),
            new Pokemon("Bulbasaur","Planta"),
            new Pokemon("Flareon","Fuego")
    );

    public static void main(String[] args){

        List<String> tipoFuego = pokemons.stream().filter(p ->p.getType().equals("Fuego")).map(Pokemon::getName).collect(Collectors.toList());

        System.out.println(tipoFuego);
    }

}
