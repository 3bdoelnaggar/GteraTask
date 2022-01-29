package com.gtera.gteratask.presentation.productList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gtera.gteratask.ErrorResult
import com.gtera.gteratask.Success
import com.gtera.gteratask.domain.repository.ProductSource
import com.gtera.gteratask.presentation.StateViewModel
import com.gtera.gteratask.presentation.shared.model.UiProduct
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ProductListViewModel @Inject constructor(private val productSource: ProductSource) : StateViewModel<ProductListState>() {
    init {
        viewModelScope.launch {
           val result =  productSource.fetchProducts(null)
            when(result){
                is ErrorResult -> {


                }
                is Success -> {
                    val uiData = result.data.map {
                        UiProduct(it.name)
                    }
                    _stateLiveData.value = ProductListState(uiData)
                }
            }

        }
    }

}

data class ProductListState(val data:List<UiProduct>)

