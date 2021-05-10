package br.com.hypeflame.pokemonapp.usecase

import org.junit.Before
import org.junit.Test

class GetPokemonsListUseCaseTest {

    private lateinit var useCase: GetPokemonsListUseCase

    @Before
    fun setup() {
        useCase = GetPokemonsListUseCase()
    }

    @Test
    fun `invoke use case, then return successful pokemons list obj`() {

    }

    @Test
    fun `invoke use case, then return an error`() {

    }
}