package connect.four.test;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class GamePanelSpecNewPos extends ExampleTableRow {
  public GamePanelSpecNewPos(final List<String> cellNames, final int c, final int pos, final int column) {
    super(cellNames);
    this.c = c;
    this.pos = pos;
    this.column = column;
    
  }
  
  private int c;
  
  public int getC() {
    return this.c;
  }
  
  private int pos;
  
  public int getPos() {
    return this.pos;
  }
  
  private int column;
  
  public int getColumn() {
    return this.column;
  }
}
