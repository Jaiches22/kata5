package software.ulpgc;

import software.ulpgc.pokeapi.io.PokemonApiAdapter;
import software.ulpgc.pokeapi.io.PokemonApiReader;
import software.ulpgc.pokeapi.io.PokemonJsonDeserializer;
import software.ulpgc.pokeapi.io.PokemonLoader;

public class Main {
    public static void main(String[] args) {
        PokemonLoader loader = new PokemonLoader(
                new PokemonApiReader(),
                new PokemonJsonDeserializer(),
                new PokemonApiAdapter()
        );

        for (int i = 0; i < 10; i++) {
            System.out.println(loader.get());
        }
    }
}
