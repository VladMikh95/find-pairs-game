package ml.vladmikh.projects.find_pairs_game.ui.game_scene


import androidx.lifecycle.ViewModel
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants.COUNT_PAIRS

class GameSceneViewModel: ViewModel() {

    private var numberOfGuessedPairs = 0

    private var _fieldItems = ArrayList<Int>()
    val fieldItems: ArrayList<Int> get() = _fieldItems

    private var _reward = 0
    val reward: Int get() = _reward



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

    fun addNumberOfGuessedPairs () {
        numberOfGuessedPairs++
    }

    fun isWin(): Boolean {
        return numberOfGuessedPairs == COUNT_PAIRS
    }

    fun calculateRewards(time: Int) {
        var new_reward = AppConstants.MAX_REWARD
        if (time < AppConstants.GAME_TIME_IDEAL) {
            _reward = new_reward
        } else {

            var time_control = AppConstants.GAME_TIME_IDEAL

            while(new_reward > 10) {
                if (time_control < time) {
                    new_reward -= AppConstants.REWARD_STEP
                    time_control += AppConstants.TIME_STEP
                }
            }
            _reward = new_reward
        }
    }
}