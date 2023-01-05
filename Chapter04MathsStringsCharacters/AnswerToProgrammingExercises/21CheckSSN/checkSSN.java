import java.util.*;
public class checkSSN 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean stillGood = true;
        System.out.print("Please enter the SSN: ");
        String theSSN = kb.nextLine();
        kb.close();

        //System.out.println(Character.isDigit(theSSN.charAt(0)));

        if (theSSN.length() != 11)
        stillGood = false;
        else
        {
            for (int i = 0; i < theSSN.length() ; i++)
            {
                System.out.println(stillGood);
                //System.out.println(i >= 0 && i <= 2 && Character.isDigit(theSSN.charAt(i)));
                if (i >= 0 && i <= 2 && Character.isDigit(theSSN.charAt(i)));
                else
                stillGood = false;

                //System.out.println(i == 3 && theSSN.charAt(i)!='-');
                if ( i == 3 && theSSN.charAt(i)!='-')
                stillGood = false;

                //System.out.println(i >= 4 && i <= 5 && Character.isDigit(Character.valueOf(theSSN.charAt(i))));
                if (i >= 4 && i <= 5 && Character.isDigit(Character.valueOf(theSSN.charAt(i))))
                ;
                else
                stillGood = false;

                //System.out.println(i == 6 && theSSN.charAt(i)!='-');
                if ( i == 6 && theSSN.charAt(i)!='-')
                stillGood = false;

                //System.out.println(i >= 7 && i <= 10 && Character.isDigit(Character.valueOf(theSSN.charAt(i))));
                if (i >= 7 && i <= 10 && Character.isDigit(Character.valueOf(theSSN.charAt(i))))
                ;
                else
                stillGood = false;
                
            }
        }

        if(stillGood)
        System.out.println(theSSN+" is a valid social security number.");
        else
        System.out.println(theSSN+" is an invalid social security number.");
    }
    
}
