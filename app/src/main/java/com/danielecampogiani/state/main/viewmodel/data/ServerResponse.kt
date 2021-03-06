package com.danielecampogiani.state.main.viewmodel.data

data class ServerResponse(
    val players: List<Player>,
    val nationalities: List<Nationality>
) {

    companion object {
        fun interData(): ServerResponse {

            val nationalities = listOf(
                Nationality(
                    1,
                    "Slovenia",
                    "https://tmssl.akamaized.net//images/flagge/tiny/155.png?lm=1520611569"
                ),
                Nationality(
                    2,
                    "Italy",
                    "https://tmssl.akamaized.net//images/flagge/tiny/75.png?lm=1520611569"
                ),
                Nationality(
                    3,
                    "Netherlands",
                    "https://tmssl.akamaized.net//images/flagge/tiny/122.png?lm=1520611569"
                ),
                Nationality(
                    4,
                    "Slovakia",
                    "https://tmssl.akamaized.net//images/flagge/tiny/154.png?lm=1520611569"
                ),
                Nationality(
                    5,
                    "Uruguay",
                    "https://tmssl.akamaized.net//images/flagge/tiny/179.png?lm=1520611569"
                ),
                Nationality(
                    6,
                    "Croatia",
                    "https://tmssl.akamaized.net//images/flagge/tiny/37.png?lm=1520611569"
                ),
                Nationality(
                    7,
                    "France",
                    "https://tmssl.akamaized.net//images/flagge/tiny/50.png?lm=1520611569"
                ),
                Nationality(
                    8,
                    "Spain",
                    "https://tmssl.akamaized.net//images/flagge/tiny/157.png?lm=1520611569"
                ),
                Nationality(
                    9,
                    "Nigeria",
                    "https://tmssl.akamaized.net//images/flagge/tiny/124.png?lm=1520611569"
                ),
                Nationality(
                    10,
                    "Ghana",
                    "https://tmssl.akamaized.net//images/flagge/tiny/54.png?lm=1520611569"
                ),
                Nationality(
                    11,
                    "England",
                    "https://tmssl.akamaized.net//images/flagge/tiny/189.png?lm=1520611569"
                ),
                Nationality(
                    12,
                    "Denmark",
                    "https://tmssl.akamaized.net//images/flagge/tiny/39.png?lm=1520611569"
                ),
                Nationality(
                    13,
                    "Chile",
                    "https://tmssl.akamaized.net//images/flagge/tiny/33.png?lm=1520611569"
                ),
                Nationality(
                    14,
                    "Argentina",
                    "https://tmssl.akamaized.net//images/flagge/tiny/9.png?lm=1520611569"
                ),
                Nationality(
                    15,
                    "Belgium",
                    "https://tmssl.akamaized.net//images/flagge/tiny/19.png?lm=1520611569"
                )
            )

            val players = listOf(
                Player(
                    "Samir",
                    "Handanovic",
                    1,
                    "https://tmssl.akamaized.net//images/portrait/header/28021-1410955099.jpg?lm=1433144200",
                    1
                ),
                Player(
                    "Daniele",
                    "Padelli",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/27807-1455550750.jpg?lm=1455550766",
                    27
                ),
                Player(
                    "Tommaso",
                    "Berni",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/21752-1410955115.jpg?lm=1433143994",
                    46
                ),
                Player(
                    "Stefan",
                    "de Vrij",
                    3,
                    "https://tmssl.akamaized.net//images/portrait/header/111196-1448467125.jpg?lm=1448467150",
                    6
                ),
                Player(
                    "Milan",
                    "Skriniar",
                    4,
                    "https://tmssl.akamaized.net//images/portrait/header/204069-1464947109.jpg?lm=1464947130",
                    37
                ),
                Player(
                    "Alessandro",
                    "Bastoni",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/315853-1511780680.jpg?lm=1511780694",
                    95
                ),
                Player(
                    "Diego",
                    "Godín",
                    5,
                    "https://tmssl.akamaized.net//images/portrait/header/54928-1547721268.jpg?lm=1547721289",
                    2
                ),
                Player(
                    "Andrea",
                    "Ranocchia",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/44327-1410955110.jpg?lm=1433144590",
                    13
                ),
                Player(
                    "Lorenzo",
                    "Pirola",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/487834-1557134682.jpg?lm=1557134839",
                    31
                ),
                Player(
                    "Danilo",
                    "D'Ambrosio",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/55769-1410340129.jpg?lm=1433144742",
                    33
                ),
                Player(
                    "Marcelo",
                    "Brozovic",
                    6,
                    "https://tmssl.akamaized.net//images/portrait/header/156617-1549632084.jpg?lm=1549632100",
                    77
                ),
                Player(
                    "Lucien",
                    "Agoume",
                    7,
                    "https://tmssl.akamaized.net//images/portrait/header/569384-1573556935.jpg?lm=1573556951",
                    32
                ),
                Player(
                    "Nicolò",
                    "Barella",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/255942-1457606457.jpg?lm=1457606466",
                    23
                ),
                Player(
                    "Stefano",
                    "Sensi",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/216179-1453389244.jpg?lm=1453389286",
                    12
                ),
                Player(
                    "Matías",
                    "Vecino",
                    5,
                    "https://tmssl.akamaized.net//images/portrait/header/143812-1448527550.jpg?lm=1448527568",
                    8
                ),
                Player(
                    "Roberto",
                    "Gagliardini",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/197471-1486638156.jpg?lm=1486638167",
                    5
                ),
                Player(
                    "Borja",
                    "Valero",
                    8,
                    "https://tmssl.akamaized.net//images/portrait/header/40372-1448527157.jpg?lm=1448527173",
                    20
                ),
                Player(
                    "Victor",
                    "Moses",
                    9,
                    "https://tmssl.akamaized.net//images/portrait/header/59866-1567084008.JPG?lm=1567084019",
                    11
                ),
                Player(
                    "Antonio",
                    "Candreava",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/25488-1455552915.jpg?lm=1455552928",
                    87
                ),
                Player(
                    "Kwadwo",
                    "Asamoah",
                    10,
                    "https://tmssl.akamaized.net//images/portrait/header/63531-1455553903.jpg?lm=1455553929",
                    18
                ),
                Player(
                    "Cristiano",
                    "Biraghi",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/124555-1447230778.jpg?lm=1447230817",
                    34
                ),
                Player(
                    "Ashley",
                    "Young",
                    11,
                    "https://tmssl.akamaized.net//images/portrait/header/14086-1528450650.jpg?lm=1528450661",
                    15
                ),
                Player(
                    "Christian",
                    "Eriksen",
                    12,
                    "https://tmssl.akamaized.net//images/portrait/header/69633-1518794659.jpg?lm=1518794673",
                    24
                ),
                Player(
                    "Alexis",
                    "Sánchez",
                    13,
                    "https://tmssl.akamaized.net//images/portrait/header/40433-1407934034.jpg?lm=1433144532",
                    7
                ),
                Player(
                    "Lautaro",
                    "Martínez",
                    14,
                    "https://tmssl.akamaized.net//images/portrait/header/406625-1535015019.jpg?lm=1535015034",
                    10
                ),
                Player(
                    "Romelu",
                    "Lukaku",
                    15,
                    "https://tmssl.akamaized.net//images/portrait/header/96341-1401194535.jpg?lm=1433145096",
                    9
                ),
                Player(
                    "Sebastiano",
                    "Esposito",
                    2,
                    "https://tmssl.akamaized.net//images/portrait/header/538918-1551691509.jpg?lm=1551691530",
                    30
                )
            )

            return ServerResponse(
                players,
                nationalities
            )

        }
    }
}