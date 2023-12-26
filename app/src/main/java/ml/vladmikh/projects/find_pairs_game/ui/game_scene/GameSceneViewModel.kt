package ml.vladmikh.projects.find_pairs_game.ui.game_scene

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ml.vladmikh.projects.find_pairs_game.utils.AppConstants.COUNT_PAIRS

class GameSceneViewModel: ViewModel() {

    private var numberOfGuessedPairs = 0

    private var fieldItems = ArrayList<Int>()

    private var _itemField1 = MutableLiveData<Int>()
    val itemField1: LiveData<Int> get() = _itemField1

    private var _itemField2 = MutableLiveData<Int>()
    val itemField2: LiveData<Int> get() = _itemField2

    private var _itemField3 = MutableLiveData<Int>()
    val itemField3: LiveData<Int> get() = _itemField3

    private var _itemField4 = MutableLiveData<Int>()
    val itemField4: LiveData<Int> get() = _itemField4

    private var _itemField5 = MutableLiveData<Int>()
    val itemField5: LiveData<Int> get() = _itemField5

    private var _itemField6 = MutableLiveData<Int>()
    val itemField6: LiveData<Int> get() = _itemField6

    private var _itemField7 = MutableLiveData<Int>()
    val itemField7: LiveData<Int> get() = _itemField7

    private var _itemField8 = MutableLiveData<Int>()
    val itemField8: LiveData<Int> get() = _itemField8

    private var _itemField9 = MutableLiveData<Int>()
    val itemField9: LiveData<Int> get() = _itemField9

    private var _itemField10 = MutableLiveData<Int>()
    val itemField10: LiveData<Int> get() = _itemField10

    private var _itemField11 = MutableLiveData<Int>()
    val itemField11: LiveData<Int> get() = _itemField11

    private var _itemField12 = MutableLiveData<Int>()
    val itemField12: LiveData<Int> get() = _itemField12

    private var _itemField13 = MutableLiveData<Int>()
    val itemField13: LiveData<Int> get() = _itemField13

    private var _itemField14 = MutableLiveData<Int>()
    val itemField14: LiveData<Int> get() = _itemField14

    private var _itemField15 = MutableLiveData<Int>()
    val itemField15: LiveData<Int> get() = _itemField15

    private var _itemField16 = MutableLiveData<Int>()
    val itemField16: LiveData<Int> get() = _itemField16

    private var _itemField17 = MutableLiveData<Int>()
    val itemField17: LiveData<Int> get() = _itemField17

    private var _itemField18 = MutableLiveData<Int>()
    val itemField18: LiveData<Int> get() = _itemField18

    private var _itemField19 = MutableLiveData<Int>()
    val itemField19: LiveData<Int> get() = _itemField19

    private var _itemField20 = MutableLiveData<Int>()
    val itemField20: LiveData<Int> get() = _itemField20


    init {

        numberOfGuessedPairs = 0

        val list = getListRandomPositions()
        Log.i("abc", list.toString())

        //Присваиваем всем переменным типа itemField значения из списка list
        _itemField1.value = list.get(0)
        _itemField2.value = list.get(1)
        _itemField3.value = list.get(2)
        _itemField4.value = list.get(3)
        _itemField5.value = list.get(4)
        _itemField6.value = list.get(5)
        _itemField7.value = list.get(6)
        _itemField8.value = list.get(7)
        _itemField9.value = list.get(8)
        _itemField10.value = list.get(9)
        _itemField11.value = list.get(10)
        _itemField12.value = list.get(11)
        _itemField13.value = list.get(12)
        _itemField14.value = list.get(13)
        _itemField15.value = list.get(14)
        _itemField16.value = list.get(15)
        _itemField17.value = list.get(16)
        _itemField18.value = list.get(17)
        _itemField19.value = list.get(18)
        _itemField20.value = list.get(19)

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