package mindgames.minesweeper.event

import mindgames.minesweeper.Cell

interface StateChangeListener {
    fun onGameWon()
    fun onGameLost()

    /**
     *
     * @param cell
     */
    fun onCellChange(cell: Cell?)
}