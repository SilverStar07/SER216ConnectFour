package connect.four.test;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class GamePanelSpecXLocation extends ExampleTableRow {
  public GamePanelSpecXLocation(final List<String> cellNames, final int x, final int position) {
    super(cellNames);
    this.x = x;
    this.position = position;
    
  }
  
  private int x;
  
  public int getX() {
    return this.x;
  }
  
  private int position;
  
  public int getPosition() {
    return this.position;
  }
}
