package br.com.hypeflame.pokemonapp.usecase

import org.junit.Before
import org.junit.Test

class GetPokemonDetailByIDUseCaseTest {

    private lateinit var useCase: GetPokemonDetailByIDUseCase

    @Before
    fun setup() {
        useCase = GetPokemonDetailByIDUseCase()
    }

    @Test
    fun `invoke use case, then return successful pokemon obj`() {

    }

    @Test
    fun `invoke use case, then return an error`() {

    }
}