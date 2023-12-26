package ml.vladmikh.projects.find_pairs_game.ui.menu_scene

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentMenuSceneBinding
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants

class MenuSceneFragment : Fragment() {

    private lateinit var binding: FragmentMenuSceneBinding

    var prefs: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        prefs = this.getActivity()?.getSharedPreferences(AppConstants.PREFS_FILENAME, 0)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding  = FragmentMenuSceneBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.textViewMoney.text = prefs?.getInt(AppConstants.PREF_REWARD, 0).toString()

        binding.buttonPlay.setOnClickListener {
            findNavController().navigate(R.id.action_menuSceneFragment_to_gameSceneFragment)
        }
    }

}