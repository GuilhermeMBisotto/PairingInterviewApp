package br.com.hypeflame.pokemonapp.domain.repository

import br.com.hypeflame.pokemonapp.data.model.Pokemon
import br.com.hypeflame.pokemonapp.data.model.PokemonData

interface PokemonRepository {
    suspend fun getPokemonsList(limit: Int?, offset: Int?): List<PokemonData>
    suspend fun getPokemonByID(id: Int): Pokemon
}