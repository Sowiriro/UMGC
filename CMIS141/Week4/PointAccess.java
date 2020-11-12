/*
* File: PointAccess.java
* Author: Dr. Robertson
* Date: January 1, 2015
* Purpose: This program constructs instances * of the Point class and uses
* its methods
*/
public class PointAccess {
    private double x;
    public double y;
    // Constructor
    public PointAccess (double px, double py) {
        x = px;
        y = py; }
   // Default constructor
    public PointAccess () {
x = 0.0;
y = 0.0; }
    // Setter methods
    // setX
    public void setX(double px) {
x = px; }
    // setY()
   public void setY(double py)  {
y = py; }
6
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
private double getDistance(PointAccess p1, PointAccess p2) {
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