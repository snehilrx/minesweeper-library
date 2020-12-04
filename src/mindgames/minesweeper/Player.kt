package mindgames.minesweeper

import mindgames.minesweeper.event.GameState

data class Player(
        val id: String,
        val state: GameState,
        val name: String,
        val avatar: String,
        val isOnline: Boolean
)
