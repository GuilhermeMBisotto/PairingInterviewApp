package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class ImagesSpritesResponse(
    @SerializedName("front_default") val frontDefault: String = ""
) {
    companion object {
        fun mock() = ImagesSpritesResponse(
            frontDefault = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png"
        )
    }
}