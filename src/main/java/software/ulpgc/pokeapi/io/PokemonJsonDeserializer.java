package software.ulpgc.pokeapi.io;

import com.google.gson.Gson;
import software.ulpgc.pokeapi.contracts.PokemonGetResponse;

public class PokemonJsonDeserializer {
    public PokemonGetResponse deserialize(String json) {
        return new Gson().fromJson(json, PokemonGetResponse.class);
    }
}
