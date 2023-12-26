package ml.vladmikh.projects.find_pairs_game.ui.end_game_popup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentEndGamePopupBinding

class EndGamePopupFragment : Fragment() {

    private lateinit var binding : FragmentEndGamePopupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEndGamePopupBinding.inflate(inflater)
        return binding.root
    }

}