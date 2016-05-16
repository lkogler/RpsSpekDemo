package demo

class RockPaperScissors {

    private val moves = mutableMapOf<Player, Move>()

    fun recordMove(player: Player, move: Move) {
        moves[player] = move
    }


    fun getResult(): String {
        var winner: Player? = null

        if(moves[Player.ONE] == null) {
            return Player.ONE.toString() + " must make a move!"
        }

        val playerOneMove = moves[Player.ONE]!!

        if(moves[Player.TWO] == null) {
            return Player.TWO.toString() + " must make a move!"
        }

        val playerTwoMove = moves[Player.TWO]!!

        if(playerOneMove != playerTwoMove) {
            if(moves[Player.ONE] == Move.ROCK) {
                if(moves[Player.TWO] == Move.SCISSORS) {
                    winner = Player.ONE
                }
                if(moves[Player.TWO] == Move.PAPER) {
                    winner = Player.TWO
                }
            }

            if(moves[Player.ONE] == Move.SCISSORS) {
                if(moves[Player.TWO] == Move.PAPER) {
                    winner = Player.ONE
                }
                if(moves[Player.TWO] == Move.ROCK) {
                    winner = Player.TWO
                }
            }

            if(moves[Player.ONE] == Move.PAPER) {
                if(moves[Player.TWO] == Move.ROCK) {
                    winner = Player.ONE
                }
                if(moves[Player.TWO] == Move.SCISSORS) {
                    winner = Player.TWO
                }
            }
        }

        return getResultString(winner)
    }

    private fun getResultString(winner: Player?): String {
        if(winner == null) {
            return "The players tied!"
        }
        return winner.toString() + " wins!"
    }

    fun clear() {
        moves.clear()
    }


}