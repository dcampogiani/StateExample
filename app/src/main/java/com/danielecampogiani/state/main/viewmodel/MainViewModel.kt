package com.danielecampogiani.state.main.viewmodel

import androidx.lifecycle.viewModelScope
import com.danielecampogiani.state.library.StateViewModel
import com.danielecampogiani.state.main.LoadUseCase
import com.danielecampogiani.state.main.MainReducer
import com.danielecampogiani.state.main.MainStateConverter
import com.danielecampogiani.state.main.view.ViewNationality
import com.danielecampogiani.state.main.view.ViewState
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    mainStateConverter: MainStateConverter,
    private val loadUseCase: LoadUseCase,
    private val reducer: MainReducer
) : StateViewModel<ViewModelState, ViewState>(
    ViewModelState.Idle,
    mainStateConverter
) {

    fun loadData() {
        viewModelScope.launch {
            val serverResponse = loadUseCase()
            val newState = reducer.updateWithServerData(currentState, serverResponse)
            setState(newState)
        }
    }

    fun onNationalityTap(viewNationality: ViewNationality) {
        val newState = reducer.updateWithNationality(
            currentState,
            viewNationality.id,
            viewNationality.selected
        )
        setState(newState)
    }
}