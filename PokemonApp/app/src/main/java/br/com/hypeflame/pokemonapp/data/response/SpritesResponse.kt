package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class SpritesResponse(
    @SerializedName("front_default") val default: String,
    @SerializedName("other") val otherImages: OtherSpritesResponse
) {
    companion object {
        fun mock() = SpritesResponse(
            default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
            otherImages = OtherSpritesResponse.mock()
        )
    }
}