package cl.springmachine.custom.client.pokeapi;

import cl.springmachine.custom.service.pokemon.dto.PokemonDTO;

public interface PokeApiClient {

    PokemonDTO getInfo(String name);
}
