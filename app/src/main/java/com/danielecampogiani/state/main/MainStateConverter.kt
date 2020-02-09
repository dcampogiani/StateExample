package com.danielecampogiani.state.main

import com.danielecampogiani.state.library.StateConverter
import com.danielecampogiani.state.main.view.ViewNationality
import com.danielecampogiani.state.main.view.ViewPlayer
import com.danielecampogiani.state.main.view.ViewState
import com.danielecampogiani.state.main.viewmodel.ViewModelState
import com.danielecampogiani.state.main.viewmodel.data.Nationality
import com.danielecampogiani.state.main.viewmodel.data.Player
import javax.inject.Inject

class MainStateConverter @Inject constructor() : StateConverter<ViewModelState, ViewState> {

    override suspend fun convertToViewState(state: ViewModelState): ViewState = when (state) {
        ViewModelState.Idle -> ViewState.Loading
        is ViewModelState.Data -> mapData(state)
    }

    private fun mapData(state: ViewModelState.Data): ViewState.Data {
        return ViewState.Data(
            state.selectedPlayers.map { it.toViewState() },
            state.serverResponse.nationalities.map { it.toViewState(state.selectedNationality) }
        )
    }

    private fun Player.toViewState(): ViewPlayer = ViewPlayer(
        imageUrl = imageUrl,
        text = "$name $surname - $number",
        id = number
    )

    private fun Nationality.toViewState(selectedNationality: Nationality?): ViewNationality {
        return ViewNationality(
            imageUrl = imageUrl,
            text = name,
            selected = id == selectedNationality?.id,
            id = id
        )
    }
}




