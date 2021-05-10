package br.com.hypeflame.pokemonapp.feature.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import br.com.hypeflame.pokemonapp.databinding.FragmentPokemonListBinding

class PokemonListFragment : Fragment() {

    lateinit var binding: FragmentPokemonListBinding
    lateinit var viewModel: PokemonListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        viewModel = provideViewModel().also { it.getPokemons() }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.pokemons.observe(viewLifecycleOwner) {
            configureRecyclerView(it)
        }
    }

    private fun configureRecyclerView(pokemonViewModel: List<PokemonItemViewModel>) =
        pokemonViewModel.map {
            binding.linearLayoutContent.addView(TextView(context).apply {
                text = it.pokemonName
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).also {
                    it.setMargins(MARGIN, MARGIN, MARGIN, MARGIN)
                }

                setOnClickListener {
                    navigateToPokemonDetail(ID)
                }
            })
        }

    private fun navigateToPokemonDetail(id: Int) =
        PokemonListFragmentDirections.actionPokemonListFragmentToPokemonDetailFragment(id).also {
            findNavController().navigate(it)
        }

    private fun provideViewModel() =
        ViewModelProviders.of(this).get(PokemonListViewModel::class.java)

    companion object {
        private const val MARGIN = 48
        private const val ID = 1
    }
}