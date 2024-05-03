package com.example.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _currenntScreen: MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.AddAccount)

    val currtScreen: MutableState<Screen>
        get() = _currenntScreen

    fun setCurrentScreen(screen:Screen){
        _currenntScreen.value = screen
    }
}