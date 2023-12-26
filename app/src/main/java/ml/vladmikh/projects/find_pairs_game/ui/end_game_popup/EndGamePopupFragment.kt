package ml.vladmikh.projects.find_pairs_game.ui.end_game_popup

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentEndGamePopupBinding
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants.PREFS_FILENAME
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants.PREF_REWARD

class EndGamePopupFragment : Fragment() {

    private val args: EndGamePopupFragmentArgs by navArgs()

    private lateinit var binding : FragmentEndGamePopupBinding

    var prefs: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        prefs = this.getActivity()?.getSharedPreferences(PREFS_FILENAME, 0)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEndGamePopupBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.textViewReward.text = args.reward.toString()

        var reward = prefs?.getInt(PREF_REWARD, 0)
        reward = reward?.plus(args.reward)
        val editor = prefs!!.edit()
        reward?.let { editor.putInt(PREF_REWARD, it) }
        editor.apply()

        binding.playAgain.setOnClickListener {
            findNavController().navigate(R.id.action_endGamePopupFragment_to_gameSceneFragment)
        }
    }

}