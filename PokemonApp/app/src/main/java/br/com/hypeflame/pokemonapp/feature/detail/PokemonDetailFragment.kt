package br.com.hypeflame.pokemonapp.feature.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.com.hypeflame.pokemonapp.R
import br.com.hypeflame.pokemonapp.usecase.GetPokemonDetailByIDUseCase

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class PokemonDetailFragment : Fragment() {

    private val args: PokemonDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textview_second).text = "Pokemon ID: ${args.pokemonId}"

        lifecycleScope.launchWhenResumed {
            val useCase = GetPokemonDetailByIDUseCase()
            val response = useCase.invoke(args.pokemonId)

            Toast.makeText(requireContext(), response.toString(), Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_PokemonDetailFragment_to_PokemonListFragment)
        }
    }
}