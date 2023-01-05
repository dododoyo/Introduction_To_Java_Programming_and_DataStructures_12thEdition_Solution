import java.util.*;
public class areaOfPolygon 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the number of sides: ");
        int sides = kb.nextInt();
        System.out.print("Please enter the side length: ");
        double eachSide = kb.nextDouble();
        double Area = (sides*eachSide*eachSide)/(4*Math.tan(Math.PI/sides));
        System.out.println("The area of the polygon is: "+Area);
        kb.close();
    }
    
}
