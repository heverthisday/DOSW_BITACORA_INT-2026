package main.dosw.semana_2.pokemon;


import java.util.*;

public class Entrenador {

    private Long id;
    private String nombre;
    private int medallas;
    private List<pokemon> equipo;


    public Entrenador(Long id, String nombre, int medallas, List<pokemon> equipo) {
        this.id = id;
        this.nombre = nombre;
        this.medallas = medallas;
        this.equipo = equipo;
    }


    public static List<Entrenador> entrenadores = List.of(

            new Entrenador(1L, "Ash", 8,
                    List.of(
                            pokemon.pokemons.get(0),
                            pokemon.pokemons.get(1)
                    )
            ),

            new Entrenador(2L, "Misty", 5,
                    List.of(
                            pokemon.pokemons.get(2),
                            pokemon.pokemons.get(8)
                    )
            ),

            new Entrenador(3L, "Brock", 6,
                    List.of(
                            pokemon.pokemons.get(3),
                            pokemon.pokemons.get(4)
                    )
            ),

            new Entrenador(4L, "Cynthia", 10,
                    List.of(
                            pokemon.pokemons.get(5),
                            pokemon.pokemons.get(9)
                    )
            )
    );


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public List<pokemon> getEquipo() {
        return equipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public void setEquipo(List<pokemon> equipo) {
        this.equipo = equipo;
    }
}
