package software.ulpgc.pokeapi.model;

public class Pokemon {
    private final int id;
    private final String name;
    private final int baseExperience;
    private final int height;
    private final int weight;

    public Pokemon(int id, String name, int baseExperience, int height, int weight) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
