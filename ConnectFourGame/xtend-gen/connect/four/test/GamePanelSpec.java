package connect.four.test;

import connect.four.Game;
import connect.four.board.Board;
import connect.four.gui.GUI;
import connect.four.gui.GUIPlayer;
import connect.four.gui.GamePanel;
import connect.four.player.Player;
import connect.four.test.GamePanelSpecColumnMoves;
import connect.four.test.GamePanelSpecNewPos;
import connect.four.test.GamePanelSpecXLocation;
import connect.four.test.GamePanelSpecYTarget;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("GamePanel")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class GamePanelSpec {
  final GUI testGUI = new GUI();
  
  final GamePanel testPanel = new GamePanel(this.testGUI, false);
  
  final GUIPlayer testPlayer = new GUIPlayer("testPlayer", this.testPanel);
  
  public String printTestName(final String name) {
    return InputOutput.<String>println((("Testing " + name) + "..."));
  }
  
  public ExampleTable<GamePanelSpecYTarget> _initGamePanelSpecYTarget() {
    return ExampleTable.create("yTarget", 
      Arrays.asList("y", "height"), 
      new GamePanelSpecYTarget(  Arrays.asList("0", "605"), _initGamePanelSpecYTargetCell0(), _initGamePanelSpecYTargetCell1()),
      new GamePanelSpecYTarget(  Arrays.asList("1", "513"), _initGamePanelSpecYTargetCell2(), _initGamePanelSpecYTargetCell3()),
      new GamePanelSpecYTarget(  Arrays.asList("2", "421"), _initGamePanelSpecYTargetCell4(), _initGamePanelSpecYTargetCell5()),
      new GamePanelSpecYTarget(  Arrays.asList("3", "330"), _initGamePanelSpecYTargetCell6(), _initGamePanelSpecYTargetCell7()),
      new GamePanelSpecYTarget(  Arrays.asList("4", "242"), _initGamePanelSpecYTargetCell8(), _initGamePanelSpecYTargetCell9()),
      new GamePanelSpecYTarget(  Arrays.asList("5", "150"), _initGamePanelSpecYTargetCell10(), _initGamePanelSpecYTargetCell11()),
      new GamePanelSpecYTarget(  Arrays.asList("6", "150"), _initGamePanelSpecYTargetCell12(), _initGamePanelSpecYTargetCell13())
    );
  }
  
  protected ExampleTable<GamePanelSpecYTarget> yTarget = _initGamePanelSpecYTarget();
  
  public int _initGamePanelSpecYTargetCell0() {
    return 0;
  }
  
  public int _initGamePanelSpecYTargetCell1() {
    return 605;
  }
  
  public int _initGamePanelSpecYTargetCell2() {
    return 1;
  }
  
  public int _initGamePanelSpecYTargetCell3() {
    return 513;
  }
  
  public int _initGamePanelSpecYTargetCell4() {
    return 2;
  }
  
  public int _initGamePanelSpecYTargetCell5() {
    return 421;
  }
  
  public int _initGamePanelSpecYTargetCell6() {
    return 3;
  }
  
  public int _initGamePanelSpecYTargetCell7() {
    return 330;
  }
  
  public int _initGamePanelSpecYTargetCell8() {
    return 4;
  }
  
  public int _initGamePanelSpecYTargetCell9() {
    return 242;
  }
  
  public int _initGamePanelSpecYTargetCell10() {
    return 5;
  }
  
  public int _initGamePanelSpecYTargetCell11() {
    return 150;
  }
  
  public int _initGamePanelSpecYTargetCell12() {
    return 6;
  }
  
  public int _initGamePanelSpecYTargetCell13() {
    return 150;
  }
  
  @Test
  @Named("finds the next available Y coordinate in a column")
  @Order(1)
  public void _findsTheNextAvailableYCoordinateInAColumn() throws Exception {
    this.printTestName("getTargetY()");
    this.testPanel.setColumnNum(0);
    boolean expectedException = false;
    String message = "";
    try{
      this.testPanel.setColumnHeight((-1), this.testPlayer);
      message = "Expected " + ArrayIndexOutOfBoundsException.class.getName() + " for \n     testPanel.setColumnHeight(-1, testPlayer)\n with:"
       + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString()
       + "\n     -1 is " + new org.hamcrest.StringDescription().appendValue((-1)).toString()
       + "\n     testPlayer is " + new org.hamcrest.StringDescription().appendValue(this.testPlayer).toString();
    }catch(ArrayIndexOutOfBoundsException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
    final Consumer<GamePanelSpecYTarget> _function = new Consumer<GamePanelSpecYTarget>() {
      public void accept(final GamePanelSpecYTarget it) {
        int _y = it.getY();
        GamePanelSpec.this.testPanel.setColumnHeight(_y, GamePanelSpec.this.testPlayer);
        int _targetY = GamePanelSpec.this.testPanel.getTargetY();
        int _height = it.getHeight();
        Assert.assertTrue("\nExpected testPanel.getTargetY() should be height but"
         + "\n     testPanel.getTargetY() is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_targetY)).toString()
         + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(GamePanelSpec.this.testPanel).toString()
         + "\n     height is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_height)).toString() + "\n", Should.<Integer>should_be(Integer.valueOf(_targetY), Integer.valueOf(_height)));
        
      }
    };
    this.yTarget.forEach(_function);
  }
  
  public ExampleTable<GamePanelSpecColumnMoves> _initGamePanelSpecColumnMoves() {
    return ExampleTable.create("columnMoves", 
      Arrays.asList("x", "result"), 
      new GamePanelSpecColumnMoves(  Arrays.asList("4", "true"), _initGamePanelSpecColumnMovesCell0(), _initGamePanelSpecColumnMovesCell1()),
      new GamePanelSpecColumnMoves(  Arrays.asList("6", "false"), _initGamePanelSpecColumnMovesCell2(), _initGamePanelSpecColumnMovesCell3())
    );
  }
  
  protected ExampleTable<GamePanelSpecColumnMoves> columnMoves = _initGamePanelSpecColumnMoves();
  
  public int _initGamePanelSpecColumnMovesCell0() {
    return 4;
  }
  
  public boolean _initGamePanelSpecColumnMovesCell1() {
    return true;
  }
  
  public int _initGamePanelSpecColumnMovesCell2() {
    return 6;
  }
  
  public boolean _initGamePanelSpecColumnMovesCell3() {
    return false;
  }
  
  @Test
  @Named("does not accept invalid column moves")
  @Order(2)
  public void _doesNotAcceptInvalidColumnMoves() throws Exception {
    this.printTestName("isValidMove()");
    this.testPanel.setColumnNum(0);
    boolean expectedException = false;
    String message = "";
    try{
      this.testPanel.setColumnHeight((-1), this.testPlayer);
      message = "Expected " + ArrayIndexOutOfBoundsException.class.getName() + " for \n     testPanel.setColumnHeight(-1, testPlayer)\n with:"
       + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString()
       + "\n     -1 is " + new org.hamcrest.StringDescription().appendValue((-1)).toString()
       + "\n     testPlayer is " + new org.hamcrest.StringDescription().appendValue(this.testPlayer).toString();
    }catch(ArrayIndexOutOfBoundsException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
    final Consumer<GamePanelSpecColumnMoves> _function = new Consumer<GamePanelSpecColumnMoves>() {
      public void accept(final GamePanelSpecColumnMoves it) {
        int _x = it.getX();
        GamePanelSpec.this.testPanel.setColumnHeight(_x, GamePanelSpec.this.testPlayer);
        boolean _isValidMove = GamePanelSpec.this.testPanel.isValidMove();
        boolean _result = it.getResult();
        Assert.assertTrue("\nExpected testPanel.isValidMove() should be result but"
         + "\n     testPanel.isValidMove() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isValidMove)).toString()
         + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(GamePanelSpec.this.testPanel).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", Should.<Boolean>should_be(Boolean.valueOf(_isValidMove), _result));
        
      }
    };
    this.columnMoves.forEach(_function);
  }
  
  public ExampleTable<GamePanelSpecXLocation> _initGamePanelSpecXLocation() {
    return ExampleTable.create("xLocation", 
      Arrays.asList("x", "position"), 
      new GamePanelSpecXLocation(  Arrays.asList("-1", "0"), _initGamePanelSpecXLocationCell0(), _initGamePanelSpecXLocationCell1()),
      new GamePanelSpecXLocation(  Arrays.asList("0", "190"), _initGamePanelSpecXLocationCell2(), _initGamePanelSpecXLocationCell3()),
      new GamePanelSpecXLocation(  Arrays.asList("6", "738"), _initGamePanelSpecXLocationCell4(), _initGamePanelSpecXLocationCell5()),
      new GamePanelSpecXLocation(  Arrays.asList("7", "0"), _initGamePanelSpecXLocationCell6(), _initGamePanelSpecXLocationCell7())
    );
  }
  
  protected ExampleTable<GamePanelSpecXLocation> xLocation = _initGamePanelSpecXLocation();
  
  public int _initGamePanelSpecXLocationCell0() {
    return (-1);
  }
  
  public int _initGamePanelSpecXLocationCell1() {
    return 0;
  }
  
  public int _initGamePanelSpecXLocationCell2() {
    return 0;
  }
  
  public int _initGamePanelSpecXLocationCell3() {
    return 190;
  }
  
  public int _initGamePanelSpecXLocationCell4() {
    return 6;
  }
  
  public int _initGamePanelSpecXLocationCell5() {
    return 738;
  }
  
  public int _initGamePanelSpecXLocationCell6() {
    return 7;
  }
  
  public int _initGamePanelSpecXLocationCell7() {
    return 0;
  }
  
  @Test
  @Named("calculates X position of a chosen column")
  @Order(3)
  public void _calculatesXPositionOfAChosenColumn() throws Exception {
    this.printTestName("calcWidth()");
    final Consumer<GamePanelSpecXLocation> _function = new Consumer<GamePanelSpecXLocation>() {
      public void accept(final GamePanelSpecXLocation it) {
        int _x = it.getX();
        GamePanelSpec.this.testPanel.calcWidth(_x);
        int _pieceLocation = GamePanelSpec.this.testPanel.getPieceLocation(0);
        int _position = it.getPosition();
        Assert.assertTrue("\nExpected testPanel.getPieceLocation(0) should be position but"
         + "\n     testPanel.getPieceLocation(0) is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_pieceLocation)).toString()
         + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(GamePanelSpec.this.testPanel).toString()
         + "\n     position is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_position)).toString() + "\n", Should.<Integer>should_be(Integer.valueOf(_pieceLocation), Integer.valueOf(_position)));
        
      }
    };
    this.xLocation.forEach(_function);
  }
  
  public ExampleTable<GamePanelSpecNewPos> _initGamePanelSpecNewPos() {
    return ExampleTable.create("newPos", 
      Arrays.asList("c", "pos", "column"), 
      new GamePanelSpecNewPos(  Arrays.asList("-1", "0", "-1"), _initGamePanelSpecNewPosCell0(), _initGamePanelSpecNewPosCell1(), _initGamePanelSpecNewPosCell2()),
      new GamePanelSpecNewPos(  Arrays.asList("0", "190", "0"), _initGamePanelSpecNewPosCell3(), _initGamePanelSpecNewPosCell4(), _initGamePanelSpecNewPosCell5()),
      new GamePanelSpecNewPos(  Arrays.asList("6", "738", "6"), _initGamePanelSpecNewPosCell6(), _initGamePanelSpecNewPosCell7(), _initGamePanelSpecNewPosCell8()),
      new GamePanelSpecNewPos(  Arrays.asList("7", "0", "7"), _initGamePanelSpecNewPosCell9(), _initGamePanelSpecNewPosCell10(), _initGamePanelSpecNewPosCell11())
    );
  }
  
  protected ExampleTable<GamePanelSpecNewPos> newPos = _initGamePanelSpecNewPos();
  
  public int _initGamePanelSpecNewPosCell0() {
    return (-1);
  }
  
  public int _initGamePanelSpecNewPosCell1() {
    return 0;
  }
  
  public int _initGamePanelSpecNewPosCell2() {
    return (-1);
  }
  
  public int _initGamePanelSpecNewPosCell3() {
    return 0;
  }
  
  public int _initGamePanelSpecNewPosCell4() {
    return 190;
  }
  
  public int _initGamePanelSpecNewPosCell5() {
    return 0;
  }
  
  public int _initGamePanelSpecNewPosCell6() {
    return 6;
  }
  
  public int _initGamePanelSpecNewPosCell7() {
    return 738;
  }
  
  public int _initGamePanelSpecNewPosCell8() {
    return 6;
  }
  
  public int _initGamePanelSpecNewPosCell9() {
    return 7;
  }
  
  public int _initGamePanelSpecNewPosCell10() {
    return 0;
  }
  
  public int _initGamePanelSpecNewPosCell11() {
    return 7;
  }
  
  @Test
  @Named("sets draw pos for piece based on xLocation")
  @Order(4)
  public void _setsDrawPosForPieceBasedOnXLocation() throws Exception {
    this.printTestName("calcNewPos()");
    final Consumer<GamePanelSpecNewPos> _function = new Consumer<GamePanelSpecNewPos>() {
      public void accept(final GamePanelSpecNewPos it) {
        int _c = it.getC();
        GamePanelSpec.this.testPanel.calcNewPos(_c);
        int _drawPos = GamePanelSpec.this.testPanel.getDrawPos();
        int _pos = it.getPos();
        boolean _should_be = Should.<Integer>should_be(Integer.valueOf(_drawPos), Integer.valueOf(_pos));
        Assert.assertTrue("\nExpected testPanel.getDrawPos should be pos but"
         + "\n     testPanel.getDrawPos is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_drawPos)).toString()
         + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(GamePanelSpec.this.testPanel).toString()
         + "\n     pos is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_pos)).toString() + "\n", _should_be);
        
        int _newColumnNum = GamePanelSpec.this.testPanel.getNewColumnNum();
        int _column = it.getColumn();
        Assert.assertTrue("\nExpected testPanel.getNewColumnNum should be column but"
         + "\n     testPanel.getNewColumnNum is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_newColumnNum)).toString()
         + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(GamePanelSpec.this.testPanel).toString()
         + "\n     column is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_column)).toString() + "\n", Should.<Integer>should_be(Integer.valueOf(_newColumnNum), Integer.valueOf(_column)));
        
      }
    };
    this.newPos.forEach(_function);
  }
  
  @Test
  @Named("increments turn or ends game if there is a tie or winner")
  @Order(5)
  public void _incrementsTurnOrEndsGameIfThereIsATieOrWinner() throws Exception {
    this.testPanel.setTurnNum(40);
    this.testPanel.turnUp();
    int _turnNum = this.testPanel.getTurnNum();
    boolean _should_be = Should.<Integer>should_be(Integer.valueOf(_turnNum), Integer.valueOf(41));
    Assert.assertTrue("\nExpected testPanel.getTurnNum() should be 41 but"
     + "\n     testPanel.getTurnNum() is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_turnNum)).toString()
     + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString() + "\n", _should_be);
    
    this.testPanel.turnUp();
    String _winner = this.testPanel.getWinner();
    boolean _should_be_1 = Should.<String>should_be(_winner, "It\'s a tie!");
    Assert.assertTrue("\nExpected testPanel.getWinner() should be \"It\'s a tie!\" but"
     + "\n     testPanel.getWinner() is " + new org.hamcrest.StringDescription().appendValue(_winner).toString()
     + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString() + "\n", _should_be_1);
    
    this.testPanel.setTurnNum(43);
    boolean expectedException = false;
    String message = "";
    try{
      this.testPanel.turnUp();
      message = "Expected " + ArrayIndexOutOfBoundsException.class.getName() + " for \n     testPanel.turnUp\n with:"
       + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString();
    }catch(ArrayIndexOutOfBoundsException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
  
  @Test
  @Named("sets the winner when the game is over")
  @Order(6)
  public void _setsTheWinnerWhenTheGameIsOver() throws Exception {
    this.testPanel.setTurnNum(42);
    String _winner = this.testPanel.getWinner();
    Assert.assertNull("\nExpected testPanel.getWinner should be null\n     but is " + new org.hamcrest.StringDescription().appendValue(_winner).toString() + "\n", _winner);
    
    this.testPanel.setTurnNum(35);
    this.testPanel.setCurrentPlayer(0);
    Player _currentPlayer = this.testPanel.getCurrentPlayer();
    Game _game = this.testPanel.getGame();
    Board _board = this.testPanel.getBoard();
    this.testPanel.gameOver(_currentPlayer, _game, _board);
    Player _currentPlayer_1 = this.testPanel.getCurrentPlayer();
    String _name = _currentPlayer_1.getName();
    InputOutput.<String>println(_name);
    String _winner_1 = this.testPanel.getWinner();
    boolean _should_be = Should.<String>should_be(_winner_1, "Player 1");
    Assert.assertTrue("\nExpected testPanel.getWinner should be \"Player 1\" but"
     + "\n     testPanel.getWinner is " + new org.hamcrest.StringDescription().appendValue(_winner_1).toString()
     + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString() + "\n", _should_be);
    
    boolean _justWon = this.testPanel.getJustWon();
    Assert.assertTrue("\nExpected testPanel.getJustWon should be true but"
     + "\n     testPanel.getJustWon is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_justWon)).toString()
     + "\n     testPanel is " + new org.hamcrest.StringDescription().appendValue(this.testPanel).toString() + "\n", Should.<Boolean>should_be(Boolean.valueOf(_justWon), true));
    
  }
}
