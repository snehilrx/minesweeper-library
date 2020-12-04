package mindgames.minesweeper

data class GameConfiguration(
        val boardRows: Int,
        val boardColumns: Int,
        val playersCount: Int,
        val minesForGameBoard: Int,
        val minesForGamePlay: Int,
        val timeout: Long
)
