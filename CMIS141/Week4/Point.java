package CMIS141.Week4;

public class Point {
    private double x;
    private double y;
    // Constructor
    public Point (double px, double py) {
x = px;
y = py; }
   // Default constructor
    public Point () {
x = 0.0;
y = 0.0; }
    // Setter methods
    // setX
    public void setX(double px) {
x = px; }
    // setY()
   public void setY(double py)  {
y = py; }
   // Getter methods
   // getX
    public double getX() {
      return x;
    }
    // getY
    public double getY() {
return y; }
// Use Math method to get the distance
// between 2 points
public double getDistance(Point p1, Point p2) {
// delta x
double deltaX = Math.abs(p1.getX() - p2.getX()); // delta y
double deltaY = Math.abs(p1.getY() - p2.getY());
// Distance formula
double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY); return distance;
}
    // toString method
    public String toString() {
String str = "(" + x + ", " + y + ")";
return str; }
}
