package mindgames.minesweeper

import mindgames.minesweeper.event.StateChangeListener

class StateController(private val width: Int, private val height: Int) {

    private val mines: Array<IntArray> = Array(width) { IntArray(height) }
    private val neighbours = Array(width) { IntArray(height) }
    private val revealed = Array(width) { IntArray(height) }
    private val flagged = Array(width) { IntArray(height) }
    private val plantedMineMap: PlantedMineMap? = null
    private val stateChangeListener: StateChangeListener? = null

    /**
     *
     * @param x
     * @param y
     */
    fun getCell(x: Int, y: Int): Cell {
        // TODO - implement State.getCell
        throw UnsupportedOperationException()
    }

    /**
     *
     * @param cell
     */
    private fun revealCell(cell: Cell) {
        // TODO - implement State.revealCell
        throw UnsupportedOperationException()
    }

    private fun flagCell() {
        // TODO - implement State.flagCell
        throw UnsupportedOperationException()
    }
}