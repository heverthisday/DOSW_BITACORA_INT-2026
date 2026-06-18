package main.dosw.semana_2.pokemon;

public class Pokemon {

    private String name;
    private String type;
    private int id;
    private int level;
    private double power ;
    private String region;
    private boolean legendario;

    public Pokemon(String name, String type, int id, int level, double power, String region, boolean legendario) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.level = level;
        this.power = power;
        this.region = region;
        this.legendario = legendario;
    }

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

    // 🔹 Setters
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

