package main.dosw.semana_2.pokemon;
import java.util.*;

public class pokemon {

    private String name;
    private String type;
    private int id;
    private int level;
    private double power;
    private String region;
    private boolean legendario;


    public pokemon(String name, String type, int id, int level, double power, String region, boolean legendario) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.level = level;
        this.power = power;
        this.region = region;
        this.legendario = legendario;
    }
    public static List<pokemon> pokemons = List.of(
            new pokemon("Pikachu", "Electrico", 25, 45, 55.0, "Kanto", false),
            new pokemon("Charizard", "Fuego", 6, 78, 84.0, "Kanto", false),
            new pokemon("Blastoise", "Agua", 9, 77, 83.0, "Kanto", false),
            new pokemon("Venusaur", "Planta", 3, 76, 582.0, "Kanto", false),
            new pokemon("Gengar", "Fantasma", 94, 70, 65.0, "Kanto", false),
            new pokemon("Dragonite", "Dragon", 149, 80, 134.0, "Kanto", false),
            new pokemon("Mewtwo", "Psíquico", 150, 90, 110.0, "Kanto", true),
            new pokemon("Lucario", "Lucha", 448, 72, 110.0, "Sinnoh", false),
            new pokemon("Greninja", "Agua", 658, 75, 95.0, "Kalos", false),
            new pokemon("Rayquaza", "Dragon", 384, 85, 150.0, "Hoenn", true)
    );


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public double getPower() {
        return power;
    }

    public String getRegion() {
        return region;
    }

    public boolean isLegendario() {
        return legendario;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLegendario(boolean legendario) {
        this.legendario = legendario;
    }
}