package br.com.hypeflame.pokemonapp.usecase

import br.com.hypeflame.pokemonapp.data.model.PokemonData
import br.com.hypeflame.pokemonapp.domain.repository.PokemonRepository
import br.com.hypeflame.pokemonapp.domain.repository.impl.PokemonRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetPokemonsListUseCase {

    private val repo: PokemonRepository = PokemonRepositoryImpl()

    suspend operator fun invoke(limit: Int? = null, offset: Int? = null): List<PokemonData> =
        withContext(Dispatchers.IO) {
            repo.getPokemonsList(limit, offset)
        }
}