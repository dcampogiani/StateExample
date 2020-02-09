package com.danielecampogiani.state.main.view

sealed class ViewState {

    object Loading : ViewState()

    data class Data(
        val players: List<ViewPlayer>,
        val nationalities: List<ViewNationality>
    ) : ViewState()
}

data class ViewPlayer(
    val imageUrl: String,
    val text: String,
    val id: Int
)

data class ViewNationality(
    val imageUrl: String,
    val text: String,
    val selected: Boolean,
    val id: Int
)