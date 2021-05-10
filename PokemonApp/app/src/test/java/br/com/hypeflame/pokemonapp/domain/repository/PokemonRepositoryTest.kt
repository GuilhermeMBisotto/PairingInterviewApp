package br.com.hypeflame.pokemonapp.domain.repository

import br.com.hypeflame.pokemonapp.domain.repository.impl.PokemonRepositoryImpl
import org.junit.Before
import org.junit.Test

class PokemonRepositoryTest {

    private lateinit var repository: PokemonRepository

    @Before
    fun setup() {
        repository = PokemonRepositoryImpl()
    }

    @Test
    fun `call getPokemonsList, passing limit and offset, then return success with data`() {

    }

    @Test
    fun `call getPokemonsList, not passing limit and offset, then return success with data`() {

    }

    @Test
    fun `call getPokemonsList, passing limit and offset, then return error without data`() {

    }

    @Test
    fun `call getPokemonsList, not passing limit and offset, then return error without data`() {

    }
}