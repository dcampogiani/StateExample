package com.danielecampogiani.state.library

interface StateConverter<S, VS> {
    suspend fun convertToViewState(state: S): VS
}