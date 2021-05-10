package br.com.hypeflame.pokemonapp.feature.list

import androidx.lifecycle.ViewModel

class PokemonItemViewModel(
    val pokemonName: String,
    val pokemonUrl: String
) : ViewModel()