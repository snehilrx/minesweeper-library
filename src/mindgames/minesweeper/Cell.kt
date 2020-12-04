package mindgames.minesweeper

import java.lang.UnsupportedOperationException
import java.util.ArrayList

class Cell {

    private val x = 0
    private val y = 0
    private val isMine = false
    private val neighbours = 0
    private val isFlagged = false
    private val isRevealed = false
    private val plantedMineFor: ArrayList<Int>? = null

    fun flag() {
        // TODO - implement Cell.flag
        throw UnsupportedOperationException()
    }

    fun reveal() {
        // TODO - implement Cell.reveal
        throw UnsupportedOperationException()
    }

    fun plantMine() {
        // TODO - implement Cell.plantMine
        throw UnsupportedOperationException()
    }

    private fun onChange() {
        // TODO - implement Cell.onChange
        throw UnsupportedOperationException()
    }
}