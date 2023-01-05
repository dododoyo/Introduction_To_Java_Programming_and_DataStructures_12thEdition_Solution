public class randomPointsOnCircle 
{
    public static void main(String[] args)
    {
        // Generate the random points
        double x1 = randomX(),x2 = randomX(),x3 = randomX();
        double y1 = randomY(),y2 = randomY(),y3 = randomY();

        // Get sides length
        double a = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
        double b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
        double c = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        // Get each angle
        double A = Math.acos((Math.pow(a,2)- Math.pow(b,2)-Math.pow(c,2))/(-2*b*c));
        double B = Math.acos((Math.pow(b,2)- Math.pow(a,2)-Math.pow(c,2))/(-2*a*c));
        double C = Math.acos((Math.pow(c,2)- Math.pow(a,2)-Math.pow(b,2))/(-2*b*a));

        // Convert each angle to degree
        A = Math.toDegrees(A);
        B = Math.toDegrees(B);
        C = Math.toDegrees(C);

        //Display each angle
        System.out.println("The first angle is: " + A);
        System.out.println("The second angle is: " + B);
        System.out.println("The third angle is: " + C);
        
        // Their sum must be 180 degree since they for a triangle
        System.out.printf("\nThe sum of the angles is: %.3f",(A+B+C));
    }
    public static double randomX()
    {
        return 40*Math.cos(Math.random() * Math.PI * 2);
    }

    public static double randomY()
    {
        return 40*Math.sin(Math.random() * Math.PI * 2);
    }
}

