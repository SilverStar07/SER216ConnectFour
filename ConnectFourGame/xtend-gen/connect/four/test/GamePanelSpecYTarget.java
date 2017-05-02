package connect.four.test;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class GamePanelSpecYTarget extends ExampleTableRow {
  public GamePanelSpecYTarget(final List<String> cellNames, final int y, final int height) {
    super(cellNames);
    this.y = y;
    this.height = height;
    
  }
  
  private int y;
  
  public int getY() {
    return this.y;
  }
  
  private int height;
  
  public int getHeight() {
    return this.height;
  }
}
