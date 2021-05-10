package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class AbilitiesResponse(
    @SerializedName("ability") val abilities: PokemonNameUrlPairResponse
) {
    companion object {
        fun mock() = AbilitiesResponse(
            abilities = PokemonNameUrlPairResponse(
                name = "torrent",
                url = "https://pokeapi.co/api/v2/ability/67/"
            )
        )
    }
}