package project;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Mohamed Abdelrehim on 3/10/2017.
 */
public class Line extends Shape{
  private Point2D start;
  private Point2D end;
  // using default constructor
  public void setStart(Point2D start) {
    this.start = start;
  }

  public Point2D getStart() {
    return this.start;
  }

  public void setEnd(Point2D end) {
    this.end = end;
  }

  public Point2D getEnd() {
    return this.end;
  }

  public void draw (Canvas paintCanvas) {
    GraphicsContext gc = paintCanvas.getGraphicsContext2D();
    gc.setStroke(this.color);
    gc.strokeLine(start.getX(), start.getY(), end.getX(), end.getY());
  }
}

