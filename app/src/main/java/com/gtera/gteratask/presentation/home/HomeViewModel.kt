package com.gtera.gteratask.presentation.home

import com.gtera.gteratask.presentation.StateViewModel
import com.gtera.gteratask.presentation.shared.model.UiShoppingItem

class HomeViewModel : StateViewModel<HomeState>() {
    init {
        _stateLiveData.value = HomeState(
            "Hi Gtera Task Evaluator",
            listOf(UiShoppingItem("MACBOOK M1 Max"), UiShoppingItem("Pixel 6"))
        )
    }

}

data class HomeState(val greeting: String, val shoppingList: List<UiShoppingItem>)
