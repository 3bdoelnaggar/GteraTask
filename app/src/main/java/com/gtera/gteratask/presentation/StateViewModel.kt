package com.gtera.gteratask.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class StateViewModel<STATE> : ViewModel() {
    protected val _stateLiveData = MutableLiveData<STATE>()
    val stateLiveData :LiveData<STATE> = _stateLiveData
}