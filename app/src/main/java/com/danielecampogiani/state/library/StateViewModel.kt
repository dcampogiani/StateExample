package com.danielecampogiani.state.library

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

abstract class StateViewModel<S, VS>(
    initialData: S,
    stateConverter: StateConverter<S, VS>
) : ViewModel() {

    private val _state: MutableStateFlow<S> = MutableStateFlow(initialData)
    private val _viewState = MutableLiveData<VS>()

    init {
        _state
            .map { stateConverter.convertToViewState(it) }
            .onEach {
                _viewState.value = it
            }.launchIn(viewModelScope)
    }

    val viewState: LiveData<VS>
        get() = _viewState

    protected val currentState: S
        get() = _state.value

    protected fun setState(state: S) {
        _state.value = state
    }
}