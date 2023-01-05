import java.util.*;
public class areaOfHexagon
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = kb.nextDouble();
        double Area = (6*side*side)/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the hexagon is %.2f",Area);
        kb.close();
    }
}