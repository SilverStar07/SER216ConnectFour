package connect.four.test

import connect.four.gui.GamePanel
import connect.four.gui.GUI
import connect.four.gui.GUIPlayer
import connect.four.player.Player
import connect.four.Game
import connect.four.board.Board

describe GamePanel {
	val testGUI = new GUI();
	val testPanel = new GamePanel(testGUI, false)
	val testPlayer = new GUIPlayer("testPlayer", testPanel)
	
	def printTestName(String name){
		println("Testing " + name + "...")
	}

	//getTargetY()
	def yTarget{
		|y|height|
		|0|	605	|
		|1|	513	|
		|2|	421	|
		|3|	330	|
		|4|	242	|
		|5|	150	|
		|6|	150	|	
		}
	fact "finds the next available Y coordinate in a column"{
		printTestName("getTargetY()")
		testPanel.setColumnNum(0)
		testPanel.setColumnHeight(-1, testPlayer) throws ArrayIndexOutOfBoundsException
		yTarget.forEach[testPanel.setColumnHeight(y, testPlayer) testPanel.getTargetY() should be height]
	}
	
	//isValidMove()
	def columnMoves{
		|x| result	|
		|4|	true	|
		|6|	false	|
	}
	fact "does not accept invalid column moves"{
		printTestName("isValidMove()")
		testPanel.setColumnNum(0)
		testPanel.setColumnHeight(-1, testPlayer) throws ArrayIndexOutOfBoundsException
		columnMoves.forEach[testPanel.setColumnHeight(x, testPlayer) testPanel.isValidMove() should be result]
	}

	//calcWidth()
	def xLocation{
		| x	| position	|
		|-1	| 	0		|
		| 0	|	190		|
		| 6	| 	738		|
		| 7	|	0		| 
	}
	fact "calculates X position of a chosen column" {
		printTestName("calcWidth()")
		xLocation.forEach[testPanel.calcWidth(x) testPanel.getPieceLocation(0) should be position]
	}

	//calcNewPos()
	def newPos{
		|c	| pos|column|
		|-1	| 	0| 	-1	|
		| 0	| 190| 	 0	|
		| 6	| 738| 	 6	|
		| 7	| 	0| 	 7	|
	}
	fact "sets draw pos for piece based on xLocation"{
		printTestName("calcNewPos()")
		newPos.forEach[testPanel.calcNewPos(c) testPanel.getDrawPos should be pos 
			testPanel.getNewColumnNum should be column]
	}

	//turnUp
	fact "increments turn or ends game if there is a tie or winner"{
		testPanel.setTurnNum(40)
		testPanel.turnUp
		testPanel.getTurnNum() should be 41
		testPanel.turnUp
		testPanel.getWinner() should be "It's a tie!"
		testPanel.setTurnNum(43) 
		testPanel.turnUp throws ArrayIndexOutOfBoundsException	
	}

	//gameOver()
	fact "sets the winner when the game is over"{
		testPanel.setTurnNum(42)
		testPanel.getWinner should be null
		testPanel.setTurnNum(35)
		testPanel.setCurrentPlayer(0)
		testPanel.gameOver(testPanel.getCurrentPlayer, testPanel.getGame, testPanel.getBoard)
		println(testPanel.getCurrentPlayer.getName)
		testPanel.getWinner should be "Player 1"
		testPanel.getJustWon should be true
	} 
}