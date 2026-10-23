/**
 * A rectangle with a width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return width times height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales this rectangle by {@code factor}, multiplying width and height.
   *
   * @param factor the scale factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than {@code other}.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle's area is greater than other's
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
