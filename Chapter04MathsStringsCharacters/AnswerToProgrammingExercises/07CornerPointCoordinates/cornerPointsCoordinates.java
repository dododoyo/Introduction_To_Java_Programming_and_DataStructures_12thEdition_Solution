import java.util.*;
public class cornerPointsCoordinates 
{
    public static void main(String[] args)
    {
        Scanner kb  = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        double r = kb.nextDouble();

        double x1 = xCoordinates(18, r);
        double x2 = xCoordinates(90, r);
        double x3 = xCoordinates(162, r);
        double x4 = xCoordinates(234, r);
        double x5 = xCoordinates(306, r);

        double y1 = yCoordinates(18, r);
        double y2 = yCoordinates(90, r);
        double y3 = yCoordinates(162, r);
        double y4 = yCoordinates(234, r);
        double y5 = yCoordinates(306, r);

        System.out.println("\nThe points are: \n");
        System.out.printf("(%.2f, %.2f)\n",x1,y1);
        System.out.printf("(%.2f, %.2f)\n",x2,y2);
        System.out.printf("(%.2f, %.2f)\n",x3,y3);
        System.out.printf("(%.2f, %.2f)\n",x4,y4);
        System.out.printf("(%.2f, %.2f)\n",x5,y5);
        
        kb.close();
    }
    public static double xCoordinates(double degrees,double radius)
    {
        return radius*Math.cos(Math.toRadians(degrees));
    }

    public static double yCoordinates(double degrees,double radius)
    {
        return radius*Math.sin(Math.toRadians(degrees));
    }
    
}