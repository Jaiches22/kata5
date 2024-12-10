package software.ulpgc.pokeapi.io;

import software.ulpgc.pokeapi.model.Pokemon;

public class PokemonLoader {
    private final PokemonApiReader reader;
    private final PokemonJsonDeserializer deserializer;
    private final PokemonApiAdapter adapter;

    public PokemonLoader(PokemonApiReader reader, PokemonJsonDeserializer deserializer, PokemonApiAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Pokemon get() {
        String json = reader.read();
        var response = deserializer.deserialize(json);
        return adapter.adapt(response);
    }
}
