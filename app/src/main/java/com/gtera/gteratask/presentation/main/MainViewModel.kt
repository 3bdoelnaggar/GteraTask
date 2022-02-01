package com.gtera.gteratask.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _stateLiveData = MutableLiveData<MainState>()
    val stateLiveData  :LiveData<MainState> = _stateLiveData

    init {
        val isUserLoggedIn =true
        if(isUserLoggedIn){
            _stateLiveData.value=MainState.Home

        }else{
            _stateLiveData.value=MainState.Authentication

        }
    }

    fun startHome(){
        _stateLiveData.value=MainState.Home
    }
    fun startAuthentication(){
        _stateLiveData.value=MainState.Authentication
    }


}
sealed class MainState{
    object Authentication:MainState()
    object Home:MainState()
}