package software.ulpgc.pokeapi.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class PokemonApiReader {
    private int currentId = 1;

    public String read() {
        try {
            return fetchPokemonJson(currentId++);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String fetchPokemonJson(int id) throws IOException {
        String url = "https://pokeapi.co/api/v2/pokemon/" + id;
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .header("accept", "application/json")
                .method(Connection.Method.GET)
                .execute();

        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to fetch data for Pokemon with ID " + id);
        }

        return response.body();
    }
}
