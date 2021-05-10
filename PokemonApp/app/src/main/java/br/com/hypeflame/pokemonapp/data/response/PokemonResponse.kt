package br.com.hypeflame.pokemonapp.data.response

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("height") val height: Int,
    @SerializedName("weight") val weight: Int,
    @SerializedName("base_experience") val baseExperience: Int,
    @SerializedName("name") val name: String,
    @SerializedName("types") val types: List<TypesResponse>,
    @SerializedName("moves") val moves: List<MovesResponse>,
    @SerializedName("abilities") val abilities: List<AbilitiesResponse>,
    @SerializedName("sprites") val sprites: SpritesResponse
) {
    companion object {
        fun mock() = PokemonResponse(
            id = 7,
            height = 5,
            weight = 90,
            baseExperience = 63,
            name = "squirtle",
            abilities = listOf(AbilitiesResponse.mock()),
            moves = listOf(MovesResponse.mock()),
            types = listOf(TypesResponse.mock()),
            sprites = SpritesResponse.mock()
        )
    }
}