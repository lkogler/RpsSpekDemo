package demo 

import kotlin.test.assertEquals
import org.jetbrains.spek.api.Spek

class TestSource : Spek({
    describe("playing rock paper scissiors") {
        val game = RockPaperScissors()

        afterEach {
            game.clear()
        }

        context("when player one plays rock") {
            beforeEach {
                game.recordMove(player=Player.ONE, move=Move.ROCK)
            }

            context("and player two plays scissors") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.SCISSORS)
                }

                it("declares player one the winner") {
                    assertEquals("Player One wins!", game.getResult())
                }
            }

            context("and player two plays paper") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.PAPER)
                }

                it("declares player two the winner") {
                    assertEquals("Player Two wins!", game.getResult())
                }
            }

            context("and player two plays rock") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.ROCK)
                }

                it("declares a tie") {
                    assertEquals("The players tied!", game.getResult())
                }
            }

            context("and player two has not played anything yet") {
                it("tells you that player two has not played yet") {
                    assertEquals("Player Two must make a move!", game.getResult())
                }
            }

        }

        context("when player one plays scissors") {
            beforeEach {
                game.recordMove(player=Player.ONE, move=Move.SCISSORS)
            }

            context("and player two plays scissors") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.SCISSORS)
                }

                it("declares a tie") {
                    assertEquals("The players tied!", game.getResult())
                }
            }

            context("and player two plays paper") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.PAPER)
                }

                it("declares player one the winner") {
                    assertEquals("Player One wins!", game.getResult())
                }
            }

            context("and player two plays rock") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.ROCK)
                }

                it("declares player two the winner") {
                    assertEquals("Player Two wins!", game.getResult())
                }
            }
        }

        context("when player one plays paper") {
            beforeEach {
                game.recordMove(player=Player.ONE, move=Move.PAPER)
            }

            context("and player two plays scissors") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.SCISSORS)
                }

                it("declares player two the winner") {
                    assertEquals("Player Two wins!", game.getResult())
                }
            }

            context("and player two plays paper") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.PAPER)
                }

                it("declared a tie") {
                    assertEquals("The players tied!", game.getResult())
                }
            }

            context("and player two plays rock") {
                beforeEach {
                    game.recordMove(player=Player.TWO, move=Move.ROCK)
                }

                it("declares player one the winner") {
                    assertEquals("Player One wins!", game.getResult())
                }
            }
        }

        context("when neither player has played yet") {
            it("tells you that player one has not played yet") {
                assertEquals("Player One must make a move!", game.getResult())
            }
        }
    }
})
