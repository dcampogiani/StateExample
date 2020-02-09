package com.danielecampogiani.state.main

import com.danielecampogiani.state.main.viewmodel.ViewModelState
import com.danielecampogiani.state.main.viewmodel.data.ServerResponse
import javax.inject.Inject

class MainReducer @Inject constructor() {

    fun updateWithServerData(
        currentState: ViewModelState,
        serverResponse: ServerResponse
    ): ViewModelState {
        return ViewModelState.Data(
            serverResponse = serverResponse,
            selectedPlayers = serverResponse.players,
            selectedNationality = null
        )
    }

    fun updateWithNationality(
        currentState: ViewModelState,
        id: Int,
        wasSelected: Boolean
    ): ViewModelState {
        if (currentState !is ViewModelState.Data) return currentState

        val originalData = currentState.serverResponse

        return if (wasSelected) {
            ViewModelState.Data(
                serverResponse = originalData,
                selectedPlayers = originalData.players,
                selectedNationality = null
            )
        } else {
            ViewModelState.Data(
                serverResponse = originalData,
                selectedPlayers = originalData.players.filter {
                    it.nationalityID == id
                },
                selectedNationality = originalData.nationalities.first {
                    it.id == id
                }
            )
        }
    }
}