package com.danielecampogiani.state.main

import com.danielecampogiani.state.main.viewmodel.data.ServerResponse
import kotlinx.coroutines.delay
import javax.inject.Inject

class LoadUseCase @Inject constructor() {

    suspend operator fun invoke(): ServerResponse {
        delay(1000)
        return ServerResponse.interData()
    }
}