package com.gtera.gteratask.presentation.shoppingList

import com.gtera.gteratask.presentation.StateViewModel
import com.gtera.gteratask.presentation.shared.model.UiProduct

class ShoppingListViewModel : StateViewModel<List<UiProduct>>() {

    init {
        _stateLiveData.value =listOf(UiProduct("MACBOOK M1 Max"), UiProduct("Pixel 6"))
    }
}