package br.com.hypeflame.pokemonapp.data.model

data class PokemonData(
    val pokemonName: String,
    val pokemonUrlInfos: String
) {
    companion object {
        fun mock() = PokemonData(
            pokemonName = "squirtle",
            pokemonUrlInfos = "https://pokeapi.co/api/v2/pokemon/7"
        )

        fun mockList() = listOf(
            PokemonData(
                pokemonName = "squirtle",
                pokemonUrlInfos = "https://pokeapi.co/api/v2/pokemon/7"
            ),
            PokemonData(
                pokemonName = "bulbasaur",
                pokemonUrlInfos = "https://pokeapi.co/api/v2/pokemon/1"
            )
        )
    }
}