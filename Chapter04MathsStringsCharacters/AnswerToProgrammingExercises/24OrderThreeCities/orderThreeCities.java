import java.util.*;
public class orderThreeCities 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);   
        System.out.print("Enter the first city: ");
        String firstCity = kb.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = kb.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = kb.nextLine();

        kb.close();

        if (firstCity.compareTo(thirdCity)>=0 && (firstCity.compareTo(secondCity))>=0)
        {
            if(secondCity.compareTo(thirdCity) > 0)
            System.out.println("The three cities in alphabetical order are " + thirdCity + " " + secondCity + " " + firstCity);
            else
            System.out.println("The three cities in alphabetical order are " + secondCity + " " + thirdCity + " " + firstCity);

        }
        else if (secondCity.compareTo(firstCity)>=0 && (secondCity.compareTo(thirdCity))>=0)
        {
            if(firstCity.compareTo(thirdCity) > 0)
            System.out.println("The three cities in alphabetical order are " + thirdCity + " " + firstCity + " " + secondCity);
            else
            System.out.println("The three cities in alphabetical order are " + firstCity + " " + thirdCity + " " + secondCity);

        }
        else if (thirdCity.compareTo(firstCity)>=0 && (thirdCity.compareTo(secondCity))>=0)
        {
            if(firstCity.compareTo(secondCity) > 0)
            System.out.println("The three cities in alphabetical order are " + secondCity + " " + firstCity + " " + thirdCity);
            else
            System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);

        }
    }
    
}
