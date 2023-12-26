package ml.vladmikh.projects.find_pairs_game.ui.game_scene

import android.os.Bundle
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

    private var isChosenItem = false
    private var chosenItem: ImageView? = null
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
         val fieldItems = viewModel.fieldItems
            setImage(binding.fieldItem1, fieldItems.get(0))
            setImage(binding.fieldItem2, fieldItems.get(1))
            setImage(binding.fieldItem3, fieldItems.get(2))
            setImage(binding.fieldItem4, fieldItems.get(3))
            setImage(binding.fieldItem5, fieldItems.get(4))
            setImage(binding.fieldItem6, fieldItems.get(5))
            setImage(binding.fieldItem7, fieldItems.get(6))
            setImage(binding.fieldItem8, fieldItems.get(7))
            setImage(binding.fieldItem9, fieldItems.get(8))
            setImage(binding.fieldItem10, fieldItems.get(9))
            setImage(binding.fieldItem11, fieldItems.get(10))
            setImage(binding.fieldItem12, fieldItems.get(11))
            setImage(binding.fieldItem13, fieldItems.get(12))
            setImage(binding.fieldItem14, fieldItems.get(13))
            setImage(binding.fieldItem15, fieldItems.get(14))
            setImage(binding.fieldItem16, fieldItems.get(15))
            setImage(binding.fieldItem17, fieldItems.get(16))
            setImage(binding.fieldItem18, fieldItems.get(17))
            setImage(binding.fieldItem19, fieldItems.get(18))
            setImage(binding.fieldItem20, fieldItems.get(19))


        binding.fieldItem1.setOnClickListener{
            chooseItem(binding.fieldItem1)
        }

        binding.fieldItem2.setOnClickListener{
            chooseItem(binding.fieldItem2)
        }

        binding.fieldItem3.setOnClickListener{
            chooseItem(binding.fieldItem3)
        }

        binding.fieldItem4.setOnClickListener{
            chooseItem(binding.fieldItem4)
        }

        binding.fieldItem5.setOnClickListener{
            chooseItem(binding.fieldItem5)
        }

        binding.fieldItem6.setOnClickListener{
            chooseItem(binding.fieldItem6)
        }

        binding.fieldItem7.setOnClickListener{
            chooseItem(binding.fieldItem7)
        }

        binding.fieldItem8.setOnClickListener{
            chooseItem(binding.fieldItem8)
        }

        binding.fieldItem9.setOnClickListener{
            chooseItem(binding.fieldItem9)
        }

        binding.fieldItem10.setOnClickListener{
            chooseItem(binding.fieldItem10)
        }

        binding.fieldItem11.setOnClickListener{
            chooseItem(binding.fieldItem11)
        }

        binding.fieldItem12.setOnClickListener{
            chooseItem(binding.fieldItem12)
        }

        binding.fieldItem13.setOnClickListener{
            chooseItem(binding.fieldItem13)
        }

        binding.fieldItem14.setOnClickListener{
            chooseItem(binding.fieldItem14)
        }

        binding.fieldItem15.setOnClickListener{
            chooseItem(binding.fieldItem15)
        }

        binding.fieldItem16.setOnClickListener{
            chooseItem(binding.fieldItem16)
        }

        binding.fieldItem17.setOnClickListener{
            chooseItem(binding.fieldItem17)
        }
        binding.fieldItem18.setOnClickListener{
            chooseItem(binding.fieldItem18)
        }

        binding.fieldItem19.setOnClickListener{
            chooseItem(binding.fieldItem19)
        }

        binding.fieldItem20.setOnClickListener{
            chooseItem(binding.fieldItem20)
        }


    }


    private fun setImage(imageView: ImageView, itemValue: Int) {

        when(itemValue) {
            1 -> {
                imageView.setImageResource(R.drawable.crystal1)
                imageView.tag = 1
            }
            2 -> {
                imageView.setImageResource(R.drawable.crystal_2)
                imageView.tag = 2
            }
            3 -> {
                imageView.setImageResource(R.drawable.crystal_3)
                imageView.tag = 3
            }
            4 -> {
                imageView.setImageResource(R.drawable.crystal_4)
                imageView.tag = 4
            }
            5 -> {
                imageView.setImageResource(R.drawable.crystal_5)
                imageView.tag = 5
            }
            6 -> {
                imageView.setImageResource(R.drawable.crystal_6)
                imageView.tag = 6
            }
            7 -> {
                imageView.setImageResource(R.drawable.crystal_7)
                imageView.tag = 7
            }
            8 -> {
                imageView.setImageResource(R.drawable.crystal_8)
                imageView.tag = 8
            }
            9 -> {
                imageView.setImageResource(R.drawable.crystal_9)
                imageView.tag = 9
            }
            10 -> {
                imageView.setImageResource(R.drawable.crystal_10)
                imageView.tag = 10
            }


        }
    }

    //Метод устанавливает цвет выбранного элемента
    private fun chooseItem(imageView : ImageView) {

        if (isChosenItem) {
            if (imageView == chosenItem) {
                return


            } else {
                if (imageView.drawable == null) {
                    isChosenItem = false
                    chosenItem?.setBackgroundResource(R.drawable.timer_background)
                    chosenItem = null
                } else {
                    if (imageView.tag == chosenItem?.tag) {
                        isChosenItem = false
                        imageView.setImageDrawable(null)
                        chosenItem?.setImageDrawable(null)
                        chosenItem?.setBackgroundResource(R.drawable.timer_background)
                        chosenItem = null
                    } else {
                        isChosenItem = false
                        chosenItem?.setBackgroundResource(R.drawable.timer_background)
                        chosenItem = null
                    }
                }
            }

        } else {
            if (imageView.getDrawable() != null) {
                chosenItem = imageView
                chosenItem!!.setBackgroundResource(R.drawable.chosen_item)
                isChosenItem = true
            }
        }
    }

}