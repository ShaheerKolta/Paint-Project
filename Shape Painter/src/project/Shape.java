package project;

/**
 * Created by Mohamed Abdelrehim on 3/10/2017.
 */

import java.util.Map;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public abstract class Shape implements ShapeInterface {
  protected Point2D position;
  protected Map<String, Double> properties;
  protected Color color;
  protected  Color fillColor;

  public void setPosition(Point2D position) {
    this.position = position;
  }

  public Point2D getPosition() {
    return this.position;
  }

  public void setProperties(Map<String, Double> properties) {
    this.properties = properties;
  }

  public Map<String, Double> getProperties() {
    return this.properties;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public void setFillColor(Color fillColor) {
    this.fillColor = fillColor;
  }

  public Color getFillColor() {
    return this.fillColor;
  }

  public void draw (Canvas paintCanvas) {

  }

  // i really don't understand how does this method work
  public Object clone()throws CloneNotSupportedException {
    return super.clone();
  }
}
