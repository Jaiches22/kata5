package software.ulpgc.pokeapi.io;

import software.ulpgc.pokeapi.contracts.PokemonGetResponse;
import software.ulpgc.pokeapi.model.Pokemon;

public class PokemonApiAdapter {
    public Pokemon adapt(PokemonGetResponse response) {
        return new Pokemon(
                response.id(),
                response.name(),
                response.base_experience(),
                response.height(),
                response.weight()
        );
    }
}
