package com.danielecampogiani.state.main

import com.danielecampogiani.state.main.viewmodel.data.Nationality
import com.danielecampogiani.state.main.viewmodel.data.Player


internal val CHIUSOLO: Player
    get() = Player(
        "Francesco",
        "Chiusolo",
        2,
        "https://media.gqitalia.it/photos/5dc545360e609100089fc702/16:9/w_1920,c_limit/GettyImages-141894778.jpg",
        23
    )


internal val MARTINEZ: Player
    get() = Player(
        "Lautaro",
        "Martínez",
        14,
        "https://tmssl.akamaized.net//images/portrait/header/406625-1535015019.jpg?lm=1535015034",
        10
    )


internal val ITALY: Nationality
    get() = Nationality(
        2,
        "Italy",
        "https://tmssl.akamaized.net//images/flagge/tiny/75.png?lm=1520611569"
    )


internal val ARGENTINA: Nationality
    get() = Nationality(
        14,
        "Argentina",
        "https://tmssl.akamaized.net//images/flagge/tiny/9.png?lm=1520611569"
    )
