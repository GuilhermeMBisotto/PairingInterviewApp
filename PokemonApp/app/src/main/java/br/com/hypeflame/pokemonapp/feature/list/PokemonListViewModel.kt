package br.com.hypeflame.pokemonapp.feature.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.hypeflame.pokemonapp.data.model.PokemonData
import br.com.hypeflame.pokemonapp.data.response.ImagesSpritesResponse
import br.com.hypeflame.pokemonapp.usecase.GetPokemonsListUseCase
import kotlinx.coroutines.launch

class PokemonListViewModel : ViewModel() {

    private val usecase: GetPokemonsListUseCase = GetPokemonsListUseCase()
    val pokemons = MutableLiveData<List<PokemonItemViewModel>>()

    fun getPokemons() {
        viewModelScope.launch {
            pokemons.value = createViewModels(usecase.invoke())
        }
    }

    private fun createViewModels(pokemons: List<PokemonData>) =
        pokemons.map {
            PokemonItemViewModel(
                it.pokemonName,
                ImagesSpritesResponse.mock().frontDefault
            )
        }
}