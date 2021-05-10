package br.com.hypeflame.pokemonapp.data.model

data class Pokemon(
    val id: Int,
    val height: Int,
    val weight: Int,
    val baseExperience: Int,
    val name: String,
    val photoDefault: String,
    val photoDreamWorld: String,
    val officialArtwork: String,
    val types: List<PokemonTypes>,
    val moves: List<PokemonMoves>,
    val abilities: List<PokemonAbilities>
) {
    companion object {
        fun mock() = Pokemon(
            id = 7,
            height = 5,
            weight = 90,
            baseExperience = 63,
            name = "squirtle",
            photoDefault = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
            photoDreamWorld = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png",
            officialArtwork = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png",
            types = listOf(
                PokemonTypes(
                    slot = 1,
                    type = "water",
                    typeDetailUrl = "https://pokeapi.co/api/v2/type/11/"
                )
            ),
            moves = listOf(
                PokemonMoves(
                    move = "mega-punch",
                    moveDetailUrl = "https://pokeapi.co/api/v2/move/5/"
                )
            ),
            abilities = listOf(
                PokemonAbilities(
                    ability = "torrent",
                    abilityDetailUrl = "https://pokeapi.co/api/v2/ability/67/"
                )
            )
        )
    }
}