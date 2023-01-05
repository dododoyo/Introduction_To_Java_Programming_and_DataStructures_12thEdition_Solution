import java.util.*;
public class greatCircleDistance 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        // Get the two points
        double radius = 6371.01;
        System.out.print("Please enter (latitude and longitude) of point 1 in degrees : ");
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        
        System.out.print("Please enter (latitude and longitude) of point 2 in degrees : ");
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();
        kb.close();
         
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y1);
        System.out.println(y2);

        // From the formula we have
        double d = radius * Math.acos((Math.sin(Math.toRadians(x1))) * Math.sin(Math.toRadians(x2)) + (Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2))));
        System.out.println("\nThe distance between the two point is "+d+" km");


    }
    
}
