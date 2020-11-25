package CMIS141.Week4;

public class TestPoint {
    public static void main(String[] args)  {
// Construct a point with 1.0, 1.0 
        Point p1 = new Point(1.0,1.0);
// Construct a default point 
        Point p2 = new Point();
// Call the getter methods
        double p1X = p1.getX();
        double p1Y = p1.getY();
// Print results 
        System.out.println("p1 values from getX() getY() " + p1X + "," + p1Y);
        double p2X = p2.getX();
        double p2Y = p2.getY();
// Print results
        System.out.println("p2 values from getX() getY() " +
                       p2X + "," + p2Y);
// Call the Distance Method
        double distance = p1.getDistance(p1,p2);
// Print results
        System.out.println("Distance between p1 and p2 is: " +
                       distance);
// Change the XY value of P1
// Using the setter method double newX = 2.0;
        double newY = 2.0;

        p1.setY(newY);
// Recalculate the Distance
        distance = p1.getDistance(p1,p2);
// Print results
        System.out.println("New Distance between p1 and p2 is: " + distance);
// Display the values using toString 
    System.out.println(p1.toString()); 
    System.out.println(p2.toString());
    } 
}

