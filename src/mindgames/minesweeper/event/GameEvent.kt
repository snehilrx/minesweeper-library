package mindgames.minesweeper.event

import mindgames.minesweeper.GameConfiguration
import mindgames.minesweeper.Player

interface GameEvent {

    fun onReceivePlayer(player: Player)

    fun onReceiveMine(mines: Array<IntArray>)

    fun onReceiveMine(coordinates: Pair<Int, Int>)

    fun onReceivePlayerWon(id: String)

    fun onReceivePlayerLost(id: String)

    fun onReceiveGameConfiguration(gameConfig: GameConfiguration)

    fun onReceiveHintRequest(coordinates: Pair<Int, Int>)


}
