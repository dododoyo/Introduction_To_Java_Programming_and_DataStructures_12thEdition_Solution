import java.util.*;
public class areaOfPentagon 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter length from center to vertex: ");
        double radius = kb.nextDouble();
        double s = 2*radius*Math.sin((Math.PI)/5);
        double area = (5*s*s)/(4*Math.tan((Math.PI)/5));
        System.out.printf("The area of the pentagon is %,.2f\n",area);
        kb.close();
    }
    
}
