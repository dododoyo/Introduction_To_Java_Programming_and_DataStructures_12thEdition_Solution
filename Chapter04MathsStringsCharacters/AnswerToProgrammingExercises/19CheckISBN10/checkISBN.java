import java.util.*;
public class checkISBN 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of the ISBN: ");
        String theISBN = kb.nextLine();

        if(checkNumber(theISBN))
        theISBN += "X";
        else
        theISBN += "1";

        System.out.println("The ISBN-10 number is "+theISBN);

        kb.close();
    }
    public static boolean checkNumber(String theISBN)
    {
        int stringLength = theISBN.length();
        int sum = 0;
        int multiplier = 1;

        for(int i = 0; i < stringLength ; i++)
        {
            sum += (Integer.parseInt(String.valueOf(theISBN.charAt(i))))*multiplier;
            multiplier++;
        }

        if(sum%11 == 10)
        return true;
        else
        return false; 
    }
    
}
