package connect.four.test;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class GamePanelSpecColumnMoves extends ExampleTableRow {
  public GamePanelSpecColumnMoves(final List<String> cellNames, final int x, final boolean result) {
    super(cellNames);
    this.x = x;
    this.result = result;
    
  }
  
  private int x;
  
  public int getX() {
    return this.x;
  }
  
  private boolean result;
  
  public boolean getResult() {
    return this.result;
  }
}
