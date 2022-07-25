package project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Mohamed Abdelrehim on 3/10/2017.
 */
public class Ellipse extends Shape {
  public void draw (Canvas paintCanvas) {
    GraphicsContext gc = paintCanvas.getGraphicsContext2D();
    gc.setFill(this.fillColor);
    gc.setStroke(this.color);
    gc.fillOval(this.position.getX(), this.position.getY(), this.properties.get("radius1"),
                this.properties.get("radius2"));
  }
}
