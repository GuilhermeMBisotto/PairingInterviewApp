package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class PokemonNameUrlPairResponse(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) {
    companion object {
        fun mock() = PokemonNameUrlPairResponse(
            name = "name",
            url = "url"
        )
    }
}