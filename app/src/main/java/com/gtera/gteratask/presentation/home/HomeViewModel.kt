package com.gtera.gteratask.presentation.home

import com.gtera.gteratask.presentation.StateViewModel
import com.gtera.gteratask.presentation.shared.model.UiProduct

class HomeViewModel : StateViewModel<HomeState>() {
    init {
        _stateLiveData.value = HomeState(
            "Hi Gtera Task Evaluator",
            listOf(UiProduct("MACBOOK M1 Max"), UiProduct("Pixel 6"))
        )
    }

}

data class HomeState(val greeting: String, val shoppingList: List<UiProduct>)
