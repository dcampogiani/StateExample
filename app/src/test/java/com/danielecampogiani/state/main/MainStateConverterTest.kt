package com.danielecampogiani.state.main

import com.danielecampogiani.state.main.view.ViewNationality
import com.danielecampogiani.state.main.view.ViewPlayer
import com.danielecampogiani.state.main.view.ViewState
import com.danielecampogiani.state.main.viewmodel.ViewModelState
import com.danielecampogiani.state.main.viewmodel.data.ServerResponse
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.runBlocking
import org.junit.Test

// I know I should Inject Dispatcher and don't use runBlocking
// But this is just an example
class MainStateConverterTest {

    private val sut = MainStateConverter()

    @Test
    fun mapIdle() = runBlocking {
        val result = sut.convertToViewState(ViewModelState.Idle)
        assertTrue(result is ViewState.Loading)
    }

    @Test
    fun mapData() = runBlocking {
        val input = ViewModelState.Data(
            serverResponse = ServerResponse(
                listOf(
                    CHIUSOLO,
                    MARTINEZ
                ),
                listOf(
                    ITALY,
                    ARGENTINA
                )
            ),
            selectedPlayers = listOf(MARTINEZ),
            selectedNationality = ARGENTINA
        )

        val output = sut.convertToViewState(input)
        val outputData = output as ViewState.Data

        val viewPlayers = listOf(
            ViewPlayer(
                MARTINEZ.imageUrl,
                "${MARTINEZ.name} ${MARTINEZ.surname} - ${MARTINEZ.number}",
                MARTINEZ.number
            )
        )

        val viewNationalities = listOf(
            ViewNationality(
                ITALY.imageUrl,
                ITALY.name,
                false,
                ITALY.id
            ),
            ViewNationality(
                ARGENTINA.imageUrl,
                ARGENTINA.name,
                true,
                ARGENTINA.id
            )
        )

        assertEquals(viewPlayers, outputData.players)
        assertEquals(viewNationalities, outputData.nationalities)
    }
}