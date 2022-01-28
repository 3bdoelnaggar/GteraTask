package com.gtera.gteratask.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gtera.gteratask.presentation.StateViewModel

class HomeViewModel : StateViewModel<HomeState>() {
    init {
        _stateLiveData.value = HomeState(
            "Hi Gtera Task Evaluator",
            listOf(UiShoppingItem("MACBOOK M1 Max"), UiShoppingItem("Pixel 6"))
        )
    }

}

data class HomeState(val greeting: String, val shoppingList: List<UiShoppingItem>)
data class UiShoppingItem(val name: String)
