package project;

/**
 * Created by Mohamed Abdelrehim on 3/10/2017.
 */

import java.util.Map;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public interface ShapeInterface {
  /* set position */
  void setPosition(Point2D position);
  Point2D getPosition();
  /* update shape specific properties (e.g., radius) */
  void setProperties(Map<String, Double> properties);
  Map<String, Double> getProperties();
  /* colorize */
  void setColor(Color color);
  Color getColor();
  void setFillColor(Color fillColor);
  Color getFillColor();
  /* redraw the shape on the canvas */
  void draw(Canvas paintCanvas);
  /* create a deep clone of the shape */
  Object clone() throws CloneNotSupportedException;
}
