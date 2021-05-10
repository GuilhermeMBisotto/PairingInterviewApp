package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class MovesResponse(
    @SerializedName("move") val moves: PokemonNameUrlPairResponse
) {
    companion object {
        fun mock() = MovesResponse(
            moves = PokemonNameUrlPairResponse(
                name = "mega-punch",
                url = "https://pokeapi.co/api/v2/move/5/"
            )
        )
    }
}