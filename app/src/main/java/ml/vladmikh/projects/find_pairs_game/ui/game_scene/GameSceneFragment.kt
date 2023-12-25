package ml.vladmikh.projects.find_pairs_game.ui.game_scene

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentGameSceneBinding

class GameSceneFragment : Fragment() {

    private lateinit var binding: FragmentGameSceneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGameSceneBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.chronometer.start()
    }

}