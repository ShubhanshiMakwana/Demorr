package viewmodellivedata

import androidx.lifecycle.ViewModel

class TestViewModel:ViewModel() {
    var number = 0

    fun addOne() {
        number++
    }
}


