import java.util.*;
public class monetaryUnits 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the amount of the money: ");
        String theMoney =kb.nextLine();
        int indexOfDot = theMoney.indexOf(".");
        String dollar = theMoney.substring(0, indexOfDot);
        String cent = theMoney.substring(indexOfDot+1,theMoney.length());
        System.out.println("The total dollar amount is " +dollar);
        System.out.println("The total amount of cent is " +cent);
        kb.close();
    }
    
}
