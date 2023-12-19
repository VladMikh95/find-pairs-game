package ml.vladmikh.projects.find_pairs_game.ui.menu_scene

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentMenuSceneBinding

class MenuSceneFragment : Fragment() {

    private lateinit var binding: FragmentMenuSceneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding  = FragmentMenuSceneBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}