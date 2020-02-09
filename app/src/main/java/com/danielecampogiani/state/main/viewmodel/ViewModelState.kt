package com.danielecampogiani.state.main.viewmodel

import com.danielecampogiani.state.main.viewmodel.data.Nationality
import com.danielecampogiani.state.main.viewmodel.data.Player
import com.danielecampogiani.state.main.viewmodel.data.ServerResponse

sealed class ViewModelState {

    object Idle : ViewModelState()

    data class Data(
        val serverResponse: ServerResponse,
        val selectedPlayers: List<Player>,
        val selectedNationality: Nationality?
    ) : ViewModelState()
}