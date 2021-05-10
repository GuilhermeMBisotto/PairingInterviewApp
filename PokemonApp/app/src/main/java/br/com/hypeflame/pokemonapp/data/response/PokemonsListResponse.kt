package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class PokemonsListResponse(
    @SerializedName("results") val pokemons: List<PokemonNameUrlPairResponse>
) {
    companion object {
        fun mock() = PokemonsListResponse(
            pokemons = listOf(
                PokemonNameUrlPairResponse(
                    name = "squirtle",
                    url = "https://pokeapi.co/api/v2/pokemon/7"
                ),
                PokemonNameUrlPairResponse(
                    name = "bulbasaur",
                    url = "https://pokeapi.co/api/v2/pokemon/1"
                )
            )
        )
    }
}