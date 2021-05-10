package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class TypesResponse(
    @SerializedName("slot") val slot: Int,
    @SerializedName("type") val types: PokemonNameUrlPairResponse
) {
    companion object {
        fun mock() = TypesResponse(
            slot = 1,
            types = PokemonNameUrlPairResponse(
                name = "water",
                url = "https://pokeapi.co/api/v2/type/11/"
            )
        )
    }
}