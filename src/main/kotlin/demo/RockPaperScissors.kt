package demo

class RockPaperScissors {

    private val moves = mutableMapOf<Player, Move>()

    fun recordMove(player: Player, move: Move) {
        moves[player] = move
    }

    fun getResult(): String {
        var winner: Player? = null

        val playerOneMove = moves[Player.ONE] ?: return Player.ONE.toString() + " must make a move!"
        val playerTwoMove = moves[Player.TWO] ?: return Player.TWO.toString() + " must make a move!"

        if (playerOneMove != playerTwoMove) {
            if (playerOneMove.beats(playerTwoMove)) {
                winner = Player.ONE
            } else {
                winner = Player.TWO
            }
        }

        return getResultString(winner)
    }

    private fun getResultString(winner: Player?): String {
        if (winner == null) {
            return "The players tied!"
        }
        return winner.toString() + " wins!"
    }

    fun clear() {
        moves.clear()
    }


}