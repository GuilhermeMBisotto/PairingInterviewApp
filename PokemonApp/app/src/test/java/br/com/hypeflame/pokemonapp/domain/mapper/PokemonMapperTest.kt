package br.com.hypeflame.pokemonapp.domain.mapper

import br.com.hypeflame.pokemonapp.data.model.Pokemon
import br.com.hypeflame.pokemonapp.data.model.PokemonData
import br.com.hypeflame.pokemonapp.data.response.PokemonResponse
import br.com.hypeflame.pokemonapp.data.response.PokemonsListResponse
import org.junit.Assert
import org.junit.Test

class PokemonMapperTest {

    @Test
    fun `invoke mapper from pokemonListResponse to PokemonData`() {
        val mapped =
            PokemonMapper.pokemonListResponseToPokemonData(PokemonsListResponse.mock().pokemons)

        Assert.assertEquals(mapped, PokemonData.mockList())
    }

    @Test
    fun `invoke mapper from pokemonDetail to Pokemon`() {
        val mapped = PokemonMapper.pokemonDetailToResponseToPokemon(PokemonResponse.mock())

        Assert.assertEquals(mapped, Pokemon.mock())
    }
}