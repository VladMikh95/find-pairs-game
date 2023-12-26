package ml.vladmikh.projects.find_pairs_game.ui.game_scene

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants.COUNT_PAIRS

class GameSceneViewModel: ViewModel() {

    private var numberOfGuessedPairs = 0

    private var _fieldItems = ArrayList<Int>()
    val fieldItems: ArrayList<Int> get() = _fieldItems



    init {

        numberOfGuessedPairs = 0

        _fieldItems = getListRandomPositions()

    }


    //Метод возвращает список рандомных чисел
    fun getListRandomPositions(): ArrayList<Int> {
        val list = ArrayList<Int>()

        //Создаем список в котором содержатся числа от 1 и до числа пар элементов на доске
        //Каждое число добавляется дважды в список

        for (i in 1..COUNT_PAIRS) {
            list.add(i)
            list.add(i)
        }

        //Перемешиваем числа в списке
        list.shuffle()
        return list
    }
}