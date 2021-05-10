package br.com.hypeflame.pokemonapp.data.api

import br.com.hypeflame.pokemonapp.data.response.PokemonResponse
import br.com.hypeflame.pokemonapp.data.response.PokemonsListResponse
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

class PokemonAPI {

    companion object {
        private const val BASE_URL = "https://pokeapi.co/api/v2/"
        private const val PATH_GET_LIST = "pokemon"
        private const val PATH_GET_BY_ID = "pokemon/{id}"
    }

    interface Api {

        @GET(PATH_GET_LIST)
        suspend fun getPokemonList(
            @Query("limit") limit: Int,
            @Query("offset") offset: Int
        ): PokemonsListResponse

        @GET(PATH_GET_BY_ID)
        suspend fun getPokemonByID(
            @Path("id") id: Int
        ): PokemonResponse
    }

    fun getPokemonApi(): Api = createRetrofit().create(Api::class.java)

    private fun createGson() = Gson()

    private fun createRetrofit() =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(createGson()))
            .baseUrl(BASE_URL)
            .build()
}