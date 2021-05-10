package br.com.hypeflame.pokemonapp.domain.mapper

import br.com.hypeflame.pokemonapp.data.model.*
import br.com.hypeflame.pokemonapp.data.response.PokemonNameUrlPairResponse
import br.com.hypeflame.pokemonapp.data.response.PokemonResponse

object PokemonMapper {

    fun pokemonListResponseToPokemonData(pokemons: List<PokemonNameUrlPairResponse>) =
        pokemons.map { it.toPokemonData() }

    private fun PokemonNameUrlPairResponse.toPokemonData() = PokemonData(
        pokemonName = name,
        pokemonUrlInfos = url
    )

    fun pokemonDetailToResponseToPokemon(pokemon: PokemonResponse) =
        Pokemon(
            id = pokemon.id,
            weight = pokemon.weight,
            height = pokemon.height,
            baseExperience = pokemon.baseExperience,
            name = pokemon.name,
            photoDefault = pokemon.sprites.default,
            officialArtwork = pokemon.sprites.otherImages.officialArtwork?.frontDefault.orEmpty(),
            photoDreamWorld = pokemon.sprites.otherImages.dreamWorld?.frontDefault.orEmpty(),
            types = pokemon.types.map {
                PokemonTypes(
                    slot = it.slot,
                    type = it.types.name,
                    typeDetailUrl = it.types.url
                )
            },
            moves = pokemon.moves.map {
                PokemonMoves(
                    move = it.moves.name,
                    moveDetailUrl = it.moves.url
                )
            },
            abilities = pokemon.abilities.map {
                PokemonAbilities(
                    ability = it.abilities.name,
                    it.abilities.url
                )
            }
        )
}