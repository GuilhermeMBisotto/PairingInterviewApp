package br.com.hypeflame.pokemonapp.usecase

import br.com.hypeflame.pokemonapp.domain.repository.PokemonRepository
import br.com.hypeflame.pokemonapp.domain.repository.impl.PokemonRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetPokemonDetailByIDUseCase {

    private val repo: PokemonRepository = PokemonRepositoryImpl()

    suspend operator fun invoke(id: Int) = withContext(Dispatchers.IO) {
        repo.getPokemonByID(id)
    }
}