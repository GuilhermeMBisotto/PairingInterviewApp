package br.com.hypeflame.pokemonapp.domain.repository.impl

import br.com.hypeflame.pokemonapp.data.api.PokemonAPI
import br.com.hypeflame.pokemonapp.data.response.PokemonResponse
import br.com.hypeflame.pokemonapp.data.response.PokemonsListResponse
import br.com.hypeflame.pokemonapp.domain.mapper.PokemonMapper
import br.com.hypeflame.pokemonapp.domain.repository.PokemonRepository

class PokemonRepositoryImpl : PokemonRepository {

    private var api: PokemonAPI.Api = PokemonAPI().getPokemonApi()

    override suspend fun getPokemonsList(limit: Int?, offset: Int?) =
        PokemonMapper.pokemonListResponseToPokemonData(
            PokemonsListResponse.mock().pokemons
        )

    override suspend fun getPokemonByID(id: Int) =
        PokemonMapper.pokemonDetailToResponseToPokemon(
            PokemonResponse.mock()
        )

    companion object {
        private const val LIMIT: Int = 151
        private const val OFFSET: Int = 0
    }
}