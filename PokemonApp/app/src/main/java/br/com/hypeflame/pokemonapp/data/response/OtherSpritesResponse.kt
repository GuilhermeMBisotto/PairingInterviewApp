package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class OtherSpritesResponse(
    @SerializedName("dream_world") val dreamWorld: ImagesSpritesResponse?,
    @SerializedName("official-artwork") val officialArtwork: ImagesSpritesResponse?
) {
    companion object {
        fun mock() = OtherSpritesResponse(
            dreamWorld = ImagesSpritesResponse.mock(),
            officialArtwork = ImagesSpritesResponse.mock()
        )
    }
}