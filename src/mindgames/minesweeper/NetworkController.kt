package mindgames.minesweeper

import mindgames.minesweeper.event.GameEvent

abstract class NetworkController(gameEvent: GameEvent) {

    abstract fun sendGameConfiguration()

    abstract fun sendRequestToJoin(player: Player)

    abstract fun sendMineBoard(playerId: String, a)

}