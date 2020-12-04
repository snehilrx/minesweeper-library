package mindgames.minesweeper

import mindgames.minesweeper.event.GameEvent

class GameController : GameEvent {

    private val networkController by lazy {NetworkController(this)}

    override fun onReceivePlayer(player: Player) {
        TODO("Not yet implemented")
    }

    override fun onReceiveMine(mines: Array<IntArray>) {
        TODO("Not yet implemented")
    }

    override fun onReceiveMine(coordinates: Pair<Int, Int>) {
        TODO("Not yet implemented")
    }

    override fun onReceivePlayerWon(id: String) {
        TODO("Not yet implemented")
    }

    override fun onReceivePlayerLost(id: String) {
        TODO("Not yet implemented")
    }

    override fun onReceiveGameConfiguration(gameConfig: GameConfiguration) {
        TODO("Not yet implemented")
    }

    override fun onReceiveHintRequest(coordinates: Pair<Int, Int>) {
        TODO("Not yet implemented")
    }


}