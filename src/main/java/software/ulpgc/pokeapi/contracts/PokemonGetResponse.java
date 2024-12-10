package software.ulpgc.pokeapi.contracts;

public record PokemonGetResponse(
        int id,
        String name,
        int base_experience,
        int height,
        int weight
) {
}
