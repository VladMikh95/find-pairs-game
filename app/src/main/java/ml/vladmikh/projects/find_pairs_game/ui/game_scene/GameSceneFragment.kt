package ml.vladmikh.projects.find_pairs_game.ui.game_scene

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.viewModels
import ml.vladmikh.projects.find_pairs_game.R
import ml.vladmikh.projects.find_pairs_game.databinding.FragmentGameSceneBinding

class GameSceneFragment : Fragment() {


    private val viewModel: GameSceneViewModel by viewModels()

    //Переменная хранит количество угаданных пар
    private var numberOfGuessedPairs = 0

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

        viewModel.itemField1.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem1, it)
        }

        viewModel.itemField2.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem2, it)
        }

        viewModel.itemField3.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem3, it)
        }

        viewModel.itemField4.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem4, it)
        }

        viewModel.itemField5.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem5, it)
        }

        viewModel.itemField6.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem6, it)
        }

        viewModel.itemField7.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem7, it)
        }

        viewModel.itemField8.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem8, it)
        }

        viewModel.itemField9.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem9, it)
        }

        viewModel.itemField10.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem10, it)
        }

        viewModel.itemField11.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem11, it)
        }

        viewModel.itemField12.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem12, it)
        }

        viewModel.itemField13.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem13, it)
        }

        viewModel.itemField14.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem14, it)
        }

        viewModel.itemField15.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem15, it)
        }

        viewModel.itemField16.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem16, it)
        }

        viewModel.itemField17.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem17, it)
        }

        viewModel.itemField18.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem18, it)
        }

        viewModel.itemField19.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem19, it)
        }

        viewModel.itemField20.observe(viewLifecycleOwner) {
            setImage(binding.fieldItem20, it)
        }


    }


    private fun setImage(imageView: ImageView, itemValue: Int) {

        when(itemValue) {
            1 -> imageView.setImageResource(R.drawable.crystal1)
            2 -> imageView.setImageResource(R.drawable.crystal_2)
            3 -> imageView.setImageResource(R.drawable.crystal_3)
            4 -> imageView.setImageResource(R.drawable.crystal_4)
            5 -> imageView.setImageResource(R.drawable.crystal_5)
            6 -> imageView.setImageResource(R.drawable.crystal_6)
            7 -> imageView.setImageResource(R.drawable.crystal_7)
            8 -> imageView.setImageResource(R.drawable.crystal_8)
            9 -> imageView.setImageResource(R.drawable.crystal_9)
            10 -> imageView.setImageResource(R.drawable.crystal_10)


        }
    }

}