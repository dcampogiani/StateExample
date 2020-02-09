package com.danielecampogiani.state.main

import com.danielecampogiani.state.main.viewmodel.ViewModelState
import com.danielecampogiani.state.main.viewmodel.data.ServerResponse
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import org.junit.Test

class MainReducerTest {

    private val sut = MainReducer()

    @Test
    fun updateWithServerData() {

        val players = listOf(CHIUSOLO)
        val serverResponse = ServerResponse(
            players,
            listOf(
                ITALY
            )
        )

        val result = sut.updateWithServerData(ViewModelState.Idle, serverResponse)

        val resultData = result as ViewModelState.Data

        assertEquals(serverResponse, result.serverResponse)
        assertEquals(players, result.selectedPlayers)
        assertNull(resultData.selectedNationality)
    }

    @Test
    fun updateNationalityWrongState() {
        val result = sut.updateWithNationality(ViewModelState.Idle, 1, false)
        assertEquals(ViewModelState.Idle, result)
    }

    @Test
    fun deselectNationality() {

        val players = listOf(
            CHIUSOLO,
            MARTINEZ
        )
        val serverResponse = ServerResponse(
            players,
            listOf(
                ITALY,
                ARGENTINA
            )
        )

        val currentState = ViewModelState.Data(
            serverResponse,
            listOf(CHIUSOLO),
            ITALY
        )

        val result = sut.updateWithNationality(currentState, ITALY.id, true)

        val resultData = result as ViewModelState.Data

        assertEquals(serverResponse, resultData.serverResponse)
        assertEquals(players, resultData.selectedPlayers)
        assertNull(resultData.selectedNationality)

    }

    @Test
    fun selectNationality() {
        val players = listOf(
            CHIUSOLO,
            MARTINEZ
        )
        val serverResponse = ServerResponse(
            players,
            listOf(
                ITALY,
                ARGENTINA
            )
        )

        val currentState = ViewModelState.Data(
            serverResponse,
            listOf(CHIUSOLO, MARTINEZ),
            null
        )

        val result = sut.updateWithNationality(currentState, ARGENTINA.id, false)

        val resultData = result as ViewModelState.Data

        assertEquals(serverResponse, resultData.serverResponse)
        assertEquals(listOf(MARTINEZ), resultData.selectedPlayers)
        assertEquals(ARGENTINA, resultData.selectedNationality)
    }
}