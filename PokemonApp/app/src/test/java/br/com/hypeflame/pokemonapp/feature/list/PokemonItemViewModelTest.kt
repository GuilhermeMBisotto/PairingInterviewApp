package br.com.hypeflame.pokemonapp.feature.list

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PokemonItemViewModelTest {

    private lateinit var viewModel: PokemonItemViewModel

    @Before
    fun setup() {
        viewModel = PokemonItemViewModel(
            pokemonName = LABEL_MOCK,
            pokemonUrl = LABEL_MOCK
        )
    }

    @Test
    fun `verify viewModel static data`() {
        Assert.assertEquals(viewModel.pokemonName, LABEL_MOCK)
        Assert.assertEquals(viewModel.pokemonUrl, LABEL_MOCK)
    }

    companion object {
        private const val LABEL_MOCK = "LABEL_MOCK"
    }
}