package com.gtera.gteratask.presentation.notifications

import com.gtera.gteratask.presentation.StateViewModel
import com.gtera.gteratask.presentation.shared.model.UiShoppingItem

class ShoppingListViewModel : StateViewModel<List<UiShoppingItem>>() {

    init {
        _stateLiveData.value =listOf(UiShoppingItem("MACBOOK M1 Max"), UiShoppingItem("Pixel 6"))
    }
}