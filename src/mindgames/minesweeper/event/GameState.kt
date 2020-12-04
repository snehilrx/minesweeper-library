package mindgames.minesweeper.event

enum class GameState {
    IDLE,
    WAITING_FOR_GAME_CONFIGURATION,
    WAITING_FOR_PLAYERS,
    WAITING_FOR_MOVE,
    PLANTING_MINE,
    REVEALING_TILE,
    EDITING_BOARD,
    WON,
    LOST,
    WATCHING
}
